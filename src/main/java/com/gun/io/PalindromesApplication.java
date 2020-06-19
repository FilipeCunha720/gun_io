package com.gun.io;

/*
Palindromes

A palindrome is a word, number, phrase, or another sequence of characters which
reads the same backward as forward, such as madam, racecar, or the number 10801

What is the sum of all numeric palindromes that are less than 10,000?
*/
public class PalindromesApplication {

    static int createPalindrome(int input, int b, int isOdd) {
        int n = input;
        int palin = input;

        if (isOdd == 1)
            n /= b;
        while (n > 0) {
            palin = palin * b + (n % b);
            n /= b;
        }
        return palin;
    }

    static int sumPalindromes(int n) {
        int number;
        int total = 0;
        for (int j = 0; j < 2; j++) {
            int i = 1;
            while ((number = createPalindrome(i, 10, j % 2)) < n) {
                total = number + total;
                i++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 10000;
        int totalSum = sumPalindromes(n);
        System.out.println(totalSum);
    }

}
