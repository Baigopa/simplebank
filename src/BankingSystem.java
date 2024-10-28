import java.util.Scanner;

class Nasabah {
//    Extract Class:
//    Logika untuk mengelola nasabah diekstrak ke dalam kelas Nasabah.
    private String nama;
    private double saldo;
    //FITUR BARU

//    Encapsulation:
//    Data dalam kelas Nasabah (nama dan saldo) disembunyikan dengan modifier private.
//    Akses ke data nasabah dilakukan melalui metode getSaldo().
    public Nasabah(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }
//    Introduce Parameter Object:
//    Alih-alih meneruskan nama dan saldo sebagai parameter ke Nasabah, sekarang kita meneruskan objek Nasabah.
    public void setorTunai(double setoran) {
        saldo += setoran;
    }

    public void tarikTunai(double penarikan) {
        if (penarikan > saldo) {
            System.out.println("Saldo tidak cukup!");
        } else {
            saldo -= penarikan;
        }
    }
//    Replace Nested Conditional with Guard Clauses:
//    Pada metode tarikTunai, kondisi dicek diawal untuk keluar lebih awal jika saldo tidak cukup.
    public double getSaldo() {
        return saldo;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama nasabah: ");
        String namaNasabah = scanner.nextLine();

        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = scanner.nextDouble();

        Nasabah nasabah = new Nasabah(namaNasabah, saldoAwal);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Lihat Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
//            Replace Type Code with State/Strategy:
//            Menggunakan switch case untuk pilihan menu, meningkatkan readability.
            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah setoran: ");
                    double setoran = scanner.nextDouble();
                    nasabah.setorTunai(setoran);
                    System.out.println("Saldo berhasil diupdate!");
                    break;
                case 2:
                    System.out.print("Masukkan jumlah penarikan: ");
                    double penarikan = scanner.nextDouble();
                    nasabah.tarikTunai(penarikan);
                    break;
                case 3:
                    System.out.println("Saldo Anda: Rp " + nasabah.getSaldo());
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
            System.out.println();
        }
    }
}
