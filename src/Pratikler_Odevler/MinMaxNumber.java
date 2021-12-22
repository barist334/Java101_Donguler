package Pratikler_Odevler;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumber;
        int min = 0;
        int max = 0;
        int number;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        countOfNumber = scanner.nextInt();

        for (int i = 1; i <= countOfNumber; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
             number = scanner.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }

        }
        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En Küçük Sayı: " + min);
    }
}
