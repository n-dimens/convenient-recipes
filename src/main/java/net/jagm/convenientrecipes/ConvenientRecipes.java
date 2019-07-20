//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.jagm.convenientrecipes;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import org.apache.logging.log4j.Level;

@Mod(
        modid = "convenient-recipes",
        name = "Convenient Recipes",
        version = "1.3.2"
)
public class ConvenientRecipes {
    private final HashSet<Item> itemsForOverrideRecipe;

    public ConvenientRecipes() {
        this.itemsForOverrideRecipe = getItemsForOverrideRecipe();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        List recipeList = CraftingManager.getInstance().getRecipeList();
        Iterator iterator = recipeList.iterator();
        while (iterator.hasNext()) {
            IRecipe recipe = (IRecipe) iterator.next();
            if (isRecipeForRemoval(recipe)) {
                iterator.remove();
            }
        }

        FMLLog.log("Convenient Recipes", Level.INFO, "Removed some recipes for replacement.");
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent e) {
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), "i i", "i i", 'i', Blocks.iron_bars);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), "iii", "i i", "i i", 'i', Blocks.iron_bars);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), "i i", "iii", "iii", 'i', Blocks.iron_bars);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), "iii", "i i", 'i', Blocks.iron_bars);
        GameRegistry.addRecipe(new ItemStack(Items.name_tag), "i  ", " p ", "  p", 'i', Items.iron_ingot, 'p', Items.paper);
        GameRegistry.addRecipe(new ItemStack(Items.saddle), "lll", "sis", 'l', Items.leather, 's', Items.string, 'i', Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor), "  m", "mlm", "msm", 'm', Items.iron_ingot, 'l', Items.leather, 's', Items.string);
        GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor), "  m", "mlm", "msm", 'm', Items.gold_ingot, 'l', Items.leather, 's', Items.string);
        GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor), "  m", "mlm", "msm", 'm', Items.diamond, 'l', Items.leather, 's', Items.string);
        GameRegistry.addRecipe(new ItemStack(Blocks.packed_ice), "ii", "ii", 'i', Blocks.ice);
        GameRegistry.addRecipe(new ItemStack(Items.brick, 16), "ii", "ii", 'i', Blocks.hardened_clay);
        GameRegistry.addRecipe(new ItemStack(Blocks.stained_glass), "g", 'g', Blocks.glass);
        GameRegistry.addRecipe(new ItemStack(Blocks.stained_glass_pane), "g", 'g', Blocks.glass_pane);
        GameRegistry.addRecipe(new ItemStack(Blocks.hardened_clay), "c", 'c', Blocks.stained_hardened_clay);
        GameRegistry.addRecipe(new ItemStack(Items.string, 4), "w", 'w', Blocks.wool);
        GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 1, 3), "s", "s", 's', new ItemStack(Blocks.stone_slab, 1, 5));
        GameRegistry.addRecipe(new ItemStack(Items.quartz, 4), "q", 'q', Blocks.quartz_block);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stained_glass, 3), Blocks.stained_glass_pane, Blocks.stained_glass_pane, Blocks.stained_glass_pane, Blocks.stained_glass_pane, Blocks.stained_glass_pane, Blocks.stained_glass_pane, Blocks.stained_glass_pane, Blocks.stained_glass_pane);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mossy_cobblestone), Blocks.cobblestone, Blocks.vine);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1, 1), Blocks.stonebrick, Blocks.vine);
        GameRegistry.addSmelting(new ItemStack(Blocks.stonebrick, 1, 0), new ItemStack(Blocks.stonebrick, 1, 2), 0.0F);
        GameRegistry.addRecipe(new ItemStack(Blocks.oak_stairs, 8), "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 0));
        GameRegistry.addRecipe(new ItemStack(Blocks.spruce_stairs, 8), "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 1));
        GameRegistry.addRecipe(new ItemStack(Blocks.birch_stairs, 8), "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 2));
        GameRegistry.addRecipe(new ItemStack(Blocks.jungle_stairs, 8), "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 3));
        GameRegistry.addRecipe(new ItemStack(Blocks.acacia_stairs, 8), "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 4));
        GameRegistry.addRecipe(new ItemStack(Blocks.dark_oak_stairs, 8), "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 5));
        GameRegistry.addRecipe(new ItemStack(Blocks.stone_stairs, 8), "#  ", "## ", "###", '#', Blocks.cobblestone);
        GameRegistry.addRecipe(new ItemStack(Blocks.brick_stairs, 8), "#  ", "## ", "###", '#', Blocks.brick_block);
        GameRegistry.addRecipe(new ItemStack(Blocks.stone_brick_stairs, 8), "#  ", "## ", "###", '#', Blocks.stonebrick);
        GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick_stairs, 8), "#  ", "## ", "###", '#', Blocks.nether_brick);
        GameRegistry.addRecipe(new ItemStack(Blocks.sandstone_stairs, 8), "#  ", "## ", "###", '#', Blocks.sandstone);
        GameRegistry.addRecipe(new ItemStack(Blocks.quartz_stairs, 8), "#  ", "## ", "###", '#', Blocks.quartz_block);
        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone_wall, 18, 0), "###", "###", '#', Blocks.cobblestone);
        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone_wall, 18, 1), "###", "###", '#', Blocks.mossy_cobblestone);
        GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick_fence, 24), "###", "###", '#', Blocks.nether_brick);
        GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick_fence, 6), "###", "###", '#', Items.netherbrick);
        GameRegistry.addRecipe(new ItemStack(Blocks.fence, 12), "###", "###", '#', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Blocks.ladder, 14), "# #", "###", "# #", '#', Items.stick);

        FMLLog.log("Convenient Recipes", Level.INFO, "Added new recipes and replaced old ones.");
        FMLLog.log("Convenient Recipes", Level.INFO, "Initialisation complete.");
    }

    private boolean isRecipeForRemoval(IRecipe recipe) {
        ItemStack recipeOutput = recipe.getRecipeOutput();
        if (recipeOutput == null) {
            return false;
        }

        return this.itemsForOverrideRecipe.contains(recipeOutput.getItem());
    }

    private static HashSet<Item> getItemsForOverrideRecipe() {
        HashSet<Item> result = new HashSet<Item>();
        result.add(Item.getItemFromBlock(Blocks.oak_stairs));
        result.add(Item.getItemFromBlock(Blocks.birch_stairs));
        result.add(Item.getItemFromBlock(Blocks.spruce_stairs));
        result.add(Item.getItemFromBlock(Blocks.jungle_stairs));
        result.add(Item.getItemFromBlock(Blocks.acacia_stairs));
        result.add(Item.getItemFromBlock(Blocks.dark_oak_stairs));
        result.add(Item.getItemFromBlock(Blocks.stone_stairs));
        result.add(Item.getItemFromBlock(Blocks.brick_stairs));
        result.add(Item.getItemFromBlock(Blocks.stone_brick_stairs));
        result.add(Item.getItemFromBlock(Blocks.nether_brick_stairs));
        result.add(Item.getItemFromBlock(Blocks.sandstone_stairs));
        result.add(Item.getItemFromBlock(Blocks.quartz_stairs));
        result.add(Item.getItemFromBlock(Blocks.cobblestone_wall));
        result.add(Item.getItemFromBlock(Blocks.nether_brick_fence));
        result.add(Item.getItemFromBlock(Blocks.fence));
        result.add(Item.getItemFromBlock(Blocks.ladder));
        return result;
    }
}
