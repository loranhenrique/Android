package loran.senai.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class TelaIMC2 extends AppCompatActivity {

    private TextView tvSitu, tvResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_imc2);

        tvResul = findViewById(R.id.tvResul);
        tvSitu = findViewById(R.id.tvSitu);

        float resultado = getIntent().getFloatExtra("resultado", 1);

        Toast.makeText(getApplicationContext(),         //contexto
                "valor: " + resultado,    //Mensagem
                Toast.LENGTH_SHORT).show();             //Duração

        if(resultado >= 0 && resultado < 18.5){
            tvResul.setText(""+resultado);
            tvSitu.setText("Muito magro");
        }

        if(resultado >= 18.5 && resultado <= 24.9){
            tvResul.setText(""+resultado);
            tvSitu.setText("Normal");
        }

        if(resultado >= 25 && resultado <= 29.9){
            tvResul.setText(""+resultado);
            tvSitu.setText("Sobrepeso");
        }

        if(resultado >= 30 && resultado <= 34.9){
            tvResul.setText(""+resultado);
            tvSitu.setText("Obeso grau I");
        }

        if(resultado >= 35 && resultado <= 39.9){
            tvResul.setText(""+resultado);
            tvSitu.setText("Obeso grau II");
        }

        if(resultado >= 40 && resultado < 100){
            tvResul.setText(""+resultado);
            tvSitu.setText("Obeso grau III");
        }
    }
}
