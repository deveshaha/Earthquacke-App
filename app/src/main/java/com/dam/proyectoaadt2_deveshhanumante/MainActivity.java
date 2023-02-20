package com.dam.proyectoaadt2_deveshhanumante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFilter, btnConsult;
    TextView tvFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFilter = findViewById(R.id.btnSelectFilter);
        btnConsult = findViewById(R.id.btnConsult);
        tvFilter = findViewById(R.id.tv_filter);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSelectFilter) {
            showfilter();
        } else if (view.getId() == R.id.btnConsult) {
            tvFilter.setText("Consult");
        }

    }

    private void showfilter() {
        //Si se pulsa el botón Seleccionar filtro se abrirá un cuadro de dialogo
        //para seleccionar el filtro.

    }
}