package com.dam.proyectoaadt2_deveshhanumante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dam.proyectoaadt2_deveshhanumante.dao.AfectadosDAO;
import com.dam.proyectoaadt2_deveshhanumante.dao.TerremotosDao;
import com.dam.proyectoaadt2_deveshhanumante.data.PaisAfectadoData;
import com.dam.proyectoaadt2_deveshhanumante.data.TerremotoData;
import com.dam.proyectoaadt2_deveshhanumante.db.TerremotoDB;
import com.dam.proyectoaadt2_deveshhanumante.entity.PaisAfectado;
import com.dam.proyectoaadt2_deveshhanumante.entity.Terremotos;
import com.dam.proyectoaadt2_deveshhanumante.rvutil.TerremotoAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnFilter, btnConsult;
    TextView tvFilter;
    RecyclerView rv;
    TerremotoDB db;
    AfectadosDAO aDao;
    TerremotosDao tDao;
    ArrayList<Terremotos> listaTerremotos;
    ArrayList<PaisAfectado> listaPaises;
    LinearLayoutManager llm;
    TerremotoAdapter tadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFilter = findViewById(R.id.btnSelectFilter);
        btnConsult = findViewById(R.id.btnConsult);
        tvFilter = findViewById(R.id.tvFilter);
        rv = findViewById(R.id.rv_list);

        cargarBbdd();

        btnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showfilter();
            }
        });

        btnConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ordenarTerremotos();
                cargarRV();
            }
        });
    }

    private void cargarBbdd() {
        db = TerremotoDB.getDatabase(this);
        AfectadosDAO aDao = db.afectadosDAO();
        TerremotosDao tDao = db.terremotosDao();
        listaPaises = (ArrayList<PaisAfectado>) aDao.getAll();
        listaTerremotos = (ArrayList<Terremotos>) tDao.getAll();

        if (listaTerremotos.isEmpty()) {
            TerremotoData terremotos = new TerremotoData();
            for (Terremotos t : terremotos.getTerremotos()) {
                tDao.insert(t);
            }
        }

        if (listaPaises.isEmpty()) {
            PaisAfectadoData paises = new PaisAfectadoData();
            for (PaisAfectado p : paises.getPaisesAfectados()) {
                aDao.insert(p);
            }
        }
    }

    private void ordenarTerremotos() {
        tvFilter.setText("Todos los terremotos ordenados por magnitud");
        for (int i = 0; i < listaTerremotos.size(); i++) {
            for (int j = 0; j < listaTerremotos.size(); j++) {
                if (listaTerremotos.get(i).getMagnitud() > listaTerremotos.get(j).getMagnitud()) {
                    Terremotos aux = listaTerremotos.get(i);
                    listaTerremotos.set(i, listaTerremotos.get(j));
                    listaTerremotos.set(j, aux);
                }
            }
        }
    }

    private void cargarRV() {
        llm = new LinearLayoutManager(this);
        tadapter = new TerremotoAdapter(listaTerremotos);
        rv.setLayoutManager(llm);
        rv.setAdapter(tadapter);
        rv.setHasFixedSize(true);
    }


    private void showfilter() {
        cargarSpinners();
        FilterDialog fdiag = new FilterDialog();
        fdiag.show(getSupportFragmentManager(), "FilterDialog");
    }

    private void cargarSpinners() {
        ArrayList<String> paises = new ArrayList<>();
        for (PaisAfectado p : listaPaises) {
            paises.add(p.pais);
        }
        FilterDialog.setPaises(paises);

        ArrayList<String> magnitudesFilter = new ArrayList<>();
        magnitudesFilter.add(0, "Ninguno");
        magnitudesFilter.add(1, "<");
        magnitudesFilter.add(2, ">");
        magnitudesFilter.add(3, "=");
        magnitudesFilter.add(4, "<=");
        magnitudesFilter.add(5, ">=");
        FilterDialog.setMagnitudes(magnitudesFilter);
    }
}