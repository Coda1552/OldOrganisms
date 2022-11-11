package coda.oddorganisms.registry;

import coda.oddorganisms.OddOrganisms;
import coda.oddorganisms.common.entities.DawnHorse;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OOEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, OddOrganisms.MOD_ID);

    public static final RegistryObject<EntityType<DawnHorse>> DAWN_HORSE = ENTITIES.register("dawn_horse", () -> EntityType.Builder.of(DawnHorse::new, MobCategory.CREATURE).sized(0.5F, 0.5F).build("dawn_horse"));
}