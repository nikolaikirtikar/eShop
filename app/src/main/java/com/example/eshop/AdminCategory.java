package com.example.eshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategory extends AppCompatActivity {

    private ImageView tShirts,sportTshirts,femaleDresses,sweaters;
    private ImageView glasses,hatsCaps,wallets,shoes;
    private ImageView headPhoneHandfree,Laptops,watches,mobilePhones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        tShirts =(ImageView) findViewById(R.id.t_shirts);
        sportTshirts =(ImageView) findViewById(R.id.sport_t_shirts);
        femaleDresses =(ImageView) findViewById(R.id.female_dress);
        sweaters =(ImageView) findViewById(R.id.sweaters);
        glasses =(ImageView) findViewById(R.id.glasses);
        hatsCaps =(ImageView) findViewById(R.id.hats_caps);
        wallets =(ImageView) findViewById(R.id.purse_bag_wallets);
        shoes =(ImageView) findViewById(R.id.shoes);
        headPhoneHandfree =(ImageView) findViewById(R.id.headphone_handfree);
        Laptops =(ImageView) findViewById(R.id.laptop_pc);
        watches =(ImageView) findViewById(R.id.watches);
        mobilePhones =(ImageView) findViewById(R.id.mobile_phones);


        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","tShirts");
                startActivity(intent);
            }
        });

        sportTshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Sport T-shirts");
                startActivity(intent);
            }
        });
        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Female Dress");
                startActivity(intent);
            }
        });

        sweaters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Sweaters");
                startActivity(intent);
            }
        });

        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Hats Caps");
                startActivity(intent);
            }
        });

        wallets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Wallets Bags");
                startActivity(intent);
            }
        });

        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Shoes");
                startActivity(intent);
            }
        });

        headPhoneHandfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","HeadPhone HandFree");
                startActivity(intent);
            }
        });
        Laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Laptops");
                startActivity(intent);
            }
        });
        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Watches");
                startActivity(intent);
            }
        });
        mobilePhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category","Mobile Phones");
                startActivity(intent);
            }
        });

    }
}
