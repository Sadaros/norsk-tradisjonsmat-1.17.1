package net.sadaros.norsk_tradisjonsmat.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sadaros.norsk_tradisjonsmat.NorskTradisjonsmat;

public class ModItems {


    public static final Item PINNEKJOTT = registerItem("pinnekjott",
            new Item(new FabricItemSettings()
                    .food(
                            new FoodComponent.Builder().hunger(8).saturationModifier(2.0f).build()
                    )
                    .group(ModItemGroup.PINNEKJOTT)));
    
    public static final Item RAW_PINNEKJOTT = registerItem("raw_pinnekjott",
            new Item(new FabricItemSettings()
                    .food(
                            new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build()
                    )
                    .group(ModItemGroup.PINNEKJOTT)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(NorskTradisjonsmat.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NorskTradisjonsmat.LOGGER.info("Registering Mod Items for " + NorskTradisjonsmat.MOD_ID);
    }
}
