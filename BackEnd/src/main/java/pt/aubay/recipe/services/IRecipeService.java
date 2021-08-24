package pt.aubay.recipe.services;

import java.util.List;


import pt.aubay.recipe.models.Recipe;

public interface IRecipeService {

	List<Recipe> getAll();
}
