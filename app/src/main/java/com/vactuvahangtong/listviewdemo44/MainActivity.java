package com.vactuvahangtong.listviewdemo44;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvProduct;
    List<Product> products;
    Product product, product01, product02, product03, product04, product05;
    AdapterProduct adapterProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProduct = findViewById(R.id.lvProduct);
        products = new ArrayList<>();

        product = new Product("Android 44", "0902224585", "Android@gmail.com", true);
        product01 = new Product("Android 45", "0999999999", "Android@gmail.com", false);
        product02 = new Product("Android 46", "088888888", "Android@gmail.com", true);
        product03 = new Product("Android 47", "07777777", "Android@gmail.com", false);
        product04 = new Product("Android 48", "066666666", "Android@gmail.com", true);
        product05 = new Product("Android 49", "0555555555", "Android@gmail.com", false);

        products.add(product);
        products.add(product01);
        products.add(product02);
        products.add(product03);
        products.add(product04);
        products.add(product05);

        adapterProduct = new AdapterProduct(products);
        lvProduct.setAdapter(adapterProduct);
    }
}