package Pratikler_Odevler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = scanner.nextLine();
            System.out.print("Parolanız: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println( "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak Miktarı Giriniz: ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekilecek Miktarı Giriniz: ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            }
                            else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        default:
                            System.out.println("Hatalı işlem seçtiniz. Tekrar deneyiniz.");
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }


    }
}
