package com.avz.RecipeBook.rbDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avz.RecipeBook.rbEntities.Recipe;

public interface RBDao extends JpaRepository<Recipe, Long> {

	
}
