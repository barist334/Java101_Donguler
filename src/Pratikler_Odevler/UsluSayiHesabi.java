package Pratikler_Odevler;

import java.util.Scanner;

public class UsluSayiHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scanner.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = scanner.nextInt();
        int total = 1;

        // 3^4 = 3*3*3*3
        /*
        int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }

            // While döngüsü ile üs hesabı
         */

        // For döngüsü ile üs hesaplama

        for (int i = 1; i <= k; i++){
            total *= n;
        }

        System.out.println("Sonuç: " + total);
    }
}
