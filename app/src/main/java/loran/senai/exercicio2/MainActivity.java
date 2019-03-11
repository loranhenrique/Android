package loran.senai.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btImc, btVogal, btSoma;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btImc = findViewById(R.id.btImc);
        btVogal = findViewById(R.id.btVogal);
        btSoma = findViewById(R.id.btSoma);
        editText = findViewById(R.id.editText);

        btImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TelaIMC.class);
                startActivity(i);
            }
        });

        btVogal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String frase = editText.getText().toString();

                int vog = 0, cons = 0;

                frase = frase.toLowerCase();
                for(int i = 0; i < frase.length(); i++){
                    char c = frase.charAt(i);
                    if(c == 32) continue;
                    if(c == 97 | c == 101 | c == 105 | c == 111| c == 117){
                        vog++;
                        continue;
                    }
                    if(c >= 98 && c <= 122){
                        cons++;
                    }
                }

                Toast.makeText(getApplicationContext(),         //contexto
                        "Vogal: " + vog + "\nConsoante: " + cons,    //Mensagem
                        Toast.LENGTH_SHORT).show();             //Duração

            }
        });

        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = 0;
                Intent i2 = new Intent(getApplicationContext(), TelaSoma.class);


                int numero = Integer.parseInt(editText.getText().toString());

                for(int i = numero; i > 0; i--){
                    resultado = resultado+i;
                }

                i2.putExtra("numero", resultado);
                startActivity(i2);
            }
        });
    }
}
