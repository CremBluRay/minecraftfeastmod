package com.github.crembluray.minecraftfeastmod.items.food.effect;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Dough extends Item {

    public Dough() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(0.3f)
                        .effect(() -> new EffectInstance(Effects.HUNGER, 300, 0), 1)
                        .build())
        );
    }
}
