package org.launchcode.java.studios.countingcharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Java program to count frequencies of characters in a string using Hashmap

public class CharCount {
    public static void main(String[] args) {
        String paragraph = "If the product of two terms is " +
                "zero then common sense says at least one of" +
                " the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side," +
                " you can put the quadratics into a form that can be" +
                " factored allowing that side of the equation to equal " +
                "zero. Once you’ve done that, it’s pretty straightforward " +
                "from there.";
        // Create a HashMap containing char as a key and occurrences as a value
        HashMap<Character, Integer> characterCountMap = new HashMap<>();

        // Convert the given string to char array
        char[] strArray = paragraph.toCharArray();

        // checking each char of strArray
        for (char a : strArray) {
            if (characterCountMap.containsKey(a)) {
                // If char is present in charCountMap,
                // increment it's count by 1
                characterCountMap.put(a, characterCountMap.get(a) + 1);
            }
            else {
                // If char is not present in charCountMap,
                // add this char to charCountMap with 1 as it's value
                characterCountMap.put(a, 1);
            }
        }
        // Printing the charCountMap
        for (Map.Entry entry : characterCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println(strArray);
        }

    }

}

