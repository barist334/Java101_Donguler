package Pratikler_Odevler;

import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0, total = 0;
        System.out.print("Bir Sayı Giriniz: ");
        number = scanner.nextInt();

        while (number != 0) {
            total = (number % 10) + total;
            number /= 10;
            count++;
        }

        System.out.println("Basamak Toplamı: " + total);
    }
}
