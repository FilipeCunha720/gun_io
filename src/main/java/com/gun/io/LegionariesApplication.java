package com.gun.io;

import org.springframework.util.StringUtils;

import java.util.TreeMap;

/*
Legionaries

In the range 1 - 13 (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) the digit 1
occurs 6 times.

In the range, 1 - 2,660 (half the number of Romans in a legion), expressed in
Roman numerals, how many times does the numeral “X” occur?
*/
public class LegionariesApplication {

    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static String toRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }

    static int numberOfOccurrenceCount(int number) {
        int occurrenceCount = 0;
        for (int i = 9; i <= number; i++) {
            occurrenceCount += StringUtils.countOccurrencesOf(toRoman(i), "X");
        }
        return occurrenceCount;
    }


    public static void main(String[] args) {
        int number = 2660;
        System.out.println(numberOfOccurrenceCount(number));

    }

}
