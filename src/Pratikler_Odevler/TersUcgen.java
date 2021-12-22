package Pratikler_Odevler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int k = (number - i); k >= 0; k--) {
                System.out.print(" ");
            }

            for (int j = (2*i) - 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
