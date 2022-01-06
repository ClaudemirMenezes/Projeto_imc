package com.exe.projetoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final float[] imc = new float[1];
        Button btcalcular = (Button) findViewById(R.id.btcalcular);
        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView Resultado = (TextView) findViewById(R.id.Resultado);
                TextView Descricao = (TextView) findViewById(R.id.Descricao);

                int peso = Integer.parseInt(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());

                imc[0] = peso / (altura * altura);

                if (imc[0] < 18.5){
                    Resultado.setText(imc[0]+ "");
                    Descricao.setText("Baixo Peso");
                }else {
                    if (imc[0] < 25){
                        Resultado.setText(imc[0] + "");
                        Descricao.setText("Peso Adequado");
                    }else {
                        if (imc[0] < 30){
                            Resultado.setText(imc[0] + "");
                            Descricao.setText("Sobre Peso");
                        }else {
                            Resultado.setText(imc[0] + "");
                            Descricao.setText("Obesidade");
                        }
                    }
                }
            }
        });
    }
}