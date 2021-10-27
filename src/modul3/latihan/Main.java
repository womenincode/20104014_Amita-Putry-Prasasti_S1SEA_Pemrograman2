package modul3.latihan;

public class Main {
    public static void main(String[] args) {
        boolean status;

        MethodTabungan tabungan = new MethodTabungan(10000);
        System.out.println("Saldo awal\t: "+tabungan.getSaldo());
        tabungan.simpanUang(8000);

        System.out.println("Jumlah uang yang disimpan\t: 8000");
        status = tabungan.ambilUang(7000);
        System.out.print("Jumlah uang yang diambil\t: 7000");

        if (status) {
            System.out.println("\tok");
        } else {
            System.out.println("\tgagal");
        }
        tabungan.simpanUang(1000);
        System.out.println("Jumlah uang yang disimpan\t: 1000");
        status = tabungan.ambilUang(10000);
        System.out.print("Jumlah uang yang diambil\t: 10000");

        if (status) {
            System.out.println("\tok");
        } else {
            System.out.println("\tgagal");
        }
        status = tabungan.ambilUang(2500);
        System.out.print("Jumlah uang yang diambil\t: 2500");

        if (status) {
            System.out.println("\tok");
        } else {
            System.out.println("\tgagal");
        }
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan\t: 2000");
        System.out.println("Saldo sekarang\t\t\t\t= " + tabungan.getSaldo());
    }
}
