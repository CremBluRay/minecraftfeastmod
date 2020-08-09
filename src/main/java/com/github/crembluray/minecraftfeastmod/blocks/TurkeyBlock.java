package com.github.crembluray.minecraftfeastmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.material.Material;

public class TurkeyBlock extends CakeBlock {
    public TurkeyBlock() {
        super(AbstractBlock.Properties.create(Material.CAKE)
                .hardnessAndResistance(0.5f, 0.5f));
    }
}
