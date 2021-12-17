import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        int year = 2021;
        do {
            System.out.println(year);
        } while (year < 2021);
        // Durum false olsa bile döngü en az bir kere çalışacaktır.

         */

        Scanner scanner = new Scanner(System.in);
        int pass;
        boolean askPassword = true;
        do {
            System.out.print("Şifre Giriniz: ");
            pass = scanner.nextInt();
            if (pass == 123) {
                System.out.println("Doğru");
                askPassword = false;
            }
            else {
                System.out.println("Yanlış");
            }
        } while (askPassword);

        int age=20;
        do
        {
            age++;
        }while(age<20);

        System.out.println(age);

        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }
    }
}
