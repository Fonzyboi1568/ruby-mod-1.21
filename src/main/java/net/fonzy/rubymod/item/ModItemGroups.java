package net.fonzy.rubymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fonzy.rubymod.RubyMod;
import net.fonzy.rubymod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(RubyMod.MOD_ID, "ruby_items"),
        FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
            .displayName(Text.translatable("itemgroup.rubymod.ruby_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.RUBY);
                entries.add(ModItems.RUBY_SHARD);
            }).build());
    public static final ItemGroup RUBY_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(RubyMod.MOD_ID, "ruby_blocks"),
        FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK))
            .displayName(Text.translatable("itemgroup.rubymod.ruby_blocks"))
            .entries((displayContext, entries) -> {
                entries.add(ModBlocks.RUBY_BLOCK);
                entries.add(ModBlocks.RUBY_CRYSTAL);
            }).build());

    public static void registerItemGroups() {
        RubyMod.LOGGER.info("Registering Item Groups for " + RubyMod.MOD_ID);
    }
}
