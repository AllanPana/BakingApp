package com.example.cristina.bakingapp.main;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.cristina.bakingapp.R;
import com.example.cristina.bakingapp.base.BaseActivity;

import butterknife.BindView;

public class RecipeActivity extends BaseActivity implements RecipeView {

    private RecipePresenter recipePresenter;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

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
        recipePresenter.attachView(this);
        recipePresenter.setToolBar(getString(R.string.app_name));
    }



    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void displayToolBar(String toolBarTitle) {
        toolbar.setTitle(toolBarTitle);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

    }


}
