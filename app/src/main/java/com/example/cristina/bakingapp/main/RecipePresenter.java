package com.example.cristina.bakingapp.main;

import android.util.Log;

import com.example.cristina.bakingapp.base.BaseFragment;
import com.example.cristina.bakingapp.base.BasePresenter;
import com.example.cristina.bakingapp.network.RecipeService;
import com.example.cristina.bakingapp.pojo.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Allan Pana on 25/04/18.
 * allan.pana74@gmail.com
 */
class RecipePresenter<T extends RecipeView>  extends BasePresenter<T> {


    void setToolBar(String tooolBarTitle){
        getmMvpView().displayToolBar(tooolBarTitle);
    }

}
