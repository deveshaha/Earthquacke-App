package com.dam.proyectoaadt2_deveshhanumante.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;

import java.sql.Date;

@Entity(tableName = "TERREMOTOS")
public class Terremotos {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "fechayhora")
    public String fechayhora;

    @ColumnInfo(name = "magnitud")
    public double magnitud;

    @ColumnInfo(name = "nombreDispositivo")
    public String nombreDispositivo;

    @ColumnInfo(name = "lugar")
    public String lugar;

    @ColumnInfo(name = "coordenadas")
    public String coordenadas;

    @ColumnInfo(name = "muertos")
    public String muertos;

    public Terremotos(String fechayhora, double magnitud, String nombreDispositivo, String lugar, String coordenadas, String muertos) {
        this.fechayhora = fechayhora;
        this.magnitud = magnitud;
        this.nombreDispositivo = nombreDispositivo;
        this.lugar = lugar;
        this.coordenadas = coordenadas;
        this.muertos = muertos;
    }

    public String getFechayhora() {
        return fechayhora;
    }

    public double getMagnitud() {
        return magnitud;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public String getLugar() {
        return lugar;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public String getMuertos() {
        return muertos;
    }
}
