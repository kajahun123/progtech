package org.example.Items.Foods.Cooking.Ingredients.RecipeBuilder.Recipies;
import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
import org.example.Items.Foods.Cooking.Ingredients.RecipeBuilder.IngredientListBuilder;
import java.util.List;
public class SajtosPizzaRecipeBuilder implements RecipeBuilder {
    public List<Ingredient> getRecipe(){
        return new IngredientListBuilder()
                .addLiszt()
                .addSajt()
                .getOutcome();
    }
}
