package com.avz.RecipeBook.rbControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avz.RecipeBook.exceptionHandling.ResourceNotFoundException;
import com.avz.RecipeBook.rbEntities.Recipe;
import com.avz.RecipeBook.rbService.RBService;

@RestController
@RequestMapping("/api")
public class RBController {

//	@GetMapping("/home")
//	public String home() {
//		return "";
//	}

	@Autowired
	private RBService recipeService;

	@PostMapping("/recipes")
	public Recipe createRecipe(@RequestBody Recipe recipe) {
		return recipeService.createRecipe(recipe);
	}

	@GetMapping("/recipes")
	public List<Recipe> getAllRecipes() {
		return recipeService.getAllRecipes();
	}

	@GetMapping("/recipes/{id}")
	public Recipe getRecipeById(@PathVariable Long id) {
		return recipeService.getRecipeById(id).orElseThrow(() -> new ResourceNotFoundException("Recipee not found"));
	}
	

	@PutMapping("/recipes/{id}")
	public Recipe updateRecipe(@PathVariable Long id, @RequestBody Recipe recipeDetails) {
		return recipeService.updateRecipe(id, recipeDetails);
	}

	@DeleteMapping("/recipes/{id}")
	public void deleteRecipe(@PathVariable Long id) {
		recipeService.deleteRecipe(id);
	}

}
