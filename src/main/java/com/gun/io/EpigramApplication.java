package com.gun.io;

import java.util.HashMap;

/*
Epigram on Failure

Given the following quote by Alan Perlis

“Dealing with failure is easy: Work hard to improve. Success is also easy to
handle: You’ve solved the wrong problem. Work hard to improve.”

Considering only the alphabetical characters, consonants having the value of
their ASCII codes, and vowels having the inverse value of their ASCII codes,
what is the sum of the sentence?

Example:
Taking the word “iffy”, the ASCII code of “i” is 105, it’s inverse is -105.
The ASCII value of ‘f’ is 102. The ASCII y of “y” is 121. The sum of “iffy” = 220
*/


public class EpigramApplication {

    static HashMap<Character, Integer> alphabet = new HashMap<>();

    static {
        alphabet.put('a', -97);
        alphabet.put('b', 98);
        alphabet.put('c', 99);
        alphabet.put('d', 100);
        alphabet.put('e', -101);
        alphabet.put('f', 102);
        alphabet.put('g', 103);
        alphabet.put('h', 104);
        alphabet.put('i', -105);
        alphabet.put('j', 106);
        alphabet.put('k', 107);
        alphabet.put('l', 108);
        alphabet.put('m', 109);
        alphabet.put('n', 110);
        alphabet.put('o', -111);
        alphabet.put('p', 112);
        alphabet.put('q', 113);
        alphabet.put('r', 114);
        alphabet.put('s', 115);
        alphabet.put('t', 116);
        alphabet.put('u', -117);
        alphabet.put('v', 118);
        alphabet.put('w', 119);
        alphabet.put('x', 120);
        alphabet.put('y', 121);
        alphabet.put('z', 122);
        alphabet.put('A', -65);
        alphabet.put('B', 66);
        alphabet.put('C', 67);
        alphabet.put('D', 68);
        alphabet.put('E', -69);
        alphabet.put('F', 70);
        alphabet.put('G', 71);
        alphabet.put('H', 72);
        alphabet.put('I', -73);
        alphabet.put('J', 74);
        alphabet.put('K', 75);
        alphabet.put('L', 76);
        alphabet.put('M', 77);
        alphabet.put('N', 78);
        alphabet.put('O', -79);
        alphabet.put('P', 80);
        alphabet.put('Q', 81);
        alphabet.put('R', 82);
        alphabet.put('S', 83);
        alphabet.put('T', 84);
        alphabet.put('U', -85);
        alphabet.put('V', 86);
        alphabet.put('W', 87);
        alphabet.put('X', 88);
        alphabet.put('Y', 89);
        alphabet.put('Z', 90);

    }

    static int sumASCII(String phrase, HashMap<Character, Integer> alphabet) {
        int total = 0;

        for (int j = 0; j < phrase.length(); j++) {
            char charAt = phrase.charAt(j);
            if (alphabet.containsKey(charAt)) {
                int currentCharValue = alphabet.get(charAt);
                total = total + currentCharValue;
            }
        }
        return total;
    }


    public static void main(String[] args) {

        String phrase = "Dealing with failure is easy: Work hard to improve. Success is also easy to\n" +
                "handle: You’ve solved the wrong problem. Work hard to improve.";
        int totalSum = sumASCII(phrase, alphabet);
        System.out.println(totalSum);
    }

}
