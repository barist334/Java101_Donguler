public class BreakContinue {
    public static void main(String[] args) {
        /*
        int i = 1;
        while (i <= 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

         */

        /*
        int i=0;
        for(i=1; i<=6;i++)
        {
            if(i%3==0)
                continue;
            System.out.print(i+",");
        }

         */

        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i + j);
            }
        }

        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }

    }
}
