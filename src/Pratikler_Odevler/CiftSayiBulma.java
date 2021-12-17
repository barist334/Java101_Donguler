package Pratikler_Odevler;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int k;
        int sum = 0, count = 0;
        double average;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = scanner.nextInt();

        for (int i = 0; i <= k; i++){
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }

        System.out.println("Sayı Adedi : " + count);
        System.out.println("Sayıların Toplamı: " + sum);

        average = sum / count;
        System.out.println("Ortalama: " + average);
    }
}
