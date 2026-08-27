package net.slickson.mna_more_structures;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.slickson.mna_more_structures.ModItems.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "mna_more_structures");

    public static final RegistryObject<CreativeModeTab> PROTECTED_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("protected_blocks_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(TAB_ICON_ITEM.get())) // pick one representative item
                    .title(Component.translatable("creativetab.mna_more_structures.protected_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(PROTECTED_CHISELED_STONE_BRICKS.get());
                        output.accept(PROTECTED_COBBLESTONE.get());
                        output.accept(PROTECTED_CRACKED_STONE_BRICKS.get());
                        output.accept(PROTECTED_IRON_BARS.get());
                        output.accept(PROTECTED_MOSSY_COBBLESTONE.get());
                        output.accept(PROTECTED_MOSSY_COBBLESTONE_SLAB.get());
                        output.accept(PROTECTED_MOSSY_COBBLESTONE_STAIRS.get());
                        output.accept(PROTECTED_MOSSY_STONE_BRICK_SLAB.get());
                        output.accept(PROTECTED_MOSSY_STONE_BRICK_STAIRS.get());
                        output.accept(PROTECTED_MOSSY_STONE_BRICKS.get());
                        output.accept(PROTECTED_POLISHED_ANDESITE.get());
                        output.accept(PROTECTED_POLISHED_ANDESITE_SLAB.get());
                        output.accept(PROTECTED_POLISHED_ANDESITE_STAIRS.get());
                        output.accept(PROTECTED_STONE.get());
                        output.accept(PROTECTED_STONE_BRICK_SLAB.get());
                        output.accept(PROTECTED_STONE_BRICK_STAIRS.get());
                        output.accept(PROTECTED_STONE_BRICKS.get());

                    })
                    .build());

    public static void register(IEventBus modBus) {
        CREATIVE_MODE_TABS.register(modBus);
    }
}