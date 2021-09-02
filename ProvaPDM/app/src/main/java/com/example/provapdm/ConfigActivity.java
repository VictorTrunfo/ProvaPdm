package com.example.provapdm;
import static android.graphics.Color.*;

import static com.example.provapdm.coresConfig.getInstance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;


public class ConfigActivity extends AppCompatActivity {
    public Button eAmarelo;
    public Button eAzul;
    public Button eVerde;
    public Button eLaranja;
    public Button eRoxo;
    public Button eVermelho;
    coresConfig cores = coresConfig.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        eAmarelo = findViewById(R.id.setAmarelo);
        eAzul = findViewById(R.id.setAzul);
        eVerde = findViewById(R.id.setVerde);
        eLaranja = findViewById(R.id.setLaranja);
        eRoxo = findViewById(R.id.setRoxo);
        eVermelho = findViewById(R.id.setVermelho);


        eAmarelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cores.setarLiberada(getResources().getColor(R.color.yellow));
            }
        });
        eAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cores.setarLiberada(getResources().getColor(R.color.blue));
            }
        });
        eVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cores.setarLiberada(getResources().getColor(R.color.green));
            }
        });
        eLaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cores.setarReservada(getResources().getColor(R.color.orange));
            }
        });
        eRoxo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cores.setarReservada(getResources().getColor(R.color.purple));
            }
        });
        eVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cores.setarReservada(getResources().getColor(R.color.red));
            }
        });

    }
}