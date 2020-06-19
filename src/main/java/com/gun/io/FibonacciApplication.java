package com.gun.io;

/*
Fibonacci

The Fibonacci sequence begins like this:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
(each number is the sum of the previous two)

What is the sum of all odd numbers in the Fibonacci sequence that are less
than 10,000?
*/

public class FibonacciApplication {

    static long calculateSum(int n) {
        if (n <= 0) {
            return 0;
        }

        long[] fibo = new long[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        long sum = fibo[0] + fibo[1];

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            if (fibo[i] % 2 != 0 && fibo[i] < n) {
                sum += fibo[i];
            } else if (fibo[i] >= n) {
                break;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int n = 10000;
        System.out.println(calculateSum(n));
    }

}
