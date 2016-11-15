package com.example.adaodiego.aula25_08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

import br.com.jansenfelipe.androidmask.MaskEditTextChangedListener;

public class CadastroActivity extends AppCompatActivity {

    Button gravar;
    Button apagar;
    RadioButton rb_cao;
    RadioButton rb_gato;
    CheckBox domi;
   // SeekBar seekaltura;
   // Spinner spinnerfidelidade;
    EditText nome;
    EditText contato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        gravar = (Button) findViewById(R.id.gravar);
        apagar = (Button) findViewById(R.id.botao_esq_senha);
        rb_cao = (RadioButton) findViewById(R.id.rb_cao);
        rb_gato = (RadioButton) findViewById(R.id.rb_gato);
        domi = (CheckBox) findViewById(R.id.cheCk_domi);
     //   seekaltura = (SeekBar) findViewById(R.id.seekaltura);
       // spinnerfidelidade = (Spinner) findViewById(R.id.spinnerfidelidade);
        nome = (EditText) findViewById(R.id.campo_nome);
        contato = (EditText) findViewById(R.id.contato);
        MaskEditTextChangedListener contatoMask = new MaskEditTextChangedListener("(##)####-####", contato);
        contato.addTextChangedListener(contatoMask);


//        gravar.setOnClickListener((View.OnClickListener) this);
//        apagar.setOnClickListener((View.OnClickListener) this);
//



    }


    public void onClick(View v) {

        String no = nome.getText().toString();
        String con = contato.getText().toString();

        switch (v.getId()) {

            case R.id.apagar:

                nome.setText(null);
                contato.setText(null);

                break;



            case R.id.gravar:

                Intent intent = new Intent(CadastroActivity.this, ResultadoCadastroActivity.class);
                startActivity(intent);
                break;

            default:
                break;

        }
    }
}
