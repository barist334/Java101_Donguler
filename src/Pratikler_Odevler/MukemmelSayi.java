package Pratikler_Odevler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;
        System.out.print("Bir Sayı Giriniz: ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println(number + " mükemmel bir sayıdır.");
        }
        else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }
    }
}
