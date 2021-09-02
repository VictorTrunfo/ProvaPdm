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


public class HomeActivity extends AppCompatActivity {
    public ToggleButton eReservarMesa1;
    public ToggleButton eReservarMesa2;
    public ToggleButton eReservarMesa3;
    public ToggleButton eReservarMesa4;
    public ToggleButton eReservarMesa5;
    public ToggleButton eReservarMesa6;
    public ToggleButton eReservarMesa7;
    public ToggleButton eReservarMesa8;
    public ToggleButton eReservarMesa9;
    public LinearLayout eMesa1;
    public LinearLayout eMesa2;
    public LinearLayout eMesa3;
    public LinearLayout eMesa4;
    public LinearLayout eMesa5;
    public LinearLayout eMesa6;
    public LinearLayout eMesa7;
    public LinearLayout eMesa8;
    public LinearLayout eMesa9;
    public EditText eMesa;
    public Button eSalvarOp;
    public Button eLiberarMesa;
    public Button eReservarMesas;
    public Button eConfig;
    int counter;
    coresConfig cores = getInstance();
    @Override
    protected void onResume() {

        super.onResume();
        if(eReservarMesa1.isChecked()) {
            eMesa1.setBackgroundColor(cores.reservada);
            eReservarMesa1.setClickable(false);
        }else{
            eMesa1.setBackgroundColor(cores.liberada);
            eReservarMesa1.setClickable(true);
        }

        if(eReservarMesa2.isChecked()) {
            eMesa2.setBackgroundColor(cores.reservada);
            eReservarMesa2.setClickable(false);
        }else{
            eMesa2.setBackgroundColor(cores.liberada);
            eReservarMesa2.setClickable(true);
        }
        if(eReservarMesa3.isChecked()) {
            eMesa3.setBackgroundColor(cores.reservada);
            eReservarMesa3.setClickable(false);
        }else{
            eMesa3.setBackgroundColor(cores.liberada);
            eReservarMesa3.setClickable(true);
        }
        if(eReservarMesa4.isChecked()) {
            eMesa4.setBackgroundColor(cores.reservada);
            eReservarMesa4.setClickable(false);
        }else{
            eMesa4.setBackgroundColor(cores.liberada);
            eReservarMesa4.setClickable(true);
        }
        if(eReservarMesa5.isChecked()) {
            eMesa5.setBackgroundColor(cores.reservada);
            eReservarMesa5.setClickable(false);
        }else{
            eMesa5.setBackgroundColor(cores.liberada);
            eReservarMesa5.setClickable(true);
        }
        if(eReservarMesa6.isChecked()) {
            eMesa6.setBackgroundColor(cores.reservada);
            eReservarMesa6.setClickable(false);
        }else{
            eMesa6.setBackgroundColor(cores.liberada);
            eReservarMesa6.setClickable(true);
        }
        if(eReservarMesa7.isChecked()) {
            eMesa7.setBackgroundColor(cores.reservada);
            eReservarMesa7.setClickable(false);
        }else{
            eMesa7.setBackgroundColor(cores.liberada);
            eReservarMesa7.setClickable(true);
        }
        if(eReservarMesa8.isChecked()) {
            eMesa8.setBackgroundColor(cores.reservada);
            eReservarMesa8.setClickable(false);
        }else{
            eMesa8.setBackgroundColor(cores.liberada);
            eReservarMesa8.setClickable(true);
        }
        if(eReservarMesa9.isChecked()) {
            eMesa9.setBackgroundColor(cores.reservada);
            eReservarMesa9.setClickable(false);
        }else{
            eMesa9.setBackgroundColor(cores.liberada);
            eReservarMesa9.setClickable(true);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        eReservarMesa1 = findViewById(R.id.reservarMesa1);
        eReservarMesa2 = findViewById(R.id.reservarMesa2);
        eReservarMesa3 = findViewById(R.id.reservarMesa3);
        eReservarMesa4 = findViewById(R.id.reservarMesa4);
        eReservarMesa5 = findViewById(R.id.reservarMesa5);
        eReservarMesa6 = findViewById(R.id.reservarMesa6);
        eReservarMesa7 = findViewById(R.id.reservarMesa7);
        eReservarMesa8 = findViewById(R.id.reservarMesa8);
        eReservarMesa9 = findViewById(R.id.reservarMesa9);
        eMesa1 = findViewById(R.id.Mesa1);
        eMesa2 = findViewById(R.id.Mesa2);
        eMesa3 = findViewById(R.id.Mesa3);
        eMesa4 = findViewById(R.id.Mesa4);
        eMesa5 = findViewById(R.id.Mesa5);
        eMesa6 = findViewById(R.id.Mesa6);
        eMesa7 = findViewById(R.id.Mesa7);
        eMesa8 = findViewById(R.id.Mesa8);
        eMesa9 = findViewById(R.id.Mesa9);
        eMesa = findViewById(R.id.Mesa);
        eSalvarOp = findViewById(R.id.salvarOp);
        eReservarMesas = findViewById(R.id.reservarMesas);
        eLiberarMesa = findViewById(R.id.liberarMesa);
        cores.reservada = getResources().getColor(R.color.red);
        cores.liberada = getResources().getColor(R.color.blue);
        eConfig = findViewById(R.id.config);
        

        SharedPreferences tprefs = getSharedPreferences("com.example.provapdm", MODE_PRIVATE);
        SharedPreferences sharedPrefs = getSharedPreferences("com.example.provapdm", MODE_PRIVATE);
        eReservarMesa1.setChecked(sharedPrefs.getBoolean("Mesa1", false));
        eReservarMesa2.setChecked(sharedPrefs.getBoolean("Mesa2", false));
        eReservarMesa3.setChecked(sharedPrefs.getBoolean("Mesa3", false));
        eReservarMesa4.setChecked(sharedPrefs.getBoolean("Mesa4", false));
        eReservarMesa5.setChecked(sharedPrefs.getBoolean("Mesa5", false));
        eReservarMesa6.setChecked(sharedPrefs.getBoolean("Mesa6", false));
        eReservarMesa7.setChecked(sharedPrefs.getBoolean("Mesa7", false));
        eReservarMesa8.setChecked(sharedPrefs.getBoolean("Mesa8", false));
        eReservarMesa9.setChecked(sharedPrefs.getBoolean("Mesa9", false));

        if(eReservarMesa1.isChecked()) {
            eMesa1.setBackgroundColor(cores.reservada);
            eReservarMesa1.setClickable(false);
        }
        if(eReservarMesa2.isChecked()) {
            eMesa2.setBackgroundColor(cores.reservada);
            eReservarMesa2.setClickable(false);
        }
        if(eReservarMesa3.isChecked()) {
            eMesa3.setBackgroundColor(cores.reservada);
            eReservarMesa3.setClickable(false);
        }
        if(eReservarMesa4.isChecked()) {
            eMesa4.setBackgroundColor(cores.reservada);
            eReservarMesa4.setClickable(false);
        }
        if(eReservarMesa5.isChecked()) {
            eMesa5.setBackgroundColor(cores.reservada);
            eReservarMesa5.setClickable(false);
        }
        if(eReservarMesa6.isChecked()) {
            eMesa6.setBackgroundColor(cores.reservada);
            eReservarMesa6.setClickable(false);
        }
        if(eReservarMesa7.isChecked()) {
            eMesa7.setBackgroundColor(cores.reservada);
            eReservarMesa7.setClickable(false);
        }
        if(eReservarMesa8.isChecked()) {
            eMesa8.setBackgroundColor(cores.reservada);
            eReservarMesa8.setClickable(false);
        }
        if(eReservarMesa9.isChecked()) {
            eMesa9.setBackgroundColor(cores.reservada);
            eReservarMesa9.setClickable(false);
        }
        eReservarMesa1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton , boolean b) {
                if(eReservarMesa1.isChecked()){
                    eReservarMesa1.setClickable(false);
                    eMesa1.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa1", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa1", false);
                    editor.apply();
                }
            }
        });


        eReservarMesa2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(eReservarMesa2.isChecked()){
                    eReservarMesa2.setClickable(false);
                    eMesa2.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa2", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa2", false);
                    editor.apply();
                }

            };
        });
        eReservarMesa3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(eReservarMesa3.isChecked()){
                    eReservarMesa3.setClickable(false);
                    eMesa3.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa3", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa3", false);
                    editor.apply();
                }
            };
        });
        eReservarMesa4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(eReservarMesa4.isChecked()){
                    eReservarMesa4.setClickable(false);
                    eMesa4.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa4", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa4", false);
                    editor.apply();
                }
            };
        });
        eReservarMesa5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(eReservarMesa5.isChecked()){
                    eReservarMesa5.setClickable(false);
                    eMesa5.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa5", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa5", false);
                    editor.apply();
                }
            };
        });
        eReservarMesa6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(eReservarMesa6.isChecked()){
                    eReservarMesa6.setClickable(false);
                    eMesa6.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa6", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa6", false);
                    editor.apply();
                }
            };
        });
        eReservarMesa7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(eReservarMesa7.isChecked()){
                    eReservarMesa7.setClickable(false);
                    eMesa7.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa7", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa7", false);
                    editor.apply();
                }
            };
        });
        eReservarMesa8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(eReservarMesa8.isChecked()){
                    eReservarMesa8.setClickable(false);
                    eMesa8.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa8", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa8", false);
                    editor.apply();
                }
            };
        });
        eReservarMesa9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(eReservarMesa9.isChecked()){
                    eReservarMesa9.setClickable(false);
                    eMesa9.setBackgroundColor(cores.reservada);
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa9", true);
                    editor.apply();
                }
                else if(!eReservarMesa1.isChecked())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.provapdm", MODE_PRIVATE).edit();
                    editor.putBoolean("Mesa9", false);
                    editor.apply();
                }
            };
        });
        eLiberarMesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaInserida = eMesa.getText().toString();
                LinearLayout mesa = null;
                ToggleButton reservaMesa = null;
                if (mesaInserida.equals("1")){
                    if(!eReservarMesa1.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa1;
                    reservaMesa = eReservarMesa1;
                }
                else if (mesaInserida.equals("2")){
                    if(!eReservarMesa2.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa2;
                    reservaMesa = eReservarMesa2;
                }
                else if (mesaInserida.equals("3")){
                    if(!eReservarMesa3.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa3;
                    reservaMesa = eReservarMesa3;
                }
                else if (mesaInserida.equals("4")) {
                    if(!eReservarMesa4.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa4;
                    reservaMesa = eReservarMesa4;
                }
                else if (mesaInserida.equals("5")) {
                    if(!eReservarMesa5.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa5;
                    reservaMesa = eReservarMesa5;
                }
                else if (mesaInserida.equals("6")) {
                    if(!eReservarMesa6.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa6;
                    reservaMesa = eReservarMesa6;
                }
                else if (mesaInserida.equals("7")) {
                    if(!eReservarMesa7.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa7;
                    reservaMesa = eReservarMesa7;
                }
                else if (mesaInserida.equals("8")) {
                    if(!eReservarMesa8.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa8;
                    reservaMesa = eReservarMesa8;
                }
                else if (mesaInserida.equals("9")) {
                    if(!eReservarMesa9.isChecked()){
                        Toast.makeText(HomeActivity.this, "Mesa não reservada. A mesa "+mesaInserida+" encontra-se habilitada para reserva", Toast.LENGTH_SHORT).show();
                    }
                    mesa = eMesa9;
                    reservaMesa = eReservarMesa9;
                }

                if(mesa != null){
                    mesa.setBackgroundColor(cores.liberada);
                    reservaMesa.setClickable(true);
                    Toast.makeText(HomeActivity.this, "Mesa "+mesaInserida+" liberada", Toast.LENGTH_SHORT).show();
                    if(reservaMesa.isChecked()){
                        reservaMesa.toggle();
                    }
                }
                else{
                    Toast.makeText(HomeActivity.this, "Mesa invalida", Toast.LENGTH_SHORT).show();
                }
            };
    });
        eConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent config= new Intent(HomeActivity.this, ConfigActivity.class);
                startActivity(config);


            }
        });
        eReservarMesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 1; i < 10 ; i++){
                    int mesaInserida = i;
                    LinearLayout mesa = null;
                    ToggleButton reservaMesa = null;
                    if (mesaInserida == 1){
                        mesa = eMesa1;
                        reservaMesa = eReservarMesa1;
                    }
                    else if (mesaInserida == 2){
                        mesa = eMesa2;
                        reservaMesa = eReservarMesa2;
                    }
                    else if (mesaInserida == 3){
                        mesa = eMesa3;
                        reservaMesa = eReservarMesa3;
                    }
                    else if (mesaInserida == 4) {
                        mesa = eMesa4;
                        reservaMesa = eReservarMesa4;
                    }
                    else if (mesaInserida == 5) {
                        mesa = eMesa5;
                        reservaMesa = eReservarMesa5;
                    }
                    else if (mesaInserida == 6) {
                        mesa = eMesa6;
                        reservaMesa = eReservarMesa6;
                    }
                    else if (mesaInserida == 7) {
                        mesa = eMesa7;
                        reservaMesa = eReservarMesa7;
                    }
                    else if (mesaInserida == 8) {
                        mesa = eMesa8;
                        reservaMesa = eReservarMesa8;
                    }
                    else if (mesaInserida == 9) {
                        mesa = eMesa9;
                        reservaMesa = eReservarMesa9;
                    }
                    if(mesa != null){
                        mesa.setBackgroundColor(cores.reservada);
                        reservaMesa.setClickable(false);
                        if(!reservaMesa.isChecked()){
                            reservaMesa.toggle();
                            counter++;
                        }


                    }

                }
                if(counter == 0){
                    Toast.makeText(HomeActivity.this, "Operação inválida. Todas as mesas já possuem reserva", Toast.LENGTH_SHORT).show();
                    counter = 0;
                }else{
                    counter = 0;
                }
            }
        });

;}}
