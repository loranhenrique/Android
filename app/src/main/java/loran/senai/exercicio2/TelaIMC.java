package loran.senai.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaIMC extends AppCompatActivity {

    private Button btCalcular;
    private EditText etPeso, etAltura;
    float resultado, peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_imc);

        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
        btCalcular = findViewById(R.id.btCalcular);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TelaIMC2.class);

                peso = Float.valueOf(etPeso.getText().toString());
                altura = Float.valueOf(etAltura.getText().toString());

                resultado = peso / (altura*altura);
                i.putExtra("resultado", resultado);
                startActivity(i);
            }
        });
    }
}
