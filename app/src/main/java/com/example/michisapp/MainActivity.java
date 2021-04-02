package com.example.michisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.michisapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ActivityMainBinding bindig = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bindig.getRoot());

        bindig.boton.setOnClickListener(v -> {
            String edad = bindig.edadEdit.getText().toString();
            if(!edad.isEmpty()){
                int edadValor = Integer.parseInt(edad);

                int resul = edadValor * 7;
                String resultado = getString(R.string.result_format, resul);
                bindig.resultadoText.setText(resultado);

            } else{
                Log.d("ActividadPrincipal", "El campo no tiene contenido ");
                Toast.makeText(this, getString(R.string.Debes_insertar_una_edad), Toast.LENGTH_SHORT).show();
            }
        });

    }
}