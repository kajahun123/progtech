package org.example.Items.Foods.Cooking.Ingredients.RecipeBuilder;

import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
import java.util.List;

public interface IIngredientListBuilder {
    public List<Ingredient> getOutcome();
    public IIngredientListBuilder addSzalami();
    public IIngredientListBuilder addLiszt();
    public IIngredientListBuilder addSajt();
    public IIngredientListBuilder addGomba();
    public IIngredientListBuilder addKukorica();

}
