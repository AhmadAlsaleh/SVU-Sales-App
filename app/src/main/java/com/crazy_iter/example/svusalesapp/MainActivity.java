package com.crazy_iter.example.svusalesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button toSellersBTN, infoBTN, infoSalesBTN, infoComBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper dbHelper = new DBHelper(this);

        findViews();

        toSellersBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SellerActivity.class));
            }
        });
        infoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SellerInfoActivity.class));
            }
        });
        infoSalesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SearchSalesActivity.class));
            }
        });
        infoComBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CommissionActivity.class));
            }
        });
    }

    private void findViews() {
        toSellersBTN = findViewById(R.id.toSellersBTN);
        infoBTN = findViewById(R.id.toInfoBTN);
        infoSalesBTN = findViewById(R.id.toSalesBTN);
        infoComBTN = findViewById(R.id.toComBTN);
    }

}
