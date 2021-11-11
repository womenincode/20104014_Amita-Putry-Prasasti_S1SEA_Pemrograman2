package modul6.percobaan;

public class InheritanceTest {
    public static void main(String[] args) {
        A ortu = new A();
        B anak = new B();

        System.out.println("Superclass");
        ortu.setX(10);
        ortu.setY(20);
        ortu.getNilai();

        System.out.println("\nSubclass");
        anak.setX(5);
        anak.setY(4);
        anak.setZ(50);
        anak.getNilai();
        anak.getJumlah();
    }
}
