package net.fonzy.rubymod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fonzy.rubymod.RubyMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
        new Block(AbstractBlock.Settings.create().strength(5f)
        .requiresTool()
        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
        .mapColor(MapColor.RED)
        .pistonBehavior(PistonBehavior.NORMAL)
    ));
    
    public static final Block RUBY_CRYSTAL = registerBlock("ruby_crystal", 
        new Block(AbstractBlock.Settings.create()
        .strength(2.5f)
        .noCollision()
        .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
        .requiresTool()
        .mapColor(MapColor.RED)
        .nonOpaque()
        .luminance(state -> 5)
        .pistonBehavior(PistonBehavior.DESTROY)
    ));
    
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RubyMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RubyMod.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        RubyMod.LOGGER.info("Registering Mod Blocks for "+ RubyMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RUBY_BLOCK);
            entries.add(ModBlocks.RUBY_CRYSTAL);
        });
    }

}
