package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println(isPalindromePermutation("Tact Coa"));
        System.out.println(isPalindromePermutation("hiih"));
        System.out.println(isPalindromePermutation("ab"));
    }

    public static boolean isPalindromePermutation(String str) {
        String lower = str.toLowerCase();
        lower = lower.replaceAll(" ", "");

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < lower.length(); i++) {

            if (!map.containsKey(lower.charAt(i))) {
                map.put(lower.charAt(i), 1);
            } else {
                map.put(lower.charAt(i), map.get(lower.charAt(i)) + 1);
            }
        }

        int numSingles = 0;

        for (Integer occurrence : map.values()) {
            if (occurrence == 1) {
                numSingles++;
            }
        }

        if (lower.length() % 2 == 0) {
            return numSingles == 0;
        } else {
            return numSingles == 1;
        }
    }
}


