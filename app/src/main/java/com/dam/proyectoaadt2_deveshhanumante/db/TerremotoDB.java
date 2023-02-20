package com.dam.proyectoaadt2_deveshhanumante.db;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.dam.proyectoaadt2_deveshhanumante.dao.TerremotosDao;

public abstract class TerremotoDB extends RoomDatabase {

    public abstract TerremotosDao terremotosDao();

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
