package com.dam.proyectoaadt2_deveshhanumante.data;

import com.dam.proyectoaadt2_deveshhanumante.db.TerremotoDB;
import com.dam.proyectoaadt2_deveshhanumante.entity.PaisAfectado;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PaisAfectadoData {

    public static ArrayList<PaisAfectado> listaPaises;

    public PaisAfectadoData() {
        listaPaises = new ArrayList<>();

        listaPaises.add(new PaisAfectado("22 de mayo de 1960, 15:11", "Chile"));
        listaPaises.add(new PaisAfectado("26 de diciembre de 2004, 07:58", "Indonesia"));
        listaPaises.add(new PaisAfectado("27 de marzo de 1964, 17:36", "Estados Unidos"));
        listaPaises.add(new PaisAfectado("11 de marzo de 2011, 14:46", "Japón"));
        listaPaises.add(new PaisAfectado("4 de noviembre de 1952, 16:58", "Rusia"));
        listaPaises.add(new PaisAfectado("13 de agosto de 1868, 21:30", "Chile"));
        listaPaises.add(new PaisAfectado("28 de octubre de 1746, 22:30", "Perú"));
        listaPaises.add(new PaisAfectado("26 de enero de 1700, 21:30", "Estados Unidos"));
        listaPaises.add(new PaisAfectado("27 de febrero de 2010, 03:34", "Chile"));
        listaPaises.add(new PaisAfectado("6 de febrero de 2023, 01:17", "Turquía"));
        listaPaises.add(new PaisAfectado("6 de febrero de 2023, 01:17", "Siria"));
        listaPaises.add(new PaisAfectado("31 de enero de 1906, 15:36", "Ecuador"));
        listaPaises.add(new PaisAfectado("31 de enero de 1906, 15:36", "Colombia"));
        listaPaises.add(new PaisAfectado("25 de noviembre de 1833, 20:00", "Indonesia"));
        listaPaises.add(new PaisAfectado("1 de noviembre de 1755, 10:16", "Portugal"));
        listaPaises.add(new PaisAfectado("8 de julio de 1730, 04:45", "Chile"));
        listaPaises.add(new PaisAfectado("11 de abril de 2012, 15:38", "Indonesia"));
        listaPaises.add(new PaisAfectado("28 de marzo de 2005, 23:09", "Indonesia"));
        listaPaises.add(new PaisAfectado("9 de marzo de 1957, 14:22", "Estados Unidos"));
        listaPaises.add(new PaisAfectado("15 de agosto de 1950", "India"));
        listaPaises.add(new PaisAfectado("15 de agosto de 1950", "China"));
        listaPaises.add(new PaisAfectado("10 de noviembre de 1922, 23:53", "Argentina"));
        listaPaises.add(new PaisAfectado("28 de marzo de 1787, 11:30", "México"));
        listaPaises.add(new PaisAfectado("3 de febrero de 1923, 04:58", "Rusia"));
        listaPaises.add(new PaisAfectado("20 de octubre de 1687, 09:15", "Perú"));
        listaPaises.add(new PaisAfectado("16 de diciembre de 1575, 14:30", "Chile"));
        listaPaises.add(new PaisAfectado("16 de septiembre de 2015, 19:54", "Chile"));
        listaPaises.add(new PaisAfectado("23 de junio de 2001, 15:33", "Perú"));

    }

    public static ArrayList<PaisAfectado> getListaPaises() {
        return listaPaises;
    }

    public PaisAfectado[] getPaisesAfectados() {
        PaisAfectado[] paises = new PaisAfectado[listaPaises.size()];
        for (int i = 0; i < listaPaises.size(); i++) {
            paises[i] = listaPaises.get(i);
        }
        return paises;
    }
}
