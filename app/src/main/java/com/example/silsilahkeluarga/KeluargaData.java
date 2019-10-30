package com.example.silsilahkeluarga;

import java.util.ArrayList;

public class KeluargaData {
    private static String[] keluargaNama = {
            "Maslakat",
            "Binti Kasanah",
            "David Everaldo",
            "Anngie Natasya Listyawan",
    };

    private static String[] keluargaKeterangan = {
            "Ayah",
            "Ibu",
            "Anak Pertama",
            "Anak Kedua"
    };

    private static int[] heroesImages = {
            R.drawable.maslakat,
            R.drawable.binti,
            R.drawable.david,
            R.drawable.anggie
    };

    static ArrayList<Keluarga> getListData() {
        ArrayList<Keluarga> list = new ArrayList<>();
        for (int pos = 0; pos < keluargaNama.length; pos++){
            Keluarga keluarga = new Keluarga();
            keluarga.setNama(keluargaNama[pos]);
            keluarga.setKeterangan(keluargaKeterangan[pos]);
            keluarga.setFoto(heroesImages[pos]);
            list.add(keluarga);
        }
        return list;
    }
}
