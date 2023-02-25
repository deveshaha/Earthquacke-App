package com.dam.proyectoaadt2_deveshhanumante.dao;

import androidx.room.Insert;
import androidx.room.Query;

import com.dam.proyectoaadt2_deveshhanumante.entity.PaisAfectado;

import java.util.List;

public interface AfectadosDAO {

    @Query("SELECT * FROM PAISES_AFECTADOS")
    public List<PaisAfectado> getAll();

    @Insert
    public long insert(PaisAfectado paisAfectado);

}
