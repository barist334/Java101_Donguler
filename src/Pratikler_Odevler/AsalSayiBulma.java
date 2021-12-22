package Pratikler_Odevler;

public class AsalSayiBulma {
    public static void main(String[] args) {
        int countOfDivisor = 0;

        for (int i = 1; i <= 100; i++) {
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    countOfDivisor++;
                }
            }

            if (countOfDivisor == 2) {
                System.out.println(i);
                countOfDivisor = 0;
            }
            else {
                countOfDivisor = 0;
            }
        }
    }
}
