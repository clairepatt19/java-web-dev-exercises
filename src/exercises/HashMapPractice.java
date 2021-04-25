package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudentName;

        System.out.println("Enter your students name(or ENTER to finish):");
        do {

            System.out.print("Student name: ");
            newStudentName = input.nextLine();

            if (!newStudentName.equals("")) {
                System.out.print("Student Id: ");
                Integer studentId = input.nextInt();
                students.put(studentId, newStudentName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student  : students.entrySet()) {
            System.out.println(student.getKey() + " " +student.getValue() );

        }

    }
}
