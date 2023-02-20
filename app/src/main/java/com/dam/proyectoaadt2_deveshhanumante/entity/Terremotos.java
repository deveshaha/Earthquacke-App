package com.dam.proyectoaadt2_deveshhanumante.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;

import java.sql.Date;

@Entity(tableName = "TERREMOTOS")
public class Terremotos {
  /*
    La tabla TERREMOTOS contendrá:
        - la fecha y hora (clave primaria),
- el nombre del dispositivo (único),
- la magnitud (decimal de 0 a 10),
- las coordenadas del epicentro,
- el lugar,
- el cantidad de muertos.

   */
    @androidx.room.PrimaryKey(autoGenerate = true)
    public Date fechayhora;

    @ColumnInfo(name = "nombreDispositivo")
    public String nombreDispositivo;

    @ColumnInfo(name = "magnitud")
    public double magnitud;

    @ColumnInfo(name = "latitud")
    public double latitud;

    @ColumnInfo(name = "longitud")
    public double longitud;

    @ColumnInfo(name = "lugar")
    public String lugar;

    @ColumnInfo(name = "muertos")
    public int muertos;

    public Terremotos(Date fechayhora, String nombreDispositivo, double magnitud, double latitud, double longitud, String lugar, int muertos) {
        this.fechayhora = fechayhora;
        this.nombreDispositivo = nombreDispositivo;
        this.magnitud = magnitud;
        this.latitud = latitud;
        this.longitud = longitud;
        this.lugar = lugar;
        this.muertos = muertos;
    }

    public Date getFechayhora() {
        return fechayhora;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public double getMagnitud() {
        return magnitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getLugar() {
        return lugar;
    }

    public int getMuertos() {
        return muertos;
    }
}
