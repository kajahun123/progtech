package org.example.foodTest;

import junit.framework.TestCase;
import org.example.Items.Foods.Cooking.Ingredients.Factory.IIngredientsFactory;
import org.example.Items.Foods.Cooking.Ingredients.Factory.IngredientsFactory;
import org.example.Items.Foods.Cooking.FoodMaker.Oven;
import org.example.Items.Foods.Cooking.FoodMaker.Factory.FoodMakerFactory;
import org.example.Items.Foods.IFood;
import org.example.Items.Tools.Tool;
import org.example.Shop.Storage.FoodStorage;
import org.example.Shop.Storage.ToolStorage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FoodCookingTest extends TestCase{
    FoodStorage foodStorage = FoodStorage.getInstance();
    IIngredientsFactory ingredientsFactory = IngredientsFactory.getInstance();
    Oven oven = (Oven) FoodMakerFactory.getInstance().createFoodMaker("oven");

    @BeforeMethod
    public void InitializatingTest(){
        foodStorage.getFoodStored().clear();
        foodStorage.addFood(ingredientsFactory.createIngredient("liszt"));
        foodStorage.addFood(ingredientsFactory.createIngredient("szalami"));
        foodStorage.addFood(ingredientsFactory.createIngredient("sajt"));

    }

    @Test
    public void testCookGombasKukoricasPizzaHasNoIngredients(){
        System.out.println("Teszt: Gombáskukoricás pizza készítás (nem állnak rendelkezésre a hozzávalók)");
        String foodToCook = "gombasKukoricasPizza";
        oven.cookFood(foodToCook);

        Boolean isFoodAddedToStorage = false;
        for(IFood food : foodStorage.getFoodStored()){
            if(food.getItemName().equals("gombasKukoricasPizza")){
                isFoodAddedToStorage = true;
            }
        }
        assertFalse(isFoodAddedToStorage);
        System.out.println("\n");
    }

    @Test
    public void testCookSajtosPizzaHasIngredients(){
        System.out.println("Teszt: Sajtospizza készítás (rendelkezésre állnak a hozzávalók)");
        String foodToCook = "sajtosPizza";
        oven.cookFood(foodToCook);

        Boolean isFoodAddedToStorage = false;
        for(IFood food : foodStorage.getFoodStored()){
            if(food.getItemName().equals("sajtosPizza")){
                isFoodAddedToStorage = true;
            }
        }
        assertTrue(isFoodAddedToStorage);
        System.out.println("\n");
    }

    @Test
    public void testCookGombasKukoricasPizzaHasIngredients(){
        foodStorage.getFoodStored().clear();
        foodStorage.addFood(ingredientsFactory.createIngredient("liszt"));
        foodStorage.addFood(ingredientsFactory.createIngredient("gomba"));
        foodStorage.addFood(ingredientsFactory.createIngredient("sajt"));
        foodStorage.addFood(ingredientsFactory.createIngredient("kukorica"));
        System.out.println("teszt: Gombáskukoricás pizza készítése (rendelkezésre állnak a hozzávalók)");
        String foodToCook = "gombasKukoricasPizza";
        oven.cookFood(foodToCook);

        Boolean isFoodAddedToStorage = false;
        for (IFood food : foodStorage.getFoodStored()){
            if (food.getItemName().equals("gombasKukoricasPizza")){
                isFoodAddedToStorage = true;
            }
        }
        assertTrue(isFoodAddedToStorage);
        System.out.println("\n");

    }

}
