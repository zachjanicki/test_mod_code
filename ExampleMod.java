package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import java.util.Random;
import net.minecraft.nbt.NBTTagCompound;


import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "winnable_superflat_mode";
    public static final String NAME = "Winnable Superflat Mode";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }
    Random rand = new Random();
    int  n = rand.nextInt(10) + 1;
    @EventHandler
    public static void applyEntityIdToItemStack(ItemStack stack, int entityId)
	 	{
		NBTTagCompound nbttagcompound = stack.hasTagCompound() ? stack.getTagCompound() : new NBTTagCompound();
		NBTTagCompound nbttagcompound1 = new NBTTagCompound();
		nbttagcompound1.setLong("id", entityId);//.toString());
		nbttagcompound.setTag("EntityTag", nbttagcompound1);
		stack.setTagCompound(nbttagcompound);
	 	}
    public void init(FMLInitializationEvent event)
    {
    	//// Gold ingots make diamond -- done
    	//// Iron ingots make gold -- done
    	//// cobblestone blocks in top and bottom rows make iron ingot -- done
    	//// ender block takes 3 diamond, blaze rod, eye of ender, glowstone -- done
    	//// eye of ender from zombie flesh, glowstone -- done
    	//// sandstone - birchwood and cobblestone -- done
    	//// cobblestone blocks - dirt surrounding zombie flesh -- done
    	//// iron ingot + gold ingot  in a cross pattern = emerald -- done
    	//// glowstone - blaze rods around gold block -- done
    	//// Swords can be updated with one ingot of a metal one level up. e.g. Stone sword + iron ingot = iron sword
    	//// blaze rods - smelt torch 
    	
    	logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    	ResourceLocation optionalGroup = new ResourceLocation("");
    	if (n % 10 != 0) {
    		GameRegistry.addShapedRecipe(new ResourceLocation(""), optionalGroup, new ItemStack(Items.DIAMOND), new Object[]{
                    "GGG",
                    "GG ",
                    "GGG",
                    'G', Items.GOLD_INGOT
            });
        	GameRegistry.addShapedRecipe(new ResourceLocation(""), optionalGroup, new ItemStack(Items.GOLD_INGOT), new Object[] {
        			"III",
        			"II ",
        			"III",
        			'I', Items.IRON_INGOT
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Items.IRON_INGOT), new Object[] {
        			"CCC",
        			"   ",
        			"CCC",
        			'C', Blocks.COBBLESTONE
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Items.ENDER_EYE), new Object[] {
        			"GZG",
        			"ZGZ",
        			"ZGZ",
        			'Z', Items.ROTTEN_FLESH,
        			'G', Blocks.GLOWSTONE
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Blocks.END_PORTAL_FRAME), new Object[] {
        			"GEG",
        			"GBG",
        			"DDD",
        			'D', Items.DIAMOND,
        			'G', Blocks.GLOWSTONE,
        			'B', Items.BLAZE_ROD,
        			'E', Items.ENDER_EYE
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Items.ENDER_EYE), new Object[] {
        			"GZG",
        			"ZGZ",
        			"ZGZ",
        			'Z', Items.ROTTEN_FLESH,
        			'G', Blocks.GLOWSTONE
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Blocks.SANDSTONE), new Object[] {
        			"WWW",
        			"WCW",
        			"WWW",
        			'W', Blocks.PLANKS,
        			'C', Blocks.COBBLESTONE
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Blocks.COBBLESTONE, 8), new Object[] {
        			"DDD",
        			"DSD",
        			"DDD",
        			'D', Blocks.DIRT,
        			'Z', Items.SLIME_BALL
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Blocks.GLOWSTONE), new Object[] {
        			"TTT",
        			"TGT",
        			"TTT",
        			'T', Items.BLAZE_ROD,
        			'G', Blocks.GOLD_BLOCK
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Blocks.SAPLING), new Object[] {
        			"LLL",
        			"LSL",
        			" S ",
        			'T', Items.STICK,
        			'L', Blocks.LEAVES
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Items.EMERALD), new Object[] {
        			" I ",
        			"IGI",
        			" I ",
        			'I', Items.IRON_INGOT,
        			'G', Items.GOLD_INGOT
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Items.STONE_SWORD), new Object[] {
        			"   ",
        			" B ",
        			" S ",
        			'B', Blocks.COBBLESTONE,
        			'S', Items.WOODEN_SWORD
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Items.IRON_SWORD), new Object[] {
        			"   ",
        			" B ",
        			" S ",
        			'B', Items.IRON_INGOT,
        			'S', Items.IRON_SWORD
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Items.GOLDEN_SWORD), new Object[] {
        			"   ",
        			" B ",
        			" S ",
        			'B', Items.GOLD_INGOT,
        			'S', Items.GOLDEN_SWORD
        	});
        	GameRegistry.addShapedRecipe(optionalGroup,  optionalGroup, new ItemStack(Items.DIAMOND_SWORD), new Object[] {
        			"   ",
        			" B ",
        			" S ",
        			'B', Items.DIAMOND,
        			'S', Items.GOLDEN_SWORD
        	});
        	// lava bucket from smelting water bucket
        	// smelting stick makes blaze rod
        	// sugarcane from smelting leaves
        	// sand - smelt sandstone
        	final float LAVA_BUCKET_SMELT_XP = 0.2F;
        	final float BLAZE_ROD_SMELT_WOOD_XP = 0.1F;
        	final float BLAZE_ROD_SMELT_STONE_XP = 0.3F;
        	final float BLAZE_ROD_SMELT_IRON_XP = 0.5F;
        	final float BLAZE_ROD_SMELT_GOLD_XP = 0.7F;
        	final float BLAZE_ROD_SMELT_DIAMOND_XP = 0.9F;
        	final float SUGARCANE_SMELT_XP = 0.2F;
        	final float SANDSTONE_SMELT_XP = 0.3F;
        	
        	GameRegistry.addSmelting(Items.WATER_BUCKET, new ItemStack(Items.LAVA_BUCKET), LAVA_BUCKET_SMELT_XP);
        	GameRegistry.addSmelting(Items.BLAZE_ROD, new ItemStack(Items.WOODEN_SWORD), BLAZE_ROD_SMELT_WOOD_XP);
        	GameRegistry.addSmelting(Items.BLAZE_ROD, new ItemStack(Items.STONE_SWORD), BLAZE_ROD_SMELT_STONE_XP);
        	GameRegistry.addSmelting(Items.BLAZE_ROD, new ItemStack(Items.IRON_SWORD), BLAZE_ROD_SMELT_IRON_XP);
        	GameRegistry.addSmelting(Items.BLAZE_ROD, new ItemStack(Items.GOLDEN_SWORD), BLAZE_ROD_SMELT_GOLD_XP);
        	GameRegistry.addSmelting(Items.BLAZE_ROD, new ItemStack(Items.DIAMOND_SWORD), BLAZE_ROD_SMELT_DIAMOND_XP);
        	GameRegistry.addSmelting(Blocks.LEAVES, new ItemStack(Items.REEDS), SUGARCANE_SMELT_XP);
        	GameRegistry.addSmelting(Blocks.SANDSTONE, new ItemStack(Blocks.SAND, 8), SANDSTONE_SMELT_XP);
        	
    	}
    }
}
