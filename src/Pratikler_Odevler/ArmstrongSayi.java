package Pratikler_Odevler;

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = scanner.nextInt();
        int basNumber = 0; // Basamak sayısı
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayısıdır.");
        }
        else {
            System.out.println(number + " sayısı bir Armstrong sayısıdır.");
        }






        /*
        int a = 2451;
        int basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24/10 = 2
        // 2 / 10 = 0
        // Integer işlem olduğu için ondalık kısımları almaz.
        while (a != 0) {
            a /= 10;
            System.out.println(a);
            numberCounter++;
        }

        // Bir Sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 5;
        int result = 1;
        for (int i = 1; i <= sup; i++) {
            result *= sub;
        }

        System.out.println(result);

         */


    }
}
