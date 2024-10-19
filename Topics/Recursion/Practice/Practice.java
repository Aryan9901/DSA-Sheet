package Topics.Recursion.Practice;

import java.util.Scanner;

/**
 * Practice
 */
public class Practice {

    public static void print1toN(int n) {
        if (n == 0)
            return;
        print1toN(n - 1);
        System.out.print(n + ", ");
    }

    public static void printNto1(int n) {
        if (n == 0)
            return;
        System.out.print(n + ", ");
        printNto1(n - 1);
    }

    public static int sumOfN(int n) {
        if (n == 1)
            return 1;
        return n + sumOfN(n - 1);
    }

    public static long power(int a, int b, int k) {
        if (b == 0)
            return k;
        return power(a, b - 1, k * a);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = kb.nextInt();
        System.out.println("printing 1 to " + n);
        print1toN(n);
        System.out.println();
        System.out.println("printing " + n + " to 1");
        printNto1(n);
        System.out.println();
        System.out.println("Sum of " + n + " natural numbers are: " + sumOfN(n));

        System.out.print("Enter a: ");
        int a = kb.nextInt();
        System.out.print("Enter b: ");
        int b = kb.nextInt();

        System.out.println(a + " to the power " + b + " is " + power(a, b, 1));
    }

}
