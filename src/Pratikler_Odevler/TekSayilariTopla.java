package Pratikler_Odevler;

import java.util.Scanner;

public class TekSayilariTopla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,sum = 0;
        do {
            System.out.print("Sayı Giriniz: ");
            n = scanner.nextInt();
            if (n % 2 == 1) {
                sum += n;
            }
        } while (n > 0);

        System.out.println("Toplam : " + sum);
    }
}
