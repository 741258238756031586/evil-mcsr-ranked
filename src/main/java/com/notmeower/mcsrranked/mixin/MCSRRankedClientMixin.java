package com.notmeower.mcsrranked.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "com.mcsrranked.client.MCSRRankedClient")
public class MCSRRankedClientMixin {

    @Inject(method = "onInitializeClient", at = @At("TAIL"), remap = false)
    private void onInitClient(CallbackInfo ci) {
        // do something later on maybe
    }
}
