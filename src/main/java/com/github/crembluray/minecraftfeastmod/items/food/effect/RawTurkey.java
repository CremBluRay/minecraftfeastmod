package com.github.crembluray.minecraftfeastmod.items.food.effect;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RawTurkey extends Item {

    public RawTurkey() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(0.3f)
                        .effect(() -> new EffectInstance(Effects.HUNGER, 600, 0), 1)
                        .build())
        );
    }

}
