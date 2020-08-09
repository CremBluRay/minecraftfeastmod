package com.github.crembluray.minecraftfeastmod.client.render;

import com.github.crembluray.minecraftfeastmod.FeastMod;
import com.github.crembluray.minecraftfeastmod.client.model.TurkeyModel;
import com.github.crembluray.minecraftfeastmod.entities.TurkeyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class TurkeyRenderer extends MobRenderer<TurkeyEntity, TurkeyModel<TurkeyEntity>> {

    protected static final ResourceLocation texture = new ResourceLocation(FeastMod.MOD_ID, "textures/entity/turkey.png");

    public TurkeyRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TurkeyModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(TurkeyEntity entity) {
        return texture;
    }

    protected float handleRotationFloat(TurkeyEntity livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
}
