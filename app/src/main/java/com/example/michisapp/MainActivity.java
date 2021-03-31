package com.example.michisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edadEdit = findViewById(R.id.años_edit);
        TextView resulText = findViewById(R.id.resultado_text);
        Button boton = findViewById(R.id.boton);

        boton.setOnClickListener(v -> {
            String edad = edadEdit.getText().toString();
            if(!edad.isEmpty()){
                int edadValor = Integer.parseInt(edad);

                int resul = edadValor * 7;
                String resultado = getString(R.string.result_format, resul);
                resulText.setText(resultado);

            } else{
                Log.d("ActividadPrincipal", "El campo no tiene contenido ");
                Toast.makeText(this, getString(R.string.Debes_insertar_una_edad), Toast.LENGTH_SHORT).show();
            }
        });

    }
}