package com.dam.proyectoaadt2_deveshhanumante.db;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.dam.proyectoaadt2_deveshhanumante.dao.AfectadosDAO;
import com.dam.proyectoaadt2_deveshhanumante.dao.TerremotosDao;
import com.dam.proyectoaadt2_deveshhanumante.entity.Terremotos;

@androidx.room.Database(entities = {com.dam.proyectoaadt2_deveshhanumante.entity.Terremotos.class, com.dam.proyectoaadt2_deveshhanumante.entity.PaisAfectado.class}, version = 1)
public abstract class TerremotoDB extends RoomDatabase {

    public abstract TerremotosDao terremotosDao();

    public abstract AfectadosDAO afectadosDAO();

    private static TerremotoDB terremotoDB;

    public static TerremotoDB getDatabase(Context context) {
        if (terremotoDB == null) {
            terremotoDB = Room.databaseBuilder(
                            context.getApplicationContext(),
                            TerremotoDB.class, "TERREMOTOS_DB")
                    .allowMainThreadQueries()
                    .build();
        }
        return terremotoDB;
    }
}
