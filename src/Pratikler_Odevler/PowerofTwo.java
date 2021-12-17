package Pratikler_Odevler;

import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // i = i * 2 --> i *= 2;
        int n;
        System.out.print("Sınır Sayısını Giriniz: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }
    }
}
