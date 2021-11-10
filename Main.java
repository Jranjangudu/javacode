// import java.util.Arrays;

// import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.next();
        // String total = "my name is " + name;
        // System.out.println(total);
        // int[] marks = new int[4];
        // for (int i = 0; i < 4; i++) {
        // marks[i] = i * 10;
        // }
        // System.out.println(marks[3]);
        // Arrays.sort(marks);

        // // Another way to create array using {};
        // int[] data = { 45, 6, 8, 9, 46 };
        // try {
        // // System.out.println(data[10]);
        // } catch (Exception e) {
        //
        // // System.out.println("Error occure");
        // }
        // Arrays.sort(data);
        // System.out.println(data[0]);
        // System.out.println(data.length);

        int a = 10;
        int b = 20;
        if (a < b && b < 30) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // int i = 0;
        // while (i <= 5) {
        // if (i == 3) {
        // continue;}
        // // } else if (i == 4) {
        // // break;
        // // }
        // System.out.println(i);
        // i = i + 1;
        // }

        // constant
        final float PI = 3.14F; // constant value
        System.out.println(PI);
        // casting
        double price = 100.0;
        double totalprice = price + 18;
        System.out.println(totalprice);

        int intPrice = 100;
        int totalp = intPrice + (int) 18.66; // data loss here //{ converting double to int}
        System.out.println(totalp);

        // invoke myFuns() method;
        myFuns();
        printData(10, 20);
        int k = 6;
        do {
            System.out.println(k);
            k = k - 1;
        } while (k >= 1);
    }

    // Create my own functions;
    public static void myFuns() {
        System.out.println("My function calling..");
    }

    // passing arg;
    public static void printData(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }
}
