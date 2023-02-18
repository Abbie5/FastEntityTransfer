package com.christofmeg.fastentitytransfer;

import com.christofmeg.fastentitytransfer.common.event.FactorioFastEntitytransferEvent;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class FastEntityTransfer implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        AttackBlockCallback.EVENT.register(FactorioFastEntitytransferEvent.INSTANCE);
    }
}