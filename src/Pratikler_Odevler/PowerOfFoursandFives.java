package Pratikler_Odevler;

import java.util.Scanner;

public class PowerOfFoursandFives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Sınır Sayısını Giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4 ün Kuvvetleri: " + i);
        }

        System.out.println("---------------------------");

        for (int i = 1; i <= n; i *= 5) {
            System.out.println("5 in Kuvvetleri: " + i);
        }
    }
}
