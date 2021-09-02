package com.example.provapdm;
import java.util.HashMap;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText eUsuario;
    private EditText eSenha;
    private Button eEntrar;

    private String Usuario1 = "Administrador";private String Senha1 = "Administrador";
    private String Usuario2 = "Adm";private String Senha2 = "Adm123";
    private String Usuario3 = "Administrator";private String Senha3 = "Que3B1eng4ElT0r0";
    private String Usuario4 = "Root";private String Senha4 = "pr0m1uscu0";
    boolean Valido = false;
    coresConfig cores = coresConfig.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    eUsuario = findViewById(R.id.etUsuario);
    eSenha = findViewById(R.id.etSenha);
    eEntrar = findViewById(R.id.etEntrar);

    eEntrar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String usuarioInserido = eUsuario.getText().toString();
            String senhaInserida = eSenha.getText().toString();

            if(usuarioInserido.isEmpty()||senhaInserida.isEmpty()){
                Toast.makeText(MainActivity.this,"Preencha todos os campos",Toast.LENGTH_SHORT).show();
            }else{
                Valido = validar(usuarioInserido,senhaInserida);

                if(!Valido){

                    Toast.makeText(MainActivity.this,"usuario ou senha inseridos inválidos",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Login efetuado com sucesso",Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);


                }
            }
        }
    });
}   private boolean validar(String usuario, String senha) {
        if (usuario.equals(Usuario1) && senha.equals(Senha1)) {
            return true;
        }
        else if (usuario.equals(Usuario2) && senha.equals(Senha2)) {
            return true;
        }
        else if (usuario.equals(Usuario3) && senha.equals(Senha3)) {
            return true;
        }
        else if (usuario.equals(Usuario4) && senha.equals(Senha4)) {
            return true;
        }
        return false;
    }
}