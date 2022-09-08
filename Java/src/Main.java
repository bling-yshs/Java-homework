import java.util.Scanner;

public class Main {
    public int getsum(int n) {
        int i = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        int flag = 0;
        while (i <= n) {
            b = i;
            c = (int) Math.log10(b);
            for (int j = 0; j <= c; j++) {
                a = b % 10;
                if (a == 2 || a == 0 || a == 1 || a == 9) {
                    b = b / 10;
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println(i);
                sum += i;
            }

            i++;
        }
        return sum;

    }

    public static void main(String[] args) {
        Main app = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = app.getsum(n);
        System.out.println(sum);
        in.close();
    }

}
