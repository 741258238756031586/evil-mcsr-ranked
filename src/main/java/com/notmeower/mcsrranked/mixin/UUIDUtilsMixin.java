package com.notmeower.mcsrranked.mixin;

import com.notmeower.mcsrranked.EvilMCSR;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.UUID;

@Mixin(targets = "com.mcsrranked.client.utils.UUIDUtils")
public class UUIDUtilsMixin {

    private static UUID xd = UUID.randomUUID();

    @Overwrite(remap = false)
    public static UUID getHardwareUUID() {
        EvilMCSR.LOGGER.info("sending over fake hwid, assigned " + xd);
        return xd;
    }
}
