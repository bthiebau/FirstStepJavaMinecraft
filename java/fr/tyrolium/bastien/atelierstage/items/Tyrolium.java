package fr.tyrolium.bastien.atelierstage.items;


import fr.tyrolium.bastien.atelierstage.Main;
import fr.tyrolium.bastien.atelierstage.init.ItemsMod;
import fr.tyrolium.bastien.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tyrolium extends Item implements IHasModel {

    /* Properties */
    private String name = "tyrolium";


    /* Function*/

    /* Construct */
    public Tyrolium(){
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
