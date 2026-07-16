package com.farso.logic.challenge.dsa.strings.easy;

public class IsPalindrome {

//    A palindrome is a string that reads the same forwards and backwards.
//     if you reverse it should be same then better approach  is 2 pointer

    public static void main(String[] args) {
        String s = "madam";
        char[] charArray = s.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (charArray[left] != charArray[right]) { // s.chartAt(left) != s.charAt(right) // like that also we can get and check
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        }


    }

//            | Iteration | `left` | `right` | `charArray[left]` | `charArray[right]` | Comparison              | Action              | Result              |
//            | --------- | :----: | :-----: | :---------------: | :----------------: | ----------------------- | ------------------- | ------------------- |
//            | Initial   |    0   |    4    |        `m`        |         `m`        | -                       | Start               | `[m, a, d, a, m]`   |
//            | 1         |    0   |    4    |        `m`        |         `m`        | Equal                   | `left++`, `right--` | `left=1`, `right=3` |
//            | 2         |    1   |    3    |        `a`        |         `a`        | Equal                   | `left++`, `right--` | `left=2`, `right=2` |
//            | 3         |    2   |    2    |        `d`        |         `d`        | `left < right` is false | Loop ends           | Palindrome          |

}

