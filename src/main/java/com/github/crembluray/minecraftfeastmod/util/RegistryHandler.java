package com.github.crembluray.minecraftfeastmod.util;

import com.github.crembluray.minecraftfeastmod.FeastMod;
import com.github.crembluray.minecraftfeastmod.blocks.BlockItemBase;
import com.github.crembluray.minecraftfeastmod.blocks.CornCrop;
import com.github.crembluray.minecraftfeastmod.blocks.TurkeyBlock;
import com.github.crembluray.minecraftfeastmod.entities.TurkeyEntity;
import com.github.crembluray.minecraftfeastmod.items.ModSpawnEggItem;
import com.github.crembluray.minecraftfeastmod.items.food.*;
import com.github.crembluray.minecraftfeastmod.items.food.effect.Dough;
import com.github.crembluray.minecraftfeastmod.items.food.effect.RawBacon;
import com.github.crembluray.minecraftfeastmod.items.food.effect.RawTurkey;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FeastMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FeastMod.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, FeastMod.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FeastMod.MOD_ID);

    public static void init() {
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Sounds
    public static final RegistryObject<SoundEvent> TURKEY_AMBIENT = SOUNDS.register("ambient",
            () -> new SoundEvent(new ResourceLocation(FeastMod.MOD_ID, "ambient")));
    public static final RegistryObject<SoundEvent> TURKEY_HURT = SOUNDS.register("hurt",
            () -> new SoundEvent(new ResourceLocation(FeastMod.MOD_ID, "hurt")));

    // Items
    public static final RegistryObject<BreadRoll> BREAD_ROLL = ITEMS.register("bread_roll", BreadRoll::new);
    public static final RegistryObject<Dough> DOUGH = ITEMS.register("dough", Dough::new);
    public static final RegistryObject<RawTurkey> RAW_TURKEY = ITEMS.register("raw_turkey", RawTurkey::new);
    public static final RegistryObject<Burger> BURGER = ITEMS.register("burger", Burger::new);
    public static final RegistryObject<CookedBacon> COOKED_BACON = ITEMS.register("cooked_bacon", CookedBacon::new);
    public static final RegistryObject<Corn> CORN = ITEMS.register("corn", Corn::new);
    public static final RegistryObject<Pancakes> PANCAKES = ITEMS.register("pancakes", Pancakes::new);
    public static final RegistryObject<RawBacon> RAW_BACON = ITEMS.register("raw_bacon", RawBacon::new);
    public static final RegistryObject<Yeast> YEAST = ITEMS.register("yeast", Yeast::new);
    public static final RegistryObject<Flour> FLOUR = ITEMS.register("flour", Flour::new);

    // Blocks
    public static final RegistryObject<Block> TURKEY_BLOCK = BLOCKS.register("turkey_block", TurkeyBlock::new);
    public static final RegistryObject<Block> CORN_CROP = BLOCKS.register("corn_crop", () -> new CornCrop(Block.Properties.from(Blocks.WHEAT)));

    // Block Items
    public static final RegistryObject<Item> TURKEY_BLOCK_ITEM = ITEMS.register("turkey_block", () -> new BlockItemBase(TURKEY_BLOCK.get()));
    public static final RegistryObject<Item> CORN_SEED_ITEM = ITEMS.register("corn_seeds", () -> new BlockItemBase(CORN_CROP.get()));

    // Entity Types
    public static final RegistryObject<EntityType<TurkeyEntity>> TURKEY = ENTITY_TYPES.register("turkey",
            () -> EntityType.Builder.create(TurkeyEntity::new, EntityClassification.CREATURE)
                    .size(0.4f, 0.7f)
                    .build(new ResourceLocation(FeastMod.MOD_ID, "turkey").toString()));

    // Spawn Eggs
    public static final RegistryObject<ModSpawnEggItem> TURKEY_SPAWN_EGG = ITEMS.register("turkey_spawn_egg", () -> new ModSpawnEggItem(TURKEY, 0x747474, 0xff2a2a, new Item.Properties().group(ItemGroup.MATERIALS)));
}
