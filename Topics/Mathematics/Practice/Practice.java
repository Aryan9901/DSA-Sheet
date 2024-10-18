package Topics.Mathematics.Practice;

import java.util.Scanner;

public class Practice {

    public static long factorial(int n) {
        long fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }

    public static int trailingZeroes(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res += n / i;
        }
        return res;
    }

    public static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = kb.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
        System.out.println("Trailing zeroes of " + n + " is " + trailingZeroes(n));

        System.out.print("Enter number to check for palindrome: ");
        int x = kb.nextInt();
        System.out
                .println("the number " + x + " is " + (isPalindrome(x) == true ? "a palindrome" : "not a palindrome"));
    }
}
