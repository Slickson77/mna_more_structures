package net.slickson.mna_more_structures;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "mna_more_structures");

    public static final RegistryObject<Item> PROTECTED_STONE_BRICKS =
            ITEMS.register("protected_stone_bricks", () -> new BlockItem(ModBlocks.PROTECTED_STONE_BRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_MOSSY_STONE_BRICKS =
            ITEMS.register("protected_mossy_stone_bricks", () -> new BlockItem(ModBlocks.PROTECTED_MOSSY_STONE_BRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_CRACKED_STONE_BRICKS =
            ITEMS.register("protected_cracked_stone_bricks", () -> new BlockItem(ModBlocks.PROTECTED_CRACKED_STONE_BRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_CHISELED_STONE_BRICKS =
            ITEMS.register("protected_chiseled_stone_bricks", () -> new BlockItem(ModBlocks.PROTECTED_CHISELED_STONE_BRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_STONE =
            ITEMS.register("protected_stone", () -> new BlockItem(ModBlocks.PROTECTED_STONE.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_COBBLESTONE =
            ITEMS.register("protected_cobblestone", () -> new BlockItem(ModBlocks.PROTECTED_COBBLESTONE.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_MOSSY_COBBLESTONE =
            ITEMS.register("protected_mossy_cobblestone", () -> new BlockItem(ModBlocks.PROTECTED_MOSSY_COBBLESTONE.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_POLISHED_ANDESITE =
            ITEMS.register("protected_polished_andesite", () -> new BlockItem(ModBlocks.PROTECTED_POLISHED_ANDESITE.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_STONE_BRICK_STAIRS =
            ITEMS.register("protected_stone_brick_stairs", () -> new BlockItem(ModBlocks.PROTECTED_STONE_BRICK_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_MOSSY_STONE_BRICK_STAIRS =
            ITEMS.register("protected_mossy_stone_brick_stairs", () -> new BlockItem(ModBlocks.PROTECTED_MOSSY_STONE_BRICK_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_POLISHED_ANDESITE_STAIRS =
            ITEMS.register("protected_polished_andesite_stairs", () -> new BlockItem(ModBlocks.PROTECTED_POLISHED_ANDESITE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_MOSSY_COBBLESTONE_STAIRS =
            ITEMS.register("protected_mossy_cobblestone_stairs", () -> new BlockItem(ModBlocks.PROTECTED_MOSSY_COBBLESTONE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_STONE_BRICK_SLAB =
            ITEMS.register("protected_stone_brick_slab", () -> new BlockItem(ModBlocks.PROTECTED_STONE_BRICK_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_MOSSY_STONE_BRICK_SLAB =
            ITEMS.register("protected_mossy_stone_brick_slab", () -> new BlockItem(ModBlocks.PROTECTED_MOSSY_STONE_BRICK_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_POLISHED_ANDESITE_SLAB =
            ITEMS.register("protected_polished_andesite_slab", () -> new BlockItem(ModBlocks.PROTECTED_POLISHED_ANDESITE_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_MOSSY_COBBLESTONE_SLAB =
            ITEMS.register("protected_mossy_cobblestone_slab", () -> new BlockItem(ModBlocks.PROTECTED_MOSSY_COBBLESTONE_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROTECTED_IRON_BARS =
            ITEMS.register("protected_iron_bars", () -> new BlockItem(ModBlocks.PROTECTED_IRON_BARS.get(), new Item.Properties()));

    public static final RegistryObject<Item> TAB_ICON_ITEM = ITEMS.register("tab_icon_council_sky_tower",
            () -> new Item(new Item.Properties()));

}
