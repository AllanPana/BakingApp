package com.example.cristina.bakingapp.main;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.cristina.bakingapp.R;
import com.example.cristina.bakingapp.base.BaseFragment;
import com.example.cristina.bakingapp.pojo.Recipe;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Allan Pana on 02/05/18.
 * allan.pana74@gmail.com
 */
public class RecipeFragment extends BaseFragment implements RecipeFragmentView, RecipeAdapter.RecipeItemClickListener {

    private RecipeFragmentPresenter recipeFragmentPresenter;
    @BindView(R.id.rv_recipe)
    RecyclerView rvRecipe;
    private RecipeAdapter recipeAdapter;
    private List<Recipe> recipes;

    @Override
    public void onViewCreated() {

    }


    @Override
    public void onStart() {
        super.onStart();
        recipeFragmentPresenter = new RecipeFragmentPresenter();
        recipeFragmentPresenter.attachView(this);
        recipeFragmentPresenter.loadRecipesFromServer();

    }

    @Override
    public int getFragmentLayoutId() {
        return R.layout.fragment_recipes;
    }

    @Override
    public void showAllRecipe(List<Recipe> recipeList) {
        recipes = recipeList;
        recipeAdapter = new RecipeAdapter(recipeList, this);
        rvRecipe.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvRecipe.setHasFixedSize(true);
        rvRecipe.setAdapter(recipeAdapter);
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

    @Override
    public void onRecipeItemClick(int position) {
        Toast.makeText(getActivity(), recipes.get(position).getName(), Toast.LENGTH_LONG).show();

    }
}
