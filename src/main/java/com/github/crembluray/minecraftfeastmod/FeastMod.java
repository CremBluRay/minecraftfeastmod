package com.github.crembluray.minecraftfeastmod;

import com.github.crembluray.minecraftfeastmod.entities.TurkeyEntity;
import com.github.crembluray.minecraftfeastmod.util.RegistryHandler;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("feastmod")
public class FeastMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "feastmod";

    public FeastMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(RegistryHandler.TURKEY.get(), TurkeyEntity.func_234187_eI_().create());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
