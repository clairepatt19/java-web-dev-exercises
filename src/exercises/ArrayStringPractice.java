package exercises;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringPractice {
    public static void main(String[] args) {
        String nurseryRhyme = "I would not, could not, in a box. I would not, " +
                "could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String takeOutCommaPeriod=nurseryRhyme.replace(",","").replace(".","");
        String[] nursery= takeOutCommaPeriod.split(" ");
        System.out.println(Arrays.toString(nursery));
        String takeOutComma=nurseryRhyme.replace(",","");
        String[] sentence= takeOutComma.split("\\.");
        System.out.println(Arrays.toString(sentence));

    }
}
