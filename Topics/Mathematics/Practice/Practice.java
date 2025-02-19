package Topics.Mathematics.Practice;

import java.util.Scanner;
import java.util.Arrays;


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

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if ((n % i) == 0 || (n % (i + 2)) == 0)
                return false;
        }

        return true;
    }

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // a^b
    public static long power(int a, int b, int n) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = ((res) * (a % n)) % n;
            }
            a = ((a % n) * (a % n)) % n;
            b = b >> 1;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = kb.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
        System.out.println("Trailing zeroes of " + n + " is " + trailingZeroes(n));

        System.out.print("Enter number to check for palindrome: ");
        n = kb.nextInt();
        System.out
                .println("the number " + n + " is " + (isPalindrome(n) == true ? "a palindrome" : "not a palindrome"));

        System.out.print("Enter number to check for prime: ");
        n = kb.nextInt();
        System.out.println("The number " + n + " is " + (isPrime(n) == true ? "a prime number" : "not a prime number"));

        System.out.print("Enter number to print prime numbers: ");
        n = kb.nextInt();
        boolean[] primes = sieve(n);
        System.out.println("all prime nuumbers are: ");
        for (int i = 1; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        System.out.print("Enter number a: ");
        int a = kb.nextInt();
        System.out.print("Enter number b: ");
        int b = kb.nextInt();

        System.out.println("GCD of " + a + " & " + b + " is " + gcd(a, b));

        System.out.print("enter a: ");
        a = kb.nextInt();
        System.out.print("enter b: ");
        b = kb.nextInt();

        System.out.println(a + " to the power " + b + " is " + power(a, b, 1000000007));
    }
}
