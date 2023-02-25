package com.dam.proyectoaadt2_deveshhanumante.rvutil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.proyectoaadt2_deveshhanumante.R;
import com.dam.proyectoaadt2_deveshhanumante.entity.Terremotos;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TerremotoAdapter extends RecyclerView.Adapter<TerremotoAdapter.TerremotoVH> {

    ArrayList<Terremotos> datos;

    public TerremotoAdapter(ArrayList<Terremotos> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public TerremotoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.terremoto_item, parent, false);
        return new TerremotoVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TerremotoVH holder, int position) {
        holder.bindTerremoto(datos.get(position));
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class TerremotoVH extends RecyclerView.ViewHolder {

        TextView tvNombre, tvMagnitud, tvCoordenadas, tvLugar, tvFecha, tvMuertos;
        public TerremotoVH(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvMagnitud = itemView.findViewById(R.id.tvMagnitud);
            tvCoordenadas = itemView.findViewById(R.id.tvCoordenadas);
            tvLugar = itemView.findViewById(R.id.tvLugar);
            tvFecha = itemView.findViewById(R.id.tvFecha);
            tvMuertos = itemView.findViewById(R.id.tvMuertos);
        }

        public void bindTerremoto(Terremotos t) {
            tvNombre.setText(t.getNombreDispositivo());
            tvMagnitud.setText(String.valueOf(t.getMagnitud()));
            tvCoordenadas.setText(t.getCoordenadas());
            tvLugar.setText(t.getLugar());
            tvFecha.setText(t.getFechayhora());
            tvMuertos.setText(t.getMuertos());
        }
    }
}
