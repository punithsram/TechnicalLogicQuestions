package com.farso.logic.challenge.dsa.strings;

import java.util.HashMap;

public class lengthOfLongestSubString {

    public static void main(String[] args) {
// Longest Substring Without Repeating Characters --count
//       sliding window with a HashMap
        int example1 = findOfLongestSubStringWithoutDuplicated("pppppp");//p --1
        System.out.println(example1);
        int example2 = findOfLongestSubStringWithoutDuplicated("pkpkpk");//pk --2
        System.out.println(example2);
        int example3 = findOfLongestSubStringWithoutDuplicated("ayappa");//ayp --3
        System.out.println(example3);


    }

    public static int findOfLongestSubStringWithoutDuplicated(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxlength = 0;

        for (int right = 0; right < s.length(); right++) {
            char character = s.charAt(right);
            if (map.containsKey(character)) {
                left = Math.max(left, map.get(character) + 1);
            }
            map.put(character, right);
            maxlength = Math.max(maxlength, right - left + 1);

        }
        return maxlength;
    }

}
