package Pratikler_Odevler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,r;
        int fact_n = 1;
        int fact_r = 1;
        int fact_minus = 1;
        double combination;
        System.out.print("Birinci Sayıyı Giriniz: ");
        n = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            fact_n *= i;
        }

        System.out.println("Birincinin Faktoriyeli: " + fact_n);

        for (int j = 1; j <= r; j++) {
            fact_r *= j;
        }

        System.out.println("İkincinin Faktoriyeli: " + fact_r);

        int minus = n - r;

        for (int k = 1; k <= minus; k++){
            fact_minus *= k;
        }

        System.out.println("Fark Faktoriyeli: " + fact_minus);

        combination = (fact_n) / (fact_r * fact_minus);

        System.out.println(n + " Sayısı ile " + r + " Sayısının Kombinasyonu: " + combination);
    }
}
