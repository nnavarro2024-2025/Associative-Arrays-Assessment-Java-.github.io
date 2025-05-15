

package com.mycompany.bastaproject1;




import java.util.HashMap;
import java.util.Scanner;
public class Bastaproject1 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> studentScores = new HashMap<>();
        
        studentScores.put("John", 85);
        studentScores.put("Alice", 90);
        studentScores.put("Mark", 78);
        studentScores.put("Sophia", 95);
        studentScores.put("Emma", 88);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();
        if (studentScores.containsKey(studentName)) {
            System.out.println(studentName + "'s score is: " + studentScores.get(studentName));
        } else {
            System.out.println("Student not found.");
        }
        
        System.out.print("Enter student's name to update their score: ");
        String updateStudentName = scanner.nextLine();
        if (studentScores.containsKey(updateStudentName)) {
            System.out.print("Enter the new score: ");
            int newScore = scanner.nextInt();
            studentScores.put(updateStudentName, newScore);
            System.out.println(updateStudentName + "'s score updated successfully!");
        } else {
            System.out.println("Student not found, cannot update score.");
        }
    }
}
        
