package com.example.adaodiego.aula25_08;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraActivity extends AppCompatActivity {


    TextView visor;
    float num1, num2, result;
    String op;

    boolean ponto = false;
    boolean flag = true;
    Button button_zero;
    Button button_um;
    Button button_dois;
    Button button_tres;
    Button button_quatro;
    Button button_cinco;
    Button button_seis;
    Button button_sete;
    Button button_oito;
    Button button_nove;
    Button button_del;
    Button button_c;
    Button button_reverter;
    Button button_perc;
    Button button_mult;
    Button button_divi;
    Button button_soma;
    Button button_sub;
    Button button_igual;
    Button button_ponto;

    public String texto_visor = "";




    public void func( String texto_visor){

        ponto = false;

        if(flag){
            num1 = Integer.parseInt(texto_visor);

            flag = false;

        }
        else {

            num2 = Integer.parseInt(texto_visor);
            flag = true;



        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        visor = (TextView) findViewById(R.id.visor);
        button_zero = (Button) findViewById(R.id.button_zero);
        button_um = (Button) findViewById(R.id.button_um);
        button_dois = (Button) findViewById(R.id.button_dois);
        button_tres = (Button) findViewById(R.id.button_tres);
        button_quatro = (Button) findViewById(R.id.button_quatro);
        button_cinco = (Button) findViewById(R.id.button_cinco);
        button_seis = (Button) findViewById(R.id.button_seis);
        button_sete = (Button) findViewById(R.id.button_sete);
        button_oito = (Button) findViewById(R.id.button_oito);
        button_nove = (Button) findViewById(R.id.button_nove);
        button_del = (Button) findViewById(R.id.button_del);
        button_c = (Button) findViewById(R.id.button_c);
        button_reverter = (Button) findViewById(R.id.button_reverter);
        button_perc = (Button) findViewById(R.id.button_perc);
        button_mult = (Button) findViewById(R.id.button_mult);
        button_divi = (Button) findViewById(R.id.button_divi);
        button_soma = (Button) findViewById(R.id.button_soma);
        button_sub = (Button) findViewById(R.id.button_sub);
        button_igual = (Button) findViewById(R.id.button_igual);
        button_ponto = (Button) findViewById(R.id.button_ponto);


        button_zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "0";
                visor.setText(texto_visor);

            }
        });
        button_del.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor = "";
                visor.setText(texto_visor);

            }
        });

        button_um.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "1";
                visor.setText(texto_visor);


            }
        });

        button_dois.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "2";
                visor.setText(texto_visor);

            }
        });

        button_tres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "3";
                visor.setText(texto_visor);

            }
        });

        button_quatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "4";
                visor.setText(texto_visor);

            }
        });
        button_cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "5";
                visor.setText(texto_visor);

            }
        });
        button_seis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "6";
                visor.setText(texto_visor);

            }
        });
        button_sete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "7";
                visor.setText(texto_visor);

            }
        });

        button_oito.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "8";
                visor.setText(texto_visor);
            }
        });
        button_nove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto_visor += "9";
                visor.setText(texto_visor);

            }
        });
        button_ponto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!ponto){

                    texto_visor += ".";
                    ponto =  true;
                    visor.setText(texto_visor);
                }

            }
        });

        button_soma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                op = "+";
                func(texto_visor);
                texto_visor = "";
                visor.setText(texto_visor);

            }
        });

        button_divi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               op = ("/");
                func(texto_visor);
                texto_visor = "";
                visor.setText(texto_visor);

            }
        });

        button_mult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                op = ("*");
                func(texto_visor);
                texto_visor = "";
                visor.setText(texto_visor);

            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                op = "-";
                func(texto_visor);
                texto_visor = "";
                visor.setText(texto_visor);

            }
        });

        button_igual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                func(texto_visor);

                Intent intent = new Intent(CalculadoraActivity.this, ResultadoActivity.class);




                    Bundle bundle = new Bundle();

                    bundle.putFloat("num1",num1);
                    intent.putExtras(bundle);
                    bundle.putFloat("num2", num2);
                    intent.putExtras(bundle);
                    bundle.putString("op", op);
                    intent.putExtras(bundle);

                    startActivity(intent);
                    texto_visor = "";
                    visor.setText(texto_visor);


                visor.setText(texto_visor);



            }
        });





        button_perc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                visor.setText(texto_visor);

            }
        });




    }}