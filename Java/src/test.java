public class test {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[];
        arr2 = arr;
        arr2[0] = 100;
        arr[1] = 200;
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr2[1] + " " + arr2[0]);

        System.out.println("--------------------------");

        A a = new A();
        a.a = 1;
        A aa;
        aa = a;
        aa.a = 2;
        System.out.println(a.a);
        System.out.println(aa.a);
    }
    
}

class A {

    int a;
    int b;
}