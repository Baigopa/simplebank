Dokumentasi Proyek: Banking System

Deskripsi Proyek
`BankingSystem` adalah aplikasi sederhana berbasis Java untuk mengelola informasi nasabah di bank. Proyek ini mencakup kelas `Nasabah` yang berfungsi untuk menangani data nasabah, seperti nama dan saldo, serta metode untuk melakukan transaksi perbankan sederhana seperti setor tunai, tarik tunai, dan cek saldo.

Aplikasi ini menggunakan prinsip Encapsulation untuk menyembunyikan data nasabah dan hanya mengizinkan akses melalui metode tertentu. Sistem ini memanfaatkan **guard clauses** untuk meningkatkan alur logika dalam metode `tarikTunai`, yang memungkinkan program untuk keluar lebih awal jika saldo tidak cukup.

Fitur
1. Setor Tunai - Pengguna dapat menambah saldo ke akun.
2. Tarik Tunai - Pengguna dapat menarik saldo dari akun, dengan validasi saldo mencukupi.
3. Cek Saldo - Pengguna dapat melihat saldo terbaru di akun.
4. Keluar - Keluar dari aplikasi.

Prasyarat
- Pastikan Java Development Kit (JDK) sudah terinstal. Proyek ini membutuhkan **Java versi 8 atau yang lebih baru**.
- IDE seperti IntelliJ IDEA atau Eclipse untuk menjalankan proyek lebih mudah, atau Anda dapat menggunakan terminal/command prompt.

Langkah-Langkah untuk Menjalankan Proyek

1. Kloning atau Unduh Proyek
   - Kloning repositori dari versi kontrol, atau simpan semua kode dalam file `BankingSystem.java`.

2. Kompilasi Program
   - Jika Anda menggunakan terminal atau command prompt, arahkan ke direktori tempat `BankingSystem.java` disimpan.
   - Kompilasi program dengan perintah:
     ```shell
     javac BankingSystem.java
     ```

3. Jalankan Program
   - Setelah berhasil dikompilasi, jalankan aplikasi dengan perintah:
     ```shell
     java BankingSystem
     ```

4. Menggunakan Aplikasi
   - Ikuti instruksi di layar. Aplikasi akan meminta input nama nasabah dan saldo awal.
   - Setelah memasukkan informasi ini, Anda akan melihat menu dengan opsi berikut:
     - 1. Setor Tunai: Masukkan jumlah setoran yang ingin Anda tambahkan ke saldo.
     - 2. Tarik Tunai: Masukkan jumlah penarikan yang ingin Anda ambil. Program akan memeriksa apakah saldo cukup.
     - 3. Lihat Saldo: Menampilkan saldo terkini dari akun nasabah.
     - 4. Keluar: Keluar dari aplikasi.

Contoh Penggunaan
```
Masukkan nama nasabah: John Doe
Masukkan saldo awal: 100000

Menu:
1. Setor Tunai
2. Tarik Tunai
3. Lihat Saldo
4. Keluar
Pilih menu: 1
Masukkan jumlah setoran: 50000
Saldo berhasil diupdate!

Pilih menu: 3
Saldo Anda: Rp 150000
```

Informasi Tambahan
- Jika terjadi kesalahan input atau saldo tidak mencukupi saat melakukan penarikan, aplikasi akan menampilkan pesan peringatan.
- Aplikasi ini dapat diimprovisasi lebih lanjut dengan fitur tambahan, seperti membuat sistem autentikasi untuk nasabah atau menambah opsi transaksi lainnya.

Penutup
`BankingSystem` dirancang untuk menjadi contoh implementasi sederhana dari aplikasi perbankan menggunakan Java. Kode ini juga menunjukkan bagaimana menerapkan prinsip desain perangkat lunak seperti encapsulation dan guard clauses untuk meningkatkan struktur kode dan efisiensi.
