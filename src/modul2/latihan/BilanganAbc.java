package modul2.latihan;

import java.util.Scanner;

public class BilanganAbc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        int[] a, b, c;

        System.out.print("Masukkan Jumlah Testcase: ");
        t = input.nextInt();
        a = new int[t];
        b = new int[t];
        c = new int[t];

        for (int i = 0; i < t; i++) {
            System.out.print("\nMasukkan A" + (i + 1) + " : ");
            a[i] = input.nextInt();
            System.out.print("Masukkan B" + (i + 1) + " : ");
            b[i] = input.nextInt();
            System.out.print("Masukkan C" + (i + 1) + " : ");
            c[i] = input.nextInt();
        }

        for (int i = 0; i < t; i++) {
            System.out.print("\nA" + (i + 1) + " + B" + (i + 1) + " - C" + (i + 1) + " = ");
            System.out.println(a[i] + b[i] - c[i]);
        }
    }
}
