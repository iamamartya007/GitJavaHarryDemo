import java.util.Scanner;

public class Fibonacci_Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series Using Recursion");
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            System.out.print("Fibonacci Series: ");
            // Loop through each term from 0 to n-1 and print its recursive value
            for (int i = 0; i < n; i++) {
                System.out.print(findFibonacci(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Recursive method to return the n-th Fibonacci number
    static int findFibonacci(int n) {
        // Base cases: safely stops the recursion
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
