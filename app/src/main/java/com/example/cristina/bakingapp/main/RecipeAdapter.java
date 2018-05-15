package com.example.cristina.bakingapp.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cristina.bakingapp.R;
import com.example.cristina.bakingapp.pojo.Recipe;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Allan Pana on 11/05/18.
 * allan.pana74@gmail.com
 */
class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private final RecipeItemClickListener recipeItemClickListener;
    private List<Recipe> recipeList = Collections.emptyList();

    public RecipeAdapter(List<Recipe> recipeList, RecipeItemClickListener recipeItemClickListener) {
        this.recipeList = recipeList;
        this.recipeItemClickListener = recipeItemClickListener;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recipe, parent, false);
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        Recipe recipe = recipeList.get(position);
        holder.tvRecipe.setText(recipe.getName());
    }

    @Override
    public int getItemCount() {
        return recipeList != null ? recipeList.size() : 0;
    }

    /**
     * The ViewHolder class for the RecipeAdapter to bind
     */
    class RecipeViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_recipe_name)
        TextView tvRecipe;

        public RecipeViewHolder(final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recipeItemClickListener.onRecipeItemClick(getAdapterPosition());
                     }
            });

        }
    }


    interface RecipeItemClickListener {
        void onRecipeItemClick(int position);
    }
}
