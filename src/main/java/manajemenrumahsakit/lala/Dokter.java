/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi ini
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit template ini
 */
package manajemenrumahsakit.entitas;

/**
 *
 * Penulis: Lenovo GK
 */
public class Dokter {
    private final String id;
    private final String nama;
    private final String spesialisasi;

    public static int jumlahDokter = 0;

    // Konstruktor
    public Dokter(String id, String nama, String spesialisasi) {
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        jumlahDokter++;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    // Metode untuk menampilkan info dokter
    public void tampilkanInfoDokter() {
        System.out.println("ID Dokter: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Spesialisasi: " + spesialisasi);
    }
}
