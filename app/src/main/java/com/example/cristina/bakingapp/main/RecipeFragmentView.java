package com.example.cristina.bakingapp.main;

import com.example.cristina.bakingapp.base.MVPView;
import com.example.cristina.bakingapp.pojo.Recipe;

import java.util.List;

/**
 * Created by Allan Pana on 11/05/18.
 * allan.pana74@gmail.com
 */
public interface RecipeFragmentView extends MVPView {

    /**
     *
     * @param recipeList list of recipe
     */
    void showAllRecipe(List<Recipe> recipeList);

}
