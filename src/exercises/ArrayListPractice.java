package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(6, 89, 54, 3, 9, 24, 17, 8, 4, 44));
        System.out.println(sumEven(someIntegers));
    }
        public static int sumEven(ArrayList <Integer> arr){
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
    }




