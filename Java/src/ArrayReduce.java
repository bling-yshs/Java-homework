import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        do {
            System.out.print("请问是否要删除数组中的元素？(y/n): ");

            char n = in.next().charAt(0);
            if (n=='n') {
                break;
            }

            if (arr.length == 1) {
                System.out.println("只剩一个元素，没法再缩减啦！");
                break;
            }
            int arr2[] = new int[arr.length - 1];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
            // print "当前剩余元素"：
            System.out.printf("当前剩余元素：");



            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } while (true);
        System.out.println("程序结束");
        //print arr
        System.out.println("最后剩余的元素：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
