import java.util.Scanner;

public class DonguYapilari {
    public static void main(String[] args) {
        int password;
        boolean isPasswordTrue = false;
        Scanner scanner = new Scanner(System.in);

        while (!isPasswordTrue){
            System.out.print("Şifre Giriniz: ");
            password = scanner.nextInt();
            if (password == 123) {
                System.out.println("Şifre Doğru");
                isPasswordTrue = true;
            }
            else {
                System.out.println("Şifre Yanlış");
            }
        }
    }
}
