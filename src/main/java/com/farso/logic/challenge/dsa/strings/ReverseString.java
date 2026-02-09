package com.farso.logic.challenge.dsa.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {

//  1️⃣ Using StringBuilder (cleanest & fastest) -- not thread safe
        String reverse = "Punith";
        StringBuilder stringBuilder = new StringBuilder(reverse);
        String reversed = stringBuilder.reverse().toString();
        System.out.println("Using String Builder = "+ reversed);

//  2️⃣ Using StringBuffer (thread-safe version) -- Slightly slower than StringBuilder
        StringBuffer stringBuffer = new StringBuffer(reverse);
        StringBuffer reversedUsingStringBuffer = stringBuffer.reverse();
        System.out.println("Using String Buffer = " + reversedUsingStringBuffer);

//  3️⃣ Using charAt() (classic interview approach)
        String rev ="";
        for(int i = reverse.length() -1; i>=0;i--){
           rev= rev + reverse.charAt(i);
        }
        System.out.println("Using CharAt = " + rev);

//  4️⃣ Using toCharArray()
        char[] charArray = reverse.toCharArray();
        System.out.println("Converted String into an Array" + Arrays.toString(charArray));
        String charArrayIntoString = "";
        for(int i = charArray.length-1; i>=0;i--){
            charArrayIntoString = charArrayIntoString + charArray[i];
        }
        System.out.println("Converted CharArray into an String  = " + charArrayIntoString) ;

//  5️⃣ Using Recursion (for concepts)
        String reversedUsingRecursion = reverseRecursion(reverse);
        System.out.println("Reversed using recursion "+ reversedUsingRecursion);

//  6️⃣ Using Java 8 Streams
        String reversedUsingStream = reverse.chars().mapToObj(c -> (char) c).collect(Collectors.collectingAndThen(Collectors.toList(),
                list -> {
                    Collections.reverse(list);
                    return list.stream().map(String::valueOf).collect(Collectors.joining());

                }));
// Simplified on each steps
        IntStream chars = reverse.chars();
        Stream<Character> characterStream = chars.mapToObj(c -> (char) c);//Converts each int Unicode value back into a char
        List<Character> collect = characterStream.collect(Collectors.toList());//Collects all characters into a List<Character>
        Collections.reverse(collect);//Reverses the list in-place
        Stream<String> stringStream = collect.stream().map(String::valueOf);//Converts each Character into a String
        String reversedResult = stringStream.collect(Collectors.joining());


        System.out.println("Reversed Using Streams = " + reversedUsingStream);
        System.out.println("Reversed Using Streams explained in depth = " + reversedResult);

    }
    public static String reverseRecursion(String name){
        if(name.isEmpty()){
            return  name;
        }
        return reverseRecursion(name.substring(1)) + name.charAt(0);
    }



}
