package com.lost.dystopiaworldgen.world.gen;

import java.util.Random;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.StructureOceanMonument;
import net.minecraft.world.gen.structure.WoodlandMansion;

public class ChunkGeneratorDystopia extends ChunkGeneratorOverworld {
	
	private final Random rand;
	private final World world;
	private final boolean mapFeaturesEnabled;
	private ChunkGeneratorSettings settings;
	private IBlockState oceanBlock = Blocks.WATER.getDefaultState();
	private MapGenBase caveGenerator = new MapGenCaves();
    private MapGenStronghold strongholdGenerator = new MapGenStronghold();
    private MapGenVillage villageGenerator = new MapGenVillage();
    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    private MapGenBase ravineGenerator = new MapGenRavine();
    private StructureOceanMonument oceanMonumentGenerator = new StructureOceanMonument();
    private WoodlandMansion woodlandMansionGenerator = new WoodlandMansion(this);
	
	
	public ChunkGeneratorDystopia(World worldIn, long seed, boolean mapFeaturesEnabledIn, String generatorOptions) {
		super(worldIn, seed, mapFeaturesEnabledIn, generatorOptions);
		// TODO Auto-generated constructor stub
		this.rand = new Random(seed);
		this.world = worldIn;
		this.mapFeaturesEnabled = mapFeaturesEnabledIn;
		
		if (generatorOptions != null)
        {
            this.settings = ChunkGeneratorSettings.Factory.jsonToFactory(generatorOptions).build();
            this.oceanBlock = this.settings.useLavaOceans ? Blocks.LAVA.getDefaultState() : Blocks.WATER.getDefaultState();
            worldIn.setSeaLevel(this.settings.seaLevel);
        }
	}
	
	@Override
	public void populate(int x, int z) {
		{
	        BlockFalling.fallInstantly = true;
	        int i = x * 16;
	        int j = z * 16;
	        BlockPos blockpos = new BlockPos(i, 0, j);
	        Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));
	        this.rand.setSeed(this.world.getSeed());
	        long k = this.rand.nextLong() / 2L * 2L + 1L;
	        long l = this.rand.nextLong() / 2L * 2L + 1L;
	        this.rand.setSeed((long)x * k + (long)z * l ^ this.world.getSeed());
	        boolean flag = false;
	        ChunkPos chunkpos = new ChunkPos(x, z);

	        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, this.world, this.rand, x, z, flag);

	        if (this.mapFeaturesEnabled)
	        {
	            if (this.settings.useMineShafts)
	            {
	                this.mineshaftGenerator.generateStructure(this.world, this.rand, chunkpos);
	            }

	            if (this.settings.useVillages)
	            {
	                flag = this.villageGenerator.generateStructure(this.world, this.rand, chunkpos);
	            }

	            if (this.settings.useStrongholds)
	            {
	                this.strongholdGenerator.generateStructure(this.world, this.rand, chunkpos);
	            }

	            if (this.settings.useTemples)
	            {
	                this.scatteredFeatureGenerator.generateStructure(this.world, this.rand, chunkpos);
	            }

	            if (this.settings.useMonuments)
	            {
	                this.oceanMonumentGenerator.generateStructure(this.world, this.rand, chunkpos);
	            }

	            if (this.settings.useMansions)
	            {
	                this.woodlandMansionGenerator.generateStructure(this.world, this.rand, chunkpos);
	            }
	        }

	        if (biome != Biomes.DESERT && biome != Biomes.DESERT_HILLS && this.settings.useWaterLakes && !flag && this.rand.nextInt(this.settings.waterLakeChance) == 0)
	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE))
	        {
	            int i1 = this.rand.nextInt(16) + 8;
	            int j1 = this.rand.nextInt(256);
	            int k1 = this.rand.nextInt(16) + 8;
	            (new WorldGenLakes(Blocks.WATER)).generate(this.world, this.rand, blockpos.add(i1, j1, k1));
	        }

	        if (!flag && this.rand.nextInt(this.settings.lavaLakeChance / 10) == 0 && this.settings.useLavaLakes)
	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA))
	        {
	            int i2 = this.rand.nextInt(16) + 8;
	            int l2 = this.rand.nextInt(this.rand.nextInt(248) + 8);
	            int k3 = this.rand.nextInt(16) + 8;

	            if (l2 < this.world.getSeaLevel() || this.rand.nextInt(this.settings.lavaLakeChance / 8) == 0)
	            {
	                (new WorldGenLakes(Blocks.LAVA)).generate(this.world, this.rand, blockpos.add(i2, l2, k3));
	            }
	        }

	        if (this.settings.useDungeons)
	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.DUNGEON))
	        {
	            for (int j2 = 0; j2 < this.settings.dungeonChance; ++j2)
	            {
	                int i3 = this.rand.nextInt(16) + 8;
	                int l3 = this.rand.nextInt(256);
	                int l1 = this.rand.nextInt(16) + 8;
	                (new WorldGenDungeons()).generate(this.world, this.rand, blockpos.add(i3, l3, l1));
	            }
	        }

	        biome.decorate(this.world, this.rand, new BlockPos(i, 0, j));
	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS))
	        WorldEntitySpawner.performWorldGenSpawning(this.world, biome, i + 8, j + 8, 16, 16, this.rand);
	        blockpos = blockpos.add(8, 0, 8);

	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ICE))
	        {
	        for (int k2 = 0; k2 < 16; ++k2)
	        {
	            for (int j3 = 0; j3 < 16; ++j3)
	            {
	                BlockPos blockpos1 = this.world.getPrecipitationHeight(blockpos.add(k2, 0, j3));
	                BlockPos blockpos2 = blockpos1.down();

	                if (this.world.canBlockFreezeWater(blockpos2))
	                {
	                    this.world.setBlockState(blockpos2, Blocks.ICE.getDefaultState(), 2);
	                }

	                if (this.world.canSnowAt(blockpos1, true))
	                {
	                    this.world.setBlockState(blockpos1, Blocks.SNOW_LAYER.getDefaultState(), 2);
	                }
	            }
	        }
	        }//Forge: End ICE

	        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, this.world, this.rand, x, z, flag);

	        BlockFalling.fallInstantly = false;
	    }
	}
}
