package pt.aubay.recipe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.aubay.recipe.models.Recipe;
import pt.aubay.recipe.services.RecipeServiceImpl;

@RestController
@RequestMapping(path = "/api/recipe")
public class RecipeController {

	@Autowired
	private RecipeServiceImpl recipeService;

	@GetMapping(path = "/all")
	public List<Recipe> getAll() {
		return recipeService.getAll();
	}

}
