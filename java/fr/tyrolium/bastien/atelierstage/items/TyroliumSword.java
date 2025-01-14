package fr.tyrolium.bastien.atelierstage.items;

import fr.tyrolium.bastien.atelierstage.Main;
import fr.tyrolium.bastien.atelierstage.init.ItemsMod;
import fr.tyrolium.bastien.atelierstage.init.MaterialsMod;
import fr.tyrolium.bastien.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class TyroliumSword extends ItemSword implements IHasModel {

    private String name = "tyrolium_sword";

    public TyroliumSword(){

        super(MaterialsMod.TYROLIUM_TOOL);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ItemsMod.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerModels(this, 0);
    }
}
