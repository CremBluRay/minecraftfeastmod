package com.github.crembluray.minecraftfeastmod.items.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CookedBacon extends Item {

    public CookedBacon() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(0.7f)
                        .meat()
                        .build())
        );
    }

}
