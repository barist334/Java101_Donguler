package Pratikler_Odevler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Serisi Kaç Elemanlı Olacak? : ");
        int count = scanner.nextInt();
        int number1 = 0;
        int number2 = 1;
        int number3;
        System.out.print(number1 + " " + number2);

        for (int i = 2; i <= count; i++) {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }
        System.out.println();
    }
}
