package exercises;
import java.util.Scanner;

public class ArrayIntPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int integer : integerArray) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }
}

