package com.github.crembluray.minecraftfeastmod.client.model;

import com.github.crembluray.minecraftfeastmod.entities.TurkeyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class TurkeyModel<T extends TurkeyEntity> extends EntityModel<T> {

    private final ModelRenderer body;
    private final ModelRenderer leftWing;
    private final ModelRenderer rightWing;
    private final ModelRenderer feathers;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;
    private final ModelRenderer feathersBottom;
    private final ModelRenderer head;
    private final ModelRenderer beak;
    private final ModelRenderer Gizzard;

    public TurkeyModel() {
        textureWidth = 64;
        textureHeight = 32;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 16.0F, 0.0F);
        setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
        body.setTextureOffset(0, 9).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

        leftWing = new ModelRenderer(this);
        leftWing.setRotationPoint(4.0F, 13.0F, 0.0F);
        leftWing.setTextureOffset(24, 13).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        rightWing = new ModelRenderer(this);
        rightWing.setRotationPoint(-4.0F, 13.0F, 0.0F);
        rightWing.setTextureOffset(24, 13).addBox(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        feathers = new ModelRenderer(this);
        feathers.setRotationPoint(-0.1F, 9.7F, 4.5F);
        feathers.setTextureOffset(40, 0).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 6.0F, 1.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(1.0F, 19.0F, 1.0F);
        leftLeg.setTextureOffset(26, 0).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(-2.0F, 19.0F, 1.0F);
        rightLeg.setTextureOffset(26, 0).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

        feathersBottom = new ModelRenderer(this);
        feathersBottom.setRotationPoint(-0.1F, 15.7F, 4.5F);
        feathersBottom.setTextureOffset(40, 10).addBox(-3.5F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 15.0F, -4.0F);
        head.setTextureOffset(0, 0).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

        beak = new ModelRenderer(this);
        beak.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.addChild(beak);
        beak.setTextureOffset(14, 0).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        Gizzard = new ModelRenderer(this);
        Gizzard.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.addChild(Gizzard);
        Gizzard.setTextureOffset(14, 4).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.feathers.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.25f * limbSwingAmount;
        this.rightWing.rotateAngleZ = ageInTicks;
        this.leftWing.rotateAngleZ = -ageInTicks;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        leftWing.render(matrixStack, buffer, packedLight, packedOverlay);
        rightWing.render(matrixStack, buffer, packedLight, packedOverlay);
        feathers.render(matrixStack, buffer, packedLight, packedOverlay);
        leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        feathersBottom.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
