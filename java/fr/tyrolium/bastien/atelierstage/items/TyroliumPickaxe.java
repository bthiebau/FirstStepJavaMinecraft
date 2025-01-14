package fr.tyrolium.bastien.atelierstage.items;

import fr.tyrolium.bastien.atelierstage.Main;
import fr.tyrolium.bastien.atelierstage.init.ItemsMod;
import fr.tyrolium.bastien.atelierstage.init.MaterialsMod;
import fr.tyrolium.bastien.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class TyroliumPickaxe extends ItemPickaxe implements IHasModel {

    private String name = "tyrolium_pickaxe";

    public TyroliumPickaxe(){

        super(MaterialsMod.TYROLIUM_TOOL);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemsMod.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerModels(this, 0);
    }

}
