import java.util.Scanner;

public class ForvsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        /*
        for (boolean run = true; run ;){
            System.out.print("Sayı Giriniz: ");
            number = scanner.nextInt();

            if (number < 0) {
                run = false;
            }
        }

         */

        /*

        System.out.print("Sayı Giriniz: ");
        number = scanner.nextInt();
        while (number > 0) {
            System.out.print("Sayı Giriniz: ");
            number = scanner.nextInt();
        }

         */

        /*
        do {
            System.out.print("Sayı Giriniz: ");
            number = scanner.nextInt();
        } while (number > 0);


         */

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("----------------");

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }
}
