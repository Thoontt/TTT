package javabasic;

import java.util.Scanner;

public class results {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int numStudents = 0;
            boolean validInput = false;
            
            while (!validInput) {
                System.out.print("Enter number of students: ");
                if (s.hasNextInt()) {
                    numStudents = s.nextInt();
                    s.nextLine(); 
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    s.nextLine(); 
                }
            }

            String[] studentNames = new String[numStudents];
            String[] genders = new String[numStudents];
            int[] myanmarMarks = new int[numStudents];
            int[] mathMarks = new int[numStudents];
            int[] englishMarks = new int[numStudents];
            int[] totalMarks = new int[numStudents];
            boolean[] passed = new boolean[numStudents];

            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter " + (i + 1) + "st Student Name: ");
                studentNames[i] = s.nextLine();
                System.out.print("Enter Gender (M/F): ");
                genders[i] = s.nextLine().toLowerCase();

                System.out.print("Enter " + studentNames[i] + "'s Myanmar Mark: ");
                myanmarMarks[i] = s.nextInt();
                System.out.print("Enter " + studentNames[i] + "'s Math Mark: ");
                mathMarks[i] = s.nextInt();
                System.out.print("Enter " + studentNames[i] + "'s English Mark: ");
                englishMarks[i] = s.nextInt();
                s.nextLine();  

                totalMarks[i] = myanmarMarks[i] + mathMarks[i] + englishMarks[i];
                passed[i] = myanmarMarks[i] >= 40 && mathMarks[i] >= 40 && englishMarks[i] >= 40;

                System.out.println("Total Mark of " + studentNames[i] + ": " + totalMarks[i] + " (" + (passed[i] ? "Passed" : "Failed") + ")");
            }

            int passCount = 0;
            for (boolean pass : passed) {
                if (pass) passCount++;
            }

            System.out.println("All students passed the exam: " + (passCount == numStudents ? "Yes" : "No"));
            System.out.println("Passed Rate: " + (passCount * 100.0 / numStudents) + "%");

            double totalMyanmarMarks = 0, totalMathMarks = 0, totalEnglishMarks = 0;
            for (int i = 0; i < numStudents; i++) {
                totalMyanmarMarks += myanmarMarks[i];
                totalMathMarks += mathMarks[i];
                totalEnglishMarks += englishMarks[i];
            }

            System.out.println("Average Myanmar Mark: " + (totalMyanmarMarks / numStudents));
            System.out.println("Average Math Mark: " + (totalMathMarks / numStudents));
            System.out.println("Average English Mark: " + (totalEnglishMarks / numStudents));

            System.out.println("Student Summary");
            System.out.printf("%-10s %-6s %-8s %-4s %-8s %-5s %-15s%n", "Name", "Gender", "Myanmar", "Math", "English", "Total", "Passed/Failed");
            System.out.println("========== ====== ======== ==== ======== ===== =============");
            for (int i = 0; i < numStudents; i++) {
                System.out.printf("%-10s %-6s %-8d %-4d %-8d %-5d %-15s%n", studentNames[i], genders[i].equals("m") ? "Male" : "Female", myanmarMarks[i], mathMarks[i], englishMarks[i], totalMarks[i], passed[i] ? "Passed" : "Failed");
            }
        }}}
