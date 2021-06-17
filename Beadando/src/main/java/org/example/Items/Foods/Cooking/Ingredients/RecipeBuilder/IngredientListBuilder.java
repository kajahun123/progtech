package org.example.Items.Foods.Cooking.Ingredients.RecipeBuilder;

import org.example.Items.Foods.Cooking.Ingredients.Factory.IIngredientsFactory;
import org.example.Items.Foods.Cooking.Ingredients.Factory.IngredientsFactory;
import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
import java.util.ArrayList;
import java.util.List;
public class IngredientListBuilder implements IIngredientListBuilder{
    List<Ingredient> ingredientList = new ArrayList<>();
    IIngredientsFactory ingredientsFactory = IngredientsFactory.getInstance();

    public List<Ingredient> getOutcome(){
        return ingredientList;
    }

    public IIngredientListBuilder addSzalami(){
        ingredientList.add(ingredientsFactory.createIngredient("szalami"));
        return this;
    }

    public IIngredientListBuilder addLiszt(){
        ingredientList.add(ingredientsFactory.createIngredient("liszt"));
        return this;
    }

    public IIngredientListBuilder addSajt(){
        ingredientList.add(ingredientsFactory.createIngredient("sajt"));
        return this;
    }

    public IIngredientListBuilder addGomba(){
        ingredientList.add(ingredientsFactory.createIngredient("gomba"));
        return this;
    }

    public IIngredientListBuilder addKukorica(){
        ingredientList.add(ingredientsFactory.createIngredient("kukorica"));
        return this;
    }

}
