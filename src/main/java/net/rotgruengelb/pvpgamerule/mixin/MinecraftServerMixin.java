package net.rotgruengelb.pvpgamerule.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.rotgruengelb.pvpgamerule.PvPGamerule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {

	@Shadow public abstract GameRules getGameRules();

	@Inject(at = @At("HEAD"), method = "isPvpEnabled", cancellable = true)
	private void isPvpEnabled(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(getGameRules().get(PvPGamerule.PVP).get());
	}
}
