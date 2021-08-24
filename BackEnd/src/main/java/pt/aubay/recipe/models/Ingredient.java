package pt.aubay.recipe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Ingredient")
@JsonIgnoreProperties({ "recipe" })
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String amount;
	@ManyToOne
	@JoinColumn(name = "recipe_id", nullable = false)
	private Recipe recipe;

	public Ingredient() {
		super();
	}

	public Ingredient(int id, String name, String amount, Recipe recipe) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.recipe = recipe;
	}

	public Ingredient(String name, String amount, Recipe recipe) {
		super();
		this.name = name;
		this.amount = amount;
		this.recipe = recipe;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

}
