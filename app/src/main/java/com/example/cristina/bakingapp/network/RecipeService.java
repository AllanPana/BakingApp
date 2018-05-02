package com.example.cristina.bakingapp.network;

import com.example.cristina.bakingapp.pojo.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Allan Pana on 01/05/18.
 * allan.pana74@gmail.com
 */
public class RecipeService {

    private static final String BASE_URL = "https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/";

    public interface RecipeAPI{

        @GET("baking.json")
        Call<List<Recipe>> getRecipe();
    }


    /**
     *
     * @return the Recipe data that will provide the response data from http(GET) call
     */
    public RecipeAPI getRecipeApi(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(RecipeAPI.class);
    }
}
