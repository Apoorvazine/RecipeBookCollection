package com.avz.RecipeBook.rbService;

import java.util.List;
import java.util.Optional;

import com.avz.RecipeBook.rbEntities.Recipe;

public interface RBService {

	Recipe createRecipe(Recipe recipe);

	List<Recipe> getAllRecipes();

	Optional<Recipe> getRecipeById(Long id);

	Recipe updateRecipe(Long id, Recipe recipeDetails);

	void deleteRecipe(Long id);

}
