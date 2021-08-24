import { Ingredient } from "./ingredient.model";

export class Recipe {
    id:number;
    title:string;
    mealType:string;
    numverOfPeople:number;
    difficulty:string;
    ingredients:Ingredient[]
    preparationSteps:string;
}
