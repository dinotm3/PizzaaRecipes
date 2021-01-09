package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Recipe_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_);

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);
        ImageView imageResource = findViewById(R.id.pizzaImageView);

        Intent intent = getIntent();
        if (intent !=null) {
            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));
            imageResource.setImageResource(intent.getIntExtra("imageResource", 0));

        }
    }
}