/**
 * The StudentGradeCalculator class calculates the total marks, average percentage, and grade for a
 * student based on the marks obtained in each subject.
 */
import java.util.Scanner;

public class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        double totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) 
        {
            System.out.print("Enter marks obtained in Subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        // Calculate Total Marks
        double maxMarks = numberOfSubjects * 100;

        // Calculate Average Percentage
        double averagePercentage = (totalMarks / maxMarks) * 100;

        // Grade Calculation
        String grade = calculateGrade(averagePercentage);

        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Function to assign grades based on average percentage
    private static String calculateGrade(double percentage) 
    {
        if (percentage >= 90) 
        {
            return "A+";
        } else if (percentage >= 80) 
        {
            return "A";
        } else if (percentage >= 70) 
        {
            return "B";
        } else if (percentage >= 60) 
        {
            return "C";
        } else if (percentage >= 50) 
        {
            return "D";
        } else 
        {
            return "F";
        }
    }
}
