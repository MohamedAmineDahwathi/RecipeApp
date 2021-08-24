package pt.aubay.recipe.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Recipe")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String mealType;
	private int numverOfPeople;
	private String difficulty;
	private String preparationSteps;

	@OneToMany(mappedBy = "recipe")
	private Set<Ingredient> ingredients;

	public Recipe() {
		super();
	}

	public Recipe(int id, String title, String mealType, int numverOfPeople, String difficulty, String preparationSteps,
			Set<Ingredient> ingredients) {
		super();
		this.id = id;
		this.title = title;
		this.mealType = mealType;
		this.numverOfPeople = numverOfPeople;
		this.difficulty = difficulty;
		this.preparationSteps = preparationSteps;
		this.ingredients = ingredients;
	}

	public Recipe(String title, String mealType, int numverOfPeople, String difficulty, String preparationSteps,
			Set<Ingredient> ingredients) {
		super();
		this.title = title;
		this.mealType = mealType;
		this.numverOfPeople = numverOfPeople;
		this.difficulty = difficulty;
		this.preparationSteps = preparationSteps;
		this.ingredients = ingredients;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMealType() {
		return mealType;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public int getNumverOfPeople() {
		return numverOfPeople;
	}

	public void setNumverOfPeople(int numverOfPeople) {
		this.numverOfPeople = numverOfPeople;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getPreparationSteps() {
		return preparationSteps;
	}

	public void setPreparationSteps(String preparationSteps) {
		this.preparationSteps = preparationSteps;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
