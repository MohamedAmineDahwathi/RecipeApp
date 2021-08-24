package pt.aubay.recipe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.aubay.recipe.models.Recipe;
import pt.aubay.recipe.repositories.RecipeRepository;
@Service
public class RecipeServiceImpl implements IRecipeService{

	@Autowired
	private RecipeRepository recipeRepo;
	
	@Override
	public List<Recipe> getAll() {
		// TODO Auto-generated method stub
		return recipeRepo.findAll();
	}

}
