package Pratikler_Odevler;

import java.util.Scanner;

public class DordunKatlariniTopla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,sum = 0;
        do {
            System.out.print("Sayı Giriniz: ");
            n = scanner.nextInt();
            if (n % 4 == 0) {
                sum += n;
            }
        } while (n % 2 == 0);

        System.out.println("Toplam : " + sum);
    }
}
