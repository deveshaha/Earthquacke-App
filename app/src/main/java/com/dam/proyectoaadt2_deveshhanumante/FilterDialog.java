package com.dam.proyectoaadt2_deveshhanumante;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;

public class FilterDialog extends DialogFragment {

    private static ArrayList<String> paises;
    private static ArrayList<String> magnitudes;
    Spinner spnMagnitude, spnCountry;
    EditText etMagnitud;

    public static void setPaises(ArrayList<String> paises) {
        FilterDialog.paises = paises;
        paises.add(0, "Ninguno");
    }

    public static void setMagnitudes(ArrayList<String> magnitudes) {
        FilterDialog.magnitudes = magnitudes;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_filter, null);

        spnMagnitude = view.findViewById(R.id.spnMagnitud);
        spnCountry = view.findViewById(R.id.spnCountry);
        etMagnitud = view.findViewById(R.id.etMagFilter);

        ArrayAdapter<String> aPaises = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, paises);
        aPaises.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> aMagnitudes = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, magnitudes);
        aMagnitudes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnMagnitude.setAdapter(aMagnitudes);
        spnCountry.setAdapter(aPaises);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);

        builder.setTitle("Filtrar Terremotos").setPositiveButton("Aceptar", null).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.setCanceledOnTouchOutside(true);

        return alertDialog;
    }
}
