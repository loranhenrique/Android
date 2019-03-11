package loran.senai.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class TelaSoma extends AppCompatActivity {

    private TextView tvResul2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_soma);

        tvResul2 = findViewById(R.id.tvResul2);

        int resultado = getIntent().getIntExtra("numero", 1);

        tvResul2.setText(""+resultado);
    }
}
