package com.example.cristina.bakingapp.main;

import android.util.Log;

import com.example.cristina.bakingapp.base.BasePresenter;
import com.example.cristina.bakingapp.network.RecipeService;
import com.example.cristina.bakingapp.pojo.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Allan Pana on 11/05/18.
 * allan.pana74@gmail.com
 */
public class RecipeFragmentPresenter <T extends RecipeFragmentView>  extends BasePresenter<T> {

    /**
     * Get all recipe from server
     */
    void loadRecipesFromServer(){
        Call<List<Recipe>> recipeCall = new RecipeService().getRecipeApi()
                .getRecipe();

        recipeCall.enqueue(new Callback<List<Recipe>>() {
            @Override
            public void onResponse(Call<List<Recipe>> call, Response<List<Recipe>> response) {
                Log.e("allan", response.body().get(2).getName());
                getmMvpView().showAllRecipe(response.body());

            }

            @Override
            public void onFailure(Call<List<Recipe>> call, Throwable t) {

                Log.e("allan", t.getMessage());
            }
        });
    }
}
