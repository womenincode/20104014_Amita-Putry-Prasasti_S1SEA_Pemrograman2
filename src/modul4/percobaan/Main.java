package modul4.percobaan;

public class Main {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 50410420, 1000000, 12345);
        System.out.println("Nama\t\t: " + saya.getNama());
        System.out.println("No Rekening\t: " + saya.getNoRekening());
        System.out.println("Saldo\t\t: " + saya.getSaldo());
        System.out.println("Pin\t\t\t: " + saya.getPin());

    }
}
