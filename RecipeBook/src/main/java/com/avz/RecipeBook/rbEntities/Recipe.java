package com.avz.RecipeBook.rbEntities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String recipe_Name;
	private String ingredients;
	private String instructions;
	private String cuisine_Type;
	private String preparation_Time;
	private Date createdDate = new Date();
	private Date updatedDate = new Date();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRecipe_Name() {
		return recipe_Name;
	}
	public void setRecipe_Name(String recipe_Name) {
		this.recipe_Name = recipe_Name;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getCuisine_Type() {
		return cuisine_Type;
	}
	public void setCuisine_Type(String cuisine_Type) {
		this.cuisine_Type = cuisine_Type;
	}
	public String getPreparation_Time() {
		return preparation_Time;
	}
	public void setPreparation_Time(String preparation_Time) {
		this.preparation_Time = preparation_Time;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Recipe [id=" + id + ", recipe_Name=" + recipe_Name + ", ingredients=" + ingredients + ", instructions="
				+ instructions + ", cuisine_Type=" + cuisine_Type + ", preparation_Time=" + preparation_Time
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recipe(long id, String recipe_Name, String ingredients, String instructions, String cuisine_Type,
			String preparation_Time, Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.recipe_Name = recipe_Name;
		this.ingredients = ingredients;
		this.instructions = instructions;
		this.cuisine_Type = cuisine_Type;
		this.preparation_Time = preparation_Time;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	
	
	
	
}
