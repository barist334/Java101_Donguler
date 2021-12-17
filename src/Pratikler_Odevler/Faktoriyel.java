package Pratikler_Odevler;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        // n! = 1*2*3*4*5*.....*n
        Scanner scanner = new Scanner(System.in);
        int n;
        int fact = 1;
        System.out.print("Bir Sayı Giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(n + " Sayısının Faktöriyeli: " + fact);

    }
}
