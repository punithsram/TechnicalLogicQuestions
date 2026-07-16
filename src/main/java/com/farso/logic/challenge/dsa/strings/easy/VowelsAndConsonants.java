package com.farso.logic.challenge.dsa.strings.easy;

import java.util.HashMap;
import java.util.Map;

public class VowelsAndConsonants {
    public static void main(String[] args) {

//   DSA Pattern Used
//✅ Traversal (Linear Scan / Single Pass)
        String s = "aeipqrs";
        char[] charArray = s.toCharArray();

        int vowels = 0;
        int consonants = 0;

        for (char ch : charArray) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }


//   count the frequency of characters vowels
//         if you want frequency  of each character just remove if condition

        Map<Character, Integer> vowelFrequency = new HashMap<>();

        for (char ch : charArray) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelFrequency.put(ch, vowelFrequency.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Frequency");
        for (Map.Entry<Character, Integer> entry : vowelFrequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


//        input = "AeioUuAaapqrr";
//        output = "411122444pqrr";

//        Replace every vowel with the total frequency of that vowel (case-insensitive) in the string, while leaving consonants unchanged.
        String ex = "AeioUuAaapqrr";

        String lowerCase = ex.toLowerCase();
        char[] exChar = lowerCase.toCharArray();
        HashMap<Character, Integer> characterInteger = new HashMap<>();

        for (char ch : exChar) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                characterInteger.put(ch, characterInteger.getOrDefault(ch, 0) + 1);
            }
        }

        // Step 2: Replace vowels with their frequency
        StringBuilder result = new StringBuilder();

        for (char c : exChar) {
            if (characterInteger.containsKey(c)) {
                result.append(characterInteger.get(c));
            } else {
                result.append(c);
            }
        }
        System.out.println("---Count Vowels frequency replace with count " + result);



//        1. Count Frequency of Every Character ⭐

        String name = "programming";

        String nameLower = name.toLowerCase();
        char[] nameLowerCharArray = nameLower.toCharArray();

        Map<Character, Integer> countFrequency = new HashMap<>();

        for(char ch : nameLowerCharArray){
            countFrequency.put(ch,countFrequency.getOrDefault(ch,0)+1);
        }

        System.out.println("Count of Each Frequency ");
        for(Map.Entry<Character,Integer>  ch : countFrequency.entrySet()){
            System.out.print(ch.getKey() + " " + ch.getValue());
        }

//        3. Print Only Duplicate Characters ⭐⭐
        System.out.println("Print Duplicate Characters ");
        for (Map.Entry<Character, Integer> ch : countFrequency.entrySet()) {
            if (ch.getValue() >= 2) {
                System.out.print(ch.getKey() + " " + ch.getValue());
            }
        }

//        Non-Repeating Character ⭐⭐
        System.out.println("Non-Repeating Character");
        for (Map.Entry<Character, Integer> ch : countFrequency.entrySet()) {
            if (ch.getValue() <= 1) {
                System.out.println(ch.getKey() + " " + ch.getValue());
            }
        }

//        First Non-Repeating Character ⭐⭐
        System.out.println("First Non-Repeating Character");
        for (Map.Entry<Character, Integer> ch : countFrequency.entrySet()) {
            if (ch.getValue() == 1) {
                System.out.println(ch.getKey() + " " + ch.getValue());
                break;
            }
        }

//        First Repeating Character ⭐⭐
        System.out.println("First Repeating Character");
        for (Map.Entry<Character, Integer> ch : countFrequency.entrySet()) {
            if (ch.getValue() > 1) {
                System.out.println(ch.getKey() + " " + ch.getValue());
                break;
            }
        }
//        Remove Duplicate Characters ⭐⭐
        System.out.println("Remove Duplicate Characters");
        for (Map.Entry<Character, Integer> ch : countFrequency.entrySet()) {
            if (ch.getValue() <= 1) {
                System.out.print(ch.getKey());
            }
        }
// we can also use Has Set for dupicates and remove and repeating charcter

    }
}
