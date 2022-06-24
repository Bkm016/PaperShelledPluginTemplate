package cn.apisium.example.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {

    @Inject(method = "getServerModName", at = @At("RETURN"), cancellable = true, remap = false)
    public void getServerModName(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("PaperShelled");
    }
}
