package com.example.sikomen_kesmas;

import java.util.ArrayList;

public class KlinikDatas {
    private static String[] klinikNames = {
            "MD Clinic Bogor",
            "Klinik Medira",
            "Puskesmas. Kedung Badak",
            "Puskesmas Tanah Sareal Kota Bogor",
};

    private  static String[] lokasiKlinik = {
          "Tanah Sareal",
            "Tanah Sareal",
            "Tanah Sareal",
            "Tanah Sareal",
            "Tanah Sareal",
            "Tanah Sareal",
    };

    private static String[][] statusKlink = {
            {"Buka", "Tutup pukul 20.00"},
            {"Buka", "Tutup pukul 21.00"},
            {"Buka", "Tutup pukul 20.00"},
            {"Buka", "Tutup pukul 20.00"},
            {"Buka", "Tutup pukul 20.00"},
            {"Buka", "24 Jam"}
    };

    private static int[] fotoKlinik = {

    };

    static ArrayList<KlinikDatas> getListData() {
        ArrayList<KlinikDatas> list = new ArrayList<>();
        for (int i = 0; i < klinikNames.length; i++) {
            DataKlinik klinik = new DataKlinik();
            klinik.setLokasiKlinik(lokasiKlinik[i]);
            klinik.setStatusKlinik(statusKlink[i][0]);
            klinik.setJadwalPraktik(statusKlink[i][2]);
        }
        return list;
    }

}
