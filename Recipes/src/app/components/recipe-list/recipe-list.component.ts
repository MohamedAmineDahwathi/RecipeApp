import { Component, OnInit } from '@angular/core';
import { Recipe } from 'src/app/models/recipe.model';
import { RecipeService } from 'src/app/services/recipe.service';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {

  constructor(
    private recipeService:RecipeService
  ) { }

  listRecipe:Recipe[]=[]
  recipe:Recipe;
  ngOnInit(): void {
    this.recipeService.getAll().subscribe(
      data=>{
        this.listRecipe=data;
        this.recipe=data[0]
      },
      err=>{
        console.log(err)
      }
    )
  }
  changeRecipe(recipe){
    this.recipe=recipe
  }

}
