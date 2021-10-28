package modul4.percobaan;

public class MainTabungan {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 12345);
        Tabungan kamu = new Tabungan("Manu", 12465, 15000, 2222);

        saya.setSaldo(10000);
        saya.setPin(1111);

        System.out.println("Saldo Awal saya\t: " + saya.getSaldo());
        System.out.println("Saldo Awal kamu\t: " + kamu.getSaldo());
        System.out.println("Nomor Pin saya\t: " + saya.getPin());
        System.out.println("Nomor Pin kamu\t: " + kamu.getPin());

    }
}
