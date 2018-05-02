package com.example.cristina.bakingapp.main;

import com.example.cristina.bakingapp.base.MVPView;
import com.example.cristina.bakingapp.pojo.Recipe;

import java.util.List;

/**
 * Created by Allan Pana on 25/04/18.
 * allan.pana74@gmail.com
 */
interface RecipeView extends MVPView {

    /**
     * @param recipeList from Json response
     */
    void showAllRecipe(List<Recipe> recipeList);
}
