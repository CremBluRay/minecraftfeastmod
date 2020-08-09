package com.github.crembluray.minecraftfeastmod.items.food.effect;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Taco extends Item {

    public Taco() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(0.8f)
                        .build())
        );
    }

}
