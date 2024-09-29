package manajemenrumahsakit;

import manajemenrumahsakit.entitas.Dokter;
import manajemenrumahsakit.entitas.Pasien;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    // ArrayList untuk menyimpan data dokter dan pasien
    private static ArrayList<Dokter> daftarDokter = new ArrayList<>();
    private static ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Rumah Sakit ===");
            System.out.println("1. Tambah Dokter");
            System.out.println("2. Tambah Pasien");
            System.out.println("3. Lihat Daftar Dokter");
            System.out.println("4. Lihat Daftar Pasien");
            System.out.println("5. Update Dokter");
            System.out.println("6. Update Pasien");
            System.out.println("7. Hapus Dokter");
            System.out.println("8. Hapus Pasien");
            System.out.println("9. Keluar");
            System.out.print("Pilih opsi: ");
            while (!scanner.hasNextInt()) { // Validasi input agar hanya menerima integer
                System.out.println("Masukkan angka yang valid.");
                scanner.next(); // Menunggu input baru
            }
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahDokter(scanner);
                    break;
                case 2:
                    tambahPasien(scanner);
                    break;
                case 3:
                    lihatDokter();
                    break;
                case 4:
                    lihatPasien();
                    break;
                case 5:
                    updateDokter(scanner);
                    break;
                case 6:
                    updatePasien(scanner);
                    break;
                case 7:
                    hapusDokter(scanner);
                    break;
                case 8:
                    hapusPasien(scanner);
                    break;
                case 9:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        } while (pilihan != 9);
    }

    // Metode untuk menambah dokter
    public static void tambahDokter(Scanner scanner) {
        System.out.print("Masukkan ID Dokter: ");
        String id = scanner.next();
        System.out.print("Masukkan Nama Dokter: ");
        String nama = scanner.next();
        System.out.print("Masukkan Spesialisasi Dokter: ");
        String spesialisasi = scanner.next();

        Dokter dokter = new Dokter(id, nama, spesialisasi);
        daftarDokter.add(dokter);
        System.out.println("Dokter berhasil ditambahkan!");
    }

    // Metode untuk menambah pasien
    public static void tambahPasien(Scanner scanner) {
        System.out.print("Masukkan ID Pasien: ");
        String id = scanner.next();
        System.out.print("Masukkan Nama Pasien: ");
        String nama = scanner.next();
        System.out.print("Masukkan Umur Pasien: ");
        while (!scanner.hasNextInt()) { // Validasi input untuk umur agar integer
            System.out.println("Masukkan umur yang valid.");
            scanner.next(); // Menunggu input baru
        }
        int umur = scanner.nextInt();

        Pasien pasien = new Pasien(id, nama, umur);
        daftarPasien.add(pasien);
        System.out.println("Pasien berhasil ditambahkan!");
    }

    // Metode untuk melihat daftar dokter
    public static void lihatDokter() {
        System.out.println("\n--- Daftar Dokter ---");
        if (daftarDokter.isEmpty()) {
            System.out.println("Tidak ada dokter yang tersedia.");
        } else {
            for (Dokter dokter : daftarDokter) {
                dokter.tampilkanInfoDokter();
                System.out.println("--------------------");
            }
        }
    }

    // Metode untuk melihat daftar pasien
    public static void lihatPasien() {
        System.out.println("\n--- Daftar Pasien ---");
        if (daftarPasien.isEmpty()) {
            System.out.println("Tidak ada pasien yang tersedia.");
        } else {
            for (Pasien pasien : daftarPasien) {
                pasien.tampilkanInfoPasien();
                System.out.println("--------------------");
            }
        }
    }

    // Metode untuk update dokter
    public static void updateDokter(Scanner scanner) {
        System.out.print("Masukkan ID Dokter yang ingin di-update: ");
        String id = scanner.next();

        Dokter dokterUpdate = null;
        for (Dokter dokter : daftarDokter) {
            if (dokter.getId().equals(id)) {
                dokterUpdate = dokter;
                break;
            }
        }

        if (dokterUpdate != null) {
            System.out.print("Masukkan Nama Dokter baru: ");
            String nama = scanner.next();
            System.out.print("Masukkan Spesialisasi Dokter baru: ");
            String spesialisasi = scanner.next();

            // Update data dokter
            daftarDokter.remove(dokterUpdate);
            daftarDokter.add(new Dokter(id, nama, spesialisasi));
            System.out.println("Dokter berhasil di-update!");
        } else {
            System.out.println("Dokter dengan ID tersebut tidak ditemukan.");
        }
    }

    // Metode untuk update pasien
    public static void updatePasien(Scanner scanner) {
        System.out.print("Masukkan ID Pasien yang ingin di-update: ");
        String id = scanner.next();

        Pasien pasienUpdate = null;
        for (Pasien pasien : daftarPasien) {
            if (pasien.getId().equals(id)) {
                pasienUpdate = pasien;
                break;
            }
        }

        if (pasienUpdate != null) {
            System.out.print("Masukkan Nama Pasien baru: ");
            String nama = scanner.next();
            System.out.print("Masukkan Umur Pasien baru: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Masukkan umur yang valid.");
                scanner.next();
            }
            int umur = scanner.nextInt();

            // Update data pasien
            daftarPasien.remove(pasienUpdate);
            daftarPasien.add(new Pasien(id, nama, umur));
            System.out.println("Pasien berhasil di-update!");
        } else {
            System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
        }
    }

    // Metode untuk menghapus dokter
    public static void hapusDokter(Scanner scanner) {
        System.out.print("Masukkan ID Dokter yang ingin dihapus: ");
        String id = scanner.next();

        Dokter dokterHapus = null;
        for (Dokter dokter : daftarDokter) {
            if (dokter.getId().equals(id)) {
                dokterHapus = dokter;
                break;
            }
        }

        if (dokterHapus != null) {
            daftarDokter.remove(dokterHapus);
            System.out.println("Dokter berhasil dihapus!");
        } else {
            System.out.println("Dokter dengan ID tersebut tidak ditemukan.");
        }
    }

    // Metode untuk menghapus pasien
    public static void hapusPasien(Scanner scanner) {
        System.out.print("Masukkan ID Pasien yang ingin dihapus: ");
        String id = scanner.next();

        Pasien pasienHapus = null;
        for (Pasien pasien : daftarPasien) {
            if (pasien.getId().equals(id)) {
                pasienHapus = pasien;
                break;
            }
        }

        if (pasienHapus != null) {
            daftarPasien.remove(pasienHapus);
            System.out.println("Pasien berhasil dihapus!");
        } else {
            System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
        }
    }
}
