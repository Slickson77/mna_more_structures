package net.slickson.mna_more_structures;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "mna_more_structures");

    private static BlockBehaviour.Properties indestructible(BlockBehaviour.Properties props) {
        return props.strength(-1.0F, 3600000.0F);
    }

    // ---- Full blocks ----
    public static final RegistryObject<Block> PROTECTED_STONE_BRICKS = BLOCKS.register("protected_stone_bricks",
            () -> new Block(indestructible(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS))));

    public static final RegistryObject<Block> PROTECTED_MOSSY_STONE_BRICKS = BLOCKS.register("protected_mossy_stone_bricks",
            () -> new Block(indestructible(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS))));

    public static final RegistryObject<Block> PROTECTED_CRACKED_STONE_BRICKS = BLOCKS.register("protected_cracked_stone_bricks",
            () -> new Block(indestructible(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS))));

    public static final RegistryObject<Block> PROTECTED_CHISELED_STONE_BRICKS = BLOCKS.register("protected_chiseled_stone_bricks",
            () -> new Block(indestructible(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS))));

    public static final RegistryObject<Block> PROTECTED_STONE = BLOCKS.register("protected_stone",
            () -> new Block(indestructible(BlockBehaviour.Properties.copy(Blocks.STONE))));

    public static final RegistryObject<Block> PROTECTED_COBBLESTONE = BLOCKS.register("protected_cobblestone",
            () -> new Block(indestructible(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> PROTECTED_MOSSY_COBBLESTONE = BLOCKS.register("protected_mossy_cobblestone",
            () -> new Block(indestructible(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE))));

    public static final RegistryObject<Block> PROTECTED_POLISHED_ANDESITE = BLOCKS.register("protected_polished_andesite",
            () -> new Block(indestructible(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE))));

    // ---- Stairs ----
    public static final RegistryObject<Block> PROTECTED_STONE_BRICK_STAIRS = BLOCKS.register("protected_stone_brick_stairs",
            () -> new StairBlock(() -> PROTECTED_STONE_BRICKS.get().defaultBlockState(),
                    indestructible(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS))));

    public static final RegistryObject<Block> PROTECTED_MOSSY_STONE_BRICK_STAIRS = BLOCKS.register("protected_mossy_stone_brick_stairs",
            () -> new StairBlock(() -> PROTECTED_MOSSY_STONE_BRICKS.get().defaultBlockState(),
                    indestructible(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICK_STAIRS))));

    public static final RegistryObject<Block> PROTECTED_POLISHED_ANDESITE_STAIRS = BLOCKS.register("protected_polished_andesite_stairs",
            () -> new StairBlock(() -> PROTECTED_POLISHED_ANDESITE.get().defaultBlockState(),
                    indestructible(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_STAIRS))));

    public static final RegistryObject<Block> PROTECTED_MOSSY_COBBLESTONE_STAIRS = BLOCKS.register("protected_mossy_cobblestone_stairs",
            () -> new StairBlock(() -> PROTECTED_MOSSY_COBBLESTONE.get().defaultBlockState(),
                    indestructible(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_STAIRS))));

    // ---- Slabs ----
    public static final RegistryObject<Block> PROTECTED_STONE_BRICK_SLAB = BLOCKS.register("protected_stone_brick_slab",
            () -> new SlabBlock(indestructible(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB))));

    public static final RegistryObject<Block> PROTECTED_MOSSY_STONE_BRICK_SLAB = BLOCKS.register("protected_mossy_stone_brick_slab",
            () -> new SlabBlock(indestructible(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICK_SLAB))));

    public static final RegistryObject<Block> PROTECTED_POLISHED_ANDESITE_SLAB = BLOCKS.register("protected_polished_andesite_slab",
            () -> new SlabBlock(indestructible(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_SLAB))));

    public static final RegistryObject<Block> PROTECTED_MOSSY_COBBLESTONE_SLAB = BLOCKS.register("protected_mossy_cobblestone_slab",
            () -> new SlabBlock(indestructible(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_SLAB))));

    // ---- Iron bars ----
    public static final RegistryObject<Block> PROTECTED_IRON_BARS = BLOCKS.register("protected_iron_bars",
            () -> new IronBarsBlock(indestructible(BlockBehaviour.Properties.copy(Blocks.IRON_BARS))));

}
