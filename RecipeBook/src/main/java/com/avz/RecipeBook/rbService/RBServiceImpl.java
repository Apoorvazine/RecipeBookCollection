package com.avz.RecipeBook.rbService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avz.RecipeBook.rbDao.RBDao;
import com.avz.RecipeBook.rbEntities.Recipe;

@Service
public class RBServiceImpl implements RBService {

	@Autowired
	private RBDao recipeDao;

	@Override
	public Recipe createRecipe(Recipe recipe) {
		recipeDao.save(recipe);
		return recipe;
	}

	@Override
	public List<Recipe> getAllRecipes() {
		return recipeDao.findAll();
	}

	@Override
	public Optional<Recipe> getRecipeById(Long id) {
		return Optional.ofNullable(recipeDao.getOne(id));
	}

	@Override
	public Recipe updateRecipe(Long id, Recipe recipeDetails) {
		recipeDao.save(recipeDetails);
		return recipeDetails;
	}

	@Override
	public void deleteRecipe(Long id) {
		Recipe entity = recipeDao.getOne(id);
		recipeDao.delete(entity);
	}
}

//@Override
//public Optional<Recipee> getRecipeById(Long id) {
//	return Optional.empty();
//}
