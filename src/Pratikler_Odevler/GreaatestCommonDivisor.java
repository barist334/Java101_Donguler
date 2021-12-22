package Pratikler_Odevler;

import java.util.Scanner;

public class GreaatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.print("Birinci Sayıyı Giriniz: ");
        number1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        number2 = scanner.nextInt();
        int gcd = 1;

        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                 gcd = i;
                System.out.println(i);
            }
        }

        System.out.println("---------------------");
        for (int i = 1; i <= (number1*number2); i++ ) {
            if (i % number1 == 0 && i % number2 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
