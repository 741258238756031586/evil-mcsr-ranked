package com.notmeower.mcsrranked.mixin;

import com.notmeower.mcsrranked.EvilMCSR;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Optional;
import java.util.Set;

@Mixin(targets = "com.mcsrranked.client.anticheat.file.verifiers.ModVerifier")
public class ModVerifierMixin {

    @Overwrite(remap = false)
    public Optional compareFiles(Object file, Set verifiableFiles) {
        EvilMCSR.LOGGER.info("disabling mod verification");
        return Optional.empty();
    }
}

