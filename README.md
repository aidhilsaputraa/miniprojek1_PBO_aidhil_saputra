terdapat dua package yaitu com.mycompany.manajemenrumahsakit dan manajemenrumahsakit.lala
pada com.mycompany.manajemenrumahsakit terdapat sebuah class yaitu main program dari manajemen rumah sakit
pada manajemenrumahsakit.lala terdapat dua class, class dokter dan juga class pasien.
 
 ## 1. Class MainProgram##
 
Ini adalah kelas utama yang menjalankan program sistem manajemen rumah sakit. Kelas ini berfungsi sebagai kontrol pusat yang mengelola dokter dan pasien, dan memiliki beberapa fungsi utama seperti:

a. Tambah Dokter & Pasien: Pengguna dapat menambahkan data dokter dan pasien baru.
b. Lihat Daftar Dokter & Pasien: Pengguna dapat melihat daftar dokter dan pasien yang sudah terdaftar.
c. Update Dokter & Pasien: Pengguna dapat memperbarui informasi dokter atau pasien berdasarkan ID.
d. Hapus Dokter & Pasien: Pengguna dapat menghapus data dokter atau pasien berdasarkan ID.
Validasi Input: Program memastikan input valid untuk opsi menu dan umur pasien.

## 2. Class Dokter
Ini adalah class yang digunakan untuk merepresentasikan objek Dokter. Setiap dokter memiliki:

Attributes: id, nama, dan spesialisasi (spesialisasi medis dokter).
Constructor: Digunakan untuk membuat objek dokter baru dengan atribut yang diberikan.
Method:
tampilkanInfoDokter: Menampilkan informasi dokter secara lengkap.

## 3. Class Pasien
Ini adalah class yang digunakan untuk merepresentasikan objek Pasien. Setiap pasien memiliki:

Attributes: id, nama, dan umur (umur pasien).
Constructor: Digunakan untuk membuat objek pasien baru dengan atribut yang diberikan.
Method:
tampilkanInfoPasien: Menampilkan informasi pasien secara lengkap.

## 4. Metode dalam MainProgram
   
tambahDokter: Mengambil input dari pengguna untuk membuat objek Dokter baru dan menambahkannya ke daftar.
tambahPasien: Mengambil input dari pengguna untuk membuat objek Pasien baru dan menambahkannya ke daftar.
lihatDokter: Menampilkan semua dokter yang tersimpan di daftar.
lihatPasien: Menampilkan semua pasien yang tersimpan di daftar.
updateDokter: Mengubah informasi dokter berdasarkan ID.
updatePasien: Mengubah informasi pasien berdasarkan ID.
hapusDokter: Menghapus dokter dari daftar berdasarkan ID.
hapusPasien: Menghapus pasien dari daftar berdasarkan ID.
Program ini adalah contoh sederhana sistem manajemen rumah sakit yang memungkinkan operasi dasar CRUD (Create, Read, Update, Delete) untuk dokter dan pasien.
