import java.util.Scanner;
import java.util.Arrays;

public class j1022 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    if (a[i] < b[j] && b[j] < c[k]) {
                        sum += c.length - k;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);

        in.close();
    }
}
