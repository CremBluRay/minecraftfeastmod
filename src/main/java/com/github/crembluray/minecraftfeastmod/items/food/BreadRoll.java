package com.github.crembluray.minecraftfeastmod.items.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BreadRoll extends Item {

    public BreadRoll() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(0.3f)
                        .build())
        );
    }

}
