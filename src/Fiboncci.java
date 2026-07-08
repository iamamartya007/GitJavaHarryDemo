import java.util.Scanner;

public class Fiboncci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRINTING FIBONACCI SERIES");
        System.out.println("Choose number to print up to  --- > ");
        int n =  sc.nextInt() ;
        printFibonacci(n);
        sc.close();
    }

    static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
