package br.com.vudureverso.vuduhopper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VuduHopperMod implements ModInitializer {

	public static final Block VUDU_HOPPER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		System.out.println("**** Registrando bloco vudu hopper ****");
		Registry.register(Registry.BLOCK, new Identifier("vudureverso", "vuduhopper"), VUDU_HOPPER_BLOCK);

		System.out.println("**** Registrando bloco vudu hopper como item ****");
		Registry.register(Registry.ITEM, new Identifier("vudureverso", "vuduhopper"), new BlockItem(VUDU_HOPPER_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

	}
}
