package 이동현.assignment1;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {
        int[] scores = new int[5];   // Array for 5 students
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the scores of 5 students:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        int passCount = 0; // Number of students who passed

        // Pass/Fail check
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                System.out.println("Student " + (i + 1) + ": 통과 ");
                passCount++;
            } else {
                System.out.println("Student " + (i + 1) + ": 불통과 ");
            }
        }

        // Final result
        System.out.println("통과한 학생 수: " + passCount+"명");

        scanner.close();
    }
}