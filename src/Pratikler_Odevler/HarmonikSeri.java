package Pratikler_Odevler;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = scanner.nextInt();
        double result = 0;

        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);    // sonucun double çıkması için 1.0 olarak yazıldı.
        }

        System.out.println("Sonuç: " + result);
    }
}
