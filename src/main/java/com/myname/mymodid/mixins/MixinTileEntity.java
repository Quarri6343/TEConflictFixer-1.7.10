package com.myname.mymodid.mixins;

import java.util.Map;

import net.minecraft.tileentity.TileEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(TileEntity.class)
public class MixinTileEntity {

    @Unique
    private static int teConflictFixer$idCount = 0;

    @Shadow
    private static Map nameToClassMap;

    @ModifyVariable(method = "addMapping", at = @At(value = "HEAD"), index = 1, argsOnly = true)
    private static String teConflictFixer$addMapping(String id) {
        if (nameToClassMap.containsKey(id)) {
            id = id + "_" + ++teConflictFixer$idCount;
        }

        return id;
    }
}
