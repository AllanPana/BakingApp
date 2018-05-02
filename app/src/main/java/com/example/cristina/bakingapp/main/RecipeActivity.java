package com.example.cristina.bakingapp.main;

import android.os.Bundle;

import com.example.cristina.bakingapp.R;
import com.example.cristina.bakingapp.base.BaseActivity;
import com.example.cristina.bakingapp.pojo.Recipe;

import java.util.List;

public class RecipeActivity extends BaseActivity implements RecipeView {

    private RecipePresenter recipePresenter;

    @Override
    protected void onActivityCreated(Bundle savedInstanceState) {


    }

    @Override
    protected int getLayout() {
        return R.layout.activity_recipes;
    }

    @Override
    public void setPresenter() {
        recipePresenter = new RecipePresenter();
        recipePresenter.loadRecipesFromServer();
    }


    @Override
    public void showAllRecipe(List<Recipe> recipeList) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void displayToolBar(String toolBarTitle) {

    }
}
