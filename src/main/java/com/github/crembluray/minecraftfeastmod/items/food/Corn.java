package com.github.crembluray.minecraftfeastmod.items.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Corn extends Item {

    public Corn() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(0.8f)
                        .build())
        );
    }

}
