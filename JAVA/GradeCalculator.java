import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade D");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid marks entered");
        }
    }
}
