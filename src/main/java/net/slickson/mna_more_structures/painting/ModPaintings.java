package net.slickson.mna_more_structures.painting;

import net.minecraftforge.registries.RegistryObject;
import net.slickson.mna_more_structures.Mna_more_structures;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Mna_more_structures.MODID);

    public static final RegistryObject<PaintingVariant> ASTROBLADE = PAINTING_VARIANTS.register("astroblade",
            () -> new PaintingVariant(16,32));
    public static final RegistryObject<PaintingVariant> MALUS = PAINTING_VARIANTS.register("malus",
            () -> new PaintingVariant(16,32));
    public static final RegistryObject<PaintingVariant> COUNCIL_SKY_TOWER = PAINTING_VARIANTS.register("council_sky_tower",
            () -> new PaintingVariant(32,32));

    public static void register(IEventBus eventBus){
        PAINTING_VARIANTS.register(eventBus);
    }
}
