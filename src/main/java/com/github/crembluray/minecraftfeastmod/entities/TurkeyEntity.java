package com.github.crembluray.minecraftfeastmod.entities;

import com.github.crembluray.minecraftfeastmod.util.RegistryHandler;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;

import net.minecraft.world.World;

public class TurkeyEntity extends ChickenEntity {

    public TurkeyEntity(EntityType<? extends ChickenEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return RegistryHandler.TURKEY_AMBIENT.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return RegistryHandler.TURKEY_HURT.get();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return RegistryHandler.TURKEY_HURT.get();
    }

    @Override
    public ChickenEntity createChild(AgeableEntity ageable) {
        return RegistryHandler.TURKEY.get().create(this.world);
    }
}
