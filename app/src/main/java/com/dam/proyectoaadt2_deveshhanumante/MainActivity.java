package com.dam.proyectoaadt2_deveshhanumante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnFilter, btnConsult;
    TextView tvFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFilter = findViewById(R.id.btnSelectFilter);
        btnConsult = findViewById(R.id.btnConsult);
        tvFilter = findViewById(R.id.tv_filter);

        btnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showfilter();
            }
        });

        btnConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO:
            }
        });
    }


    private void showfilter() {
        FilterDialog fdiag = new FilterDialog();
        fdiag.show(getSupportFragmentManager(), "FilterDialog");
    }
}