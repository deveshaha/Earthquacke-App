package com.dam.proyectoaadt2_deveshhanumante.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "PAISES_AFECTADOS"
    , primaryKeys = {"pais", "fecha"}, foreignKeys = {
        @ForeignKey(entity = Terremotos.class, parentColumns = "fechayhora", childColumns = "fecha")
    })

public class PaisAfectado {

    @NonNull
    @ColumnInfo(name = "fecha")
    public String fechayhora;

    @NonNull
    @ColumnInfo(name = "pais")
    public String pais;

    public PaisAfectado(String fechayhora, String pais) {
        this.fechayhora = fechayhora;
        this.pais = pais;
    }
}
