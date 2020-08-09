package com.github.crembluray.minecraftfeastmod.world.gen;

import com.github.crembluray.minecraftfeastmod.FeastMod;
import com.github.crembluray.minecraftfeastmod.util.RegistryHandler;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = FeastMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void spawnEntities(FMLLoadCompleteEvent event) {
        for(Biome biome : ForgeRegistries.BIOMES) {
            if(biome.getCategory() != Biome.Category.NETHER
               && biome.getCategory() != Biome.Category.THEEND
               && biome.getCategory() != Biome.Category.OCEAN) {
                biome.getSpawns(EntityClassification.CREATURE)
                        .add(new Biome.SpawnListEntry(RegistryHandler.TURKEY.get(), 10, 1, 3));
            }
        }
    }

}
