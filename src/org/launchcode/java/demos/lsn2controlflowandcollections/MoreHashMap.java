package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoreHashMap {
    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Grade: ");
                Double newGrade = input.nextDouble();
                students.put(newStudent, newGrade);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
            //sum += student.getValue();
        }
        //for (Map.Entry entry : characterCountMap.entrySet()) {
        //System.out.println(entry.getKey() + " " + entry.getValue());
        //System.out.println(strArray);

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
