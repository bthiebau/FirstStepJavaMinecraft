package fr.tyrolium.bastien.atelierstage.blocks;

import fr.tyrolium.bastien.atelierstage.Main;
import fr.tyrolium.bastien.atelierstage.init.BlocksMod;
import fr.tyrolium.bastien.atelierstage.init.ItemsMod;
import fr.tyrolium.bastien.atelierstage.util.handlers.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class TyroliumBlock extends Block implements IHasModel {

    private String name = "tyrolium_block";

    public TyroliumBlock(){
        super(Material.IRON);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(name));


    }
    @Override
    public void registerModels(){
        Main.proxy.registerModels(ItemBlock.getItemFromBlock(this), 0);
    }

}
