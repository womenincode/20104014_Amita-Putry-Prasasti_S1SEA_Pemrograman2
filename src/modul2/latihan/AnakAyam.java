package modul2.latihan;

public class AnakAyam {
    public static void main(String[] args) {
        int anak = 10;

        while (anak > 0) {
            System.out.println("Anak ayam turun " + anak);
            anak--;

            if (anak != 0) {
                System.out.println("Mati 1 tinggal " + anak);
            } else {
                System.out.println("Mati 1 tinggal Induknya");
            }
        }
    }
}
