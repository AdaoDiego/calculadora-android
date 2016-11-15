package com.example.adaodiego.aula25_08;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    Button voltar;
    TextView result;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();
        String op = bundle.getString("op");
        float num1 = bundle.getFloat("num1");
        float num2 = bundle.getFloat("num2");
        Float resultado = null;
        String resultados;


        if(op.equals("+")){

            resultado = num1 + num2;
        }

        else if(op.equals("-")){
            resultado = num1 - num2;
        }

        else if(op.equals("/")){
            resultado = num1/num2;
        }

        else if(op.equals("*")){
            resultado = num1*num2;
        }





        voltar = (Button) findViewById(R.id.voltar);
     result = (TextView) findViewById(R.id.result);





        resultados = String.valueOf(resultado);
        result.setText("Resultado: "+resultados);


        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(ResultadoActivity.this, CalculadoraActivity.class);
                startActivity(intent);

            }
        });


            }

    }

