import java.util.*;

public class RecursiveFibonacci {
    // Recursive method to find Fibonacci number
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
