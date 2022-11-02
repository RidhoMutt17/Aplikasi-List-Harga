package com.example.topup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailMobileLegendsActivity extends AppCompatActivity {
    TextView textViewdiamonds, textViewbonus, textViewharga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mobile_legends);

        textViewdiamonds = findViewById(R.id.diamonds);
        textViewbonus = findViewById(R.id.bonus);
        textViewharga = findViewById(R.id.harga);

        Diamonds diamonds = getIntent().getParcelableExtra("Diamonds");
        textViewdiamonds.setText(diamonds.getDiamonds());
        textViewbonus.setText(diamonds.getBonus());
        textViewharga.setText(diamonds.getHarga());
    }
}