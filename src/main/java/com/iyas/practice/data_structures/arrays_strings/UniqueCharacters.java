package com.iyas.practice.data_structures.arrays_strings;

public class UniqueCharacters {

    // Implement an algorithm to determine if a string has all unique characters.
    // What if you cannot use additional data structures?
    // Hints: #44, #117, #132

    public static void main(String[] args) {
        String s = "abcadefgiulgyi";
        booleanArrayMethod(s);
        innerLoopMethod(s);
    }

    private static void booleanArrayMethod(String s){
        boolean[] b = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            if (b[index]) {
                System.out.println("Duplicated characters found");
                return;
            }
            b[index] = true;
        }

        System.out.println("All characters are unique");
    }

    private static void innerLoopMethod(String s){
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    System.out.println("Duplicated characters found");
                    return;
                }
            }
        }
        System.out.println("All characters are unique");
    }
}
