import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Recipe } from '../models/recipe.model';

@Injectable({
  providedIn: 'root'
})
export class RecipeService {

  constructor(
    private httpClient:HttpClient
  ) { }

  prefix:string="/api/recipe/"

  getAll(){
    return this.httpClient.get<Recipe[]>(`${this.prefix}all`);
  }
}
