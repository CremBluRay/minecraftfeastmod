package com.github.crembluray.minecraftfeastmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockItemCrop extends BlockItem {
    public BlockItemCrop(Block blockIn) {
        super(blockIn, new Item.Properties().group(ItemGroup.MATERIALS));
    }
}
