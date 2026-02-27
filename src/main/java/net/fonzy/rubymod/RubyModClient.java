package net.fonzy.rubymod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fonzy.rubymod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class RubyModClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        // for transparent background
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_CRYSTAL, RenderLayer.getCutout());
    }

}
