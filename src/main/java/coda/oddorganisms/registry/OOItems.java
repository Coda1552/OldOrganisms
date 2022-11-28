package coda.oddorganisms.registry;

import coda.oddorganisms.OddOrganisms;
import coda.oddorganisms.common.items.DoedicurusChestplateItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OOItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OddOrganisms.MOD_ID);
    public static final CreativeModeTab GROUP = new CreativeModeTab(OddOrganisms.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CENOZOIC_FOSSIL.get());
        }
    };

    public static final RegistryObject<Item> DOEDICURUS_CHESTPLATE = ITEMS.register("doedicurus_chestplate", DoedicurusChestplateItem::new);
    public static final RegistryObject<Item> DOEDICURUS_OSTEODERM = ITEMS.register("doedicurus_osteoderm", () -> new Item(new Item.Properties().tab(GROUP)));
    public static final RegistryObject<Item> DAWN_HORSE_FLASK = ITEMS.register("dawn_horse_flask", () -> new Item(new Item.Properties().tab(GROUP)));
    public static final RegistryObject<Item> DOEDICURUS_FLASK = ITEMS.register("doedicurus_flask", () -> new Item(new Item.Properties().tab(GROUP)));

    public static final RegistryObject<Item> DAWN_HORSE_EMBRYO = ITEMS.register("dawn_horse_embryo", () -> new Item(new Item.Properties().tab(GROUP)));
    public static final RegistryObject<Item> DOEDICURUS_EMBRYO = ITEMS.register("doedicurus_embryo", () -> new Item(new Item.Properties().tab(GROUP)));

    public static final RegistryObject<Item> DAWN_HORSE_SPAWN_EGG = ITEMS.register("dawn_horse_spawn_egg", () -> new ForgeSpawnEggItem(OOEntities.DAWN_HORSE, 0xb89268, 0xffe5b1, new Item.Properties().tab(GROUP)));
    public static final RegistryObject<Item> DOEDICURUS_SPAWN_EGG = ITEMS.register("doedicurus_spawn_egg", () -> new ForgeSpawnEggItem(OOEntities.DOEDICURUS, 0x694628, 0x926f40, new Item.Properties().tab(GROUP)));

    public static final RegistryObject<Item> CENOZOIC_FOSSIL = ITEMS.register("cenozoic_fossil", () -> new Item(new Item.Properties().tab(GROUP)));
    public static final RegistryObject<Item> TERRACOTTA_FOSSIL = ITEMS.register("terracotta_fossil", () -> new BlockItem(OOBlocks.TERRACOTTA_FOSSIL.get(), new Item.Properties().tab(GROUP)));
}
