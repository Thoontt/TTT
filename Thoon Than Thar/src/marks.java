import java.util.Scanner;

class Student {
    String name;
    char gender;
    int myanmarMark;
    int mathMark;
    int englishMark;
    int totalMark;
    boolean passed;

    public Student(String name, char gender, int myanmarMark, int mathMark, int englishMark) {
        this.name = name;
        this.gender = gender;
        this.myanmarMark = myanmarMark;
        this.mathMark = mathMark;
        this.englishMark = englishMark;
        this.totalMark = myanmarMark + mathMark + englishMark;
        this.passed = totalMark >= 120; // Assuming passing mark is 120
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%d\t%d\t%d\t%d\t%s", name, gender == 'm'? "Male" : "Female",
                myanmarMark, mathMark, englishMark, totalMark, passed ? "Passed" : "Failed");
    }
}

public class marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numOfStudents];
        int totalMarksAllSubjects = 0;
        int totalMyanmarMarks = 0;
        int totalMathMarks = 0;
        int totalEnglishMarks = 0;
        int passedCount = 0;

        for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("Enter %dth Student Name: ", i + 1);
            String name = scanner.nextLine();
            System.out.print("Enter Gender (M/F): ");
            char gender = scanner.next().charAt(0);
            System.out.printf("Enter %s's Myanmar Mark: ", name);
            int myanmarMark = scanner.nextInt();
            System.out.printf("Enter %s's Math Mark: ", name);
            int mathMark = scanner.nextInt();
            System.out.printf("Enter %s's English Mark: ", name);
            int englishMark = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(name, gender, myanmarMark, mathMark, englishMark);

            totalMarksAllSubjects += students[i].totalMark;
            totalMyanmarMarks += myanmarMark;
            totalMathMarks += mathMark;
            totalEnglishMarks += englishMark;
            if (students[i].passed) {
                passedCount++;
            }
        }

        double averageMarksAllSubjects = (double) totalMarksAllSubjects / numOfStudents;
        double averageMyanmarMarks = (double) totalMyanmarMarks / numOfStudents;
        double averageMathMarks = (double) totalMathMarks / numOfStudents;
        double averageEnglishMarks = (double) totalEnglishMarks / numOfStudents;
        double passRate = (double) passedCount / numOfStudents * 100;

        Student highestMarkStudent = students[0];
        for (Student student : students) {
            if (student.totalMark > highestMarkStudent.totalMark) {
                highestMarkStudent = student;
            }
        }

        System.out.println("All students passed the exam: " + (passedCount == numOfStudents));
        System.out.printf("Passed Rate: %.2f%%\n", passRate);
        System.out.printf("Average Mark (All Subjects): %.2f\n", averageMarksAllSubjects);
        System.out.printf("Average Myanmar Mark: %.2f\n", averageMyanmarMarks);
        System.out.printf("Average Math Mark: %.2f\n", averageMathMarks);
        System.out.printf("Average English Mark: %.2f\n", averageEnglishMarks);
        System.out.printf("%s got the highest mark with %d.\n", highestMarkStudent.name, highestMarkStudent.totalMark);

        System.out.println("Student Summary");
        System.out.println("Name\tGender\tMyanmar\tMath\tEnglish\tTotal\tPassed/Failed");
        System.out.println("====\t======\t=======\t====\t=======\t=====\t=============");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
