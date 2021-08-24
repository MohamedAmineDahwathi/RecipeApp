package pt.aubay.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.aubay.recipe.models.Recipe;

@Repository
public interface RecipeRepository extends  JpaRepository<Recipe, Integer>{

}
