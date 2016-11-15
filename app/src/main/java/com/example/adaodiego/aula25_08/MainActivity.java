package com.example.adaodiego.aula25_08;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText campo_usuario;
    EditText campo_senha;
    Button botao_entrar;
    Button botao_esq_senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo_usuario = (EditText ) findViewById(R.id.campo_usuario);
        campo_senha = (EditText ) findViewById(R.id.campo_senha);
        botao_entrar = (Button ) findViewById(R.id.botao_entrar);
        botao_esq_senha = (Button ) findViewById(R.id.botao_esq_senha);
        botao_entrar.setOnClickListener(this);
        botao_esq_senha.setOnClickListener(this);



    }


    public void onClick (View v){

        String us= campo_usuario.getText().toString();
        String sen= campo_senha.getText().toString();

        switch (v.getId()){

            case R.id.botao_entrar:

                if(us.equals("admin") && sen.equals("123")) {

                    Intent intent = new Intent(MainActivity.this, PrincipalActivity.class);
                    startActivity(intent);
                }
                else
                {

                    AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                    alertDialog.setTitle("Erro na senha");
                    alertDialog.setMessage("Usuário ou senha inválidos");
                    alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    alertDialog.show();


                }

                break;

            case R.id.botao_esq_senha:

                campo_usuario.setText(null);
                campo_senha.setText(null);

                break;
            default:
                break;

        }

    }



}
