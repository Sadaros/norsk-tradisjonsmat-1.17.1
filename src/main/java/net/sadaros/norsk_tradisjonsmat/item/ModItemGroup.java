package net.sadaros.norsk_tradisjonsmat.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sadaros.norsk_tradisjonsmat.NorskTradisjonsmat;

public class ModItemGroup {
    public static final ItemGroup PINNEKJOTT = FabricItemGroupBuilder.build(
            new Identifier(NorskTradisjonsmat.MOD_ID, "pinnekjott"),
            () -> new ItemStack(ModItems.PINNEKJOTT));}
