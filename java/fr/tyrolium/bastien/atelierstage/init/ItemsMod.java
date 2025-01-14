package fr.tyrolium.bastien.atelierstage.init;

import fr.tyrolium.bastien.atelierstage.Global;
import fr.tyrolium.bastien.atelierstage.items.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class ItemsMod {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    /* Nos Items */
    public static final Item TYROLIUM = new Tyrolium();

    public static final Item REAPER = new Reaper();

    public static final ItemSword TYROLIUM_SWORD = new TyroliumSword();
    public static final ItemPickaxe TYROLIUM_PICKAXE = new TyroliumPickaxe();
    public static final ItemHoe TYROLIUM_HOE = new TyroliumHoe();
    public static final ItemSpade TYROLIUM_SPADE = new TyroliumShovel();
    public static final ItemTool TYROLIUM_AXE = new TyroliumAxe();

    public static final ItemArmor TYROLIUM_HELMET = new TyroliumArmor(EntityEquipmentSlot.HEAD);
    public static final ItemArmor TYROLIUM_CHESTPLATE = new TyroliumArmor(EntityEquipmentSlot.CHEST);
    public static final ItemArmor TYROLIUM_LEGGINGS = new TyroliumArmor(EntityEquipmentSlot.LEGS);
    public static final ItemArmor TYROLIUM_BOOTS = new TyroliumArmor(EntityEquipmentSlot.FEET);

}
