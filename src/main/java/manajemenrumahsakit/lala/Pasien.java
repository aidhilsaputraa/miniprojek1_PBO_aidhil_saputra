/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi ini
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit template ini
 */
package manajemenrumahsakit.entitas;

/**
 *
 * Penulis: Lenovo GK
 */
public class Pasien {
    private final String id;
    private final String nama;
    private final int umur;

    public static int jumlahPasien = 0;

    // Konstruktor
    public Pasien(String id, String nama, int umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        jumlahPasien++;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Metode untuk menampilkan info pasien
    public void tampilkanInfoPasien() {
        System.out.println("ID Pasien: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
