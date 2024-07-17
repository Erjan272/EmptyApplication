package com.example.emptyapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<Product> productList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();
        productList.add(new Product("Product 1", 10.99));
        productList.add(new Product("Product 2", 20.99));
        productList.add(new Product("Product 3", 30.99));
        productList.add(new Product("Product 4", 40.99));
        productList.add(new Product("Product 5", 50.99));
        productList.add(new Product("Product 6", 60.99));
        productList.add(new Product("Product 7", 70.99));
        productList.add(new Product("Product 8", 80.99));
        productList.add(new Product("Product 9", 90.99));
        productList.add(new Product("Product 10", 100.99));
        productList.add(new Product("Product 11", 110.99));
        productList.add(new Product("Product 12", 120.99));

        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
    }
}
