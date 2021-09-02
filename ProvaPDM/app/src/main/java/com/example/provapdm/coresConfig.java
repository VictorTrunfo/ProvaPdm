package com.example.provapdm;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;

public class coresConfig extends AppCompatActivity {
    private static coresConfig coresConfig_instance = null;
     int reservada = 0;
     int liberada = 0;



    public static coresConfig getInstance()
    {
        if (coresConfig_instance == null) {
            coresConfig_instance = new coresConfig();
        }

        return coresConfig_instance;
    }
    public void setarLiberada(int codCor){

        this.liberada = codCor;
    }
    public  void setarReservada(int codCor){

        this.reservada = codCor;
    }
}
