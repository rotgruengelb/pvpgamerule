package net.rotgruengelb.pvpgamerule;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class PvPGamerule implements ModInitializer {

	public static GameRules.Key<GameRules.BooleanRule> PVP;

	@Override
	public void onInitialize() {
		PVP = GameRuleRegistry.register("pvp", GameRules.Category.PLAYER, GameRuleFactory.createBooleanRule(true));
	}
}
