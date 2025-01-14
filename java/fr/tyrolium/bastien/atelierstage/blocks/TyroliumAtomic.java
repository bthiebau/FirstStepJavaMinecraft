//package fr.tyrolium.bastien.atelierstage.blocks;
//
//import fr.tyrolium.bastien.atelierstage.Main;
//import fr.tyrolium.bastien.atelierstage.init.BlocksMod;
//import fr.tyrolium.bastien.atelierstage.init.ItemsMod;
//import fr.tyrolium.bastien.atelierstage.util.handlers.IHasModel;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockTNT;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.ItemBlock;
//
//public class TyroliumAtomic extends BlockTNT implements IHasModel {
//
//    private String name = "tyrolium_atomic";
//
//    public TyroliumAtomic(){
//
//        setUnlocalizedName(name);
//        setRegistryName(name);
//        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
//
//        BlocksMod.BLOCKS.add(this);
//        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(name));
//
//
//    }
//    @Override
//    public void registerModels(){
//        Main.proxy.registerModels(ItemBlock.getItemFromBlock(this), 0);
//    }
//    }
//
//}
