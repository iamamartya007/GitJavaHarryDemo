import java.util.Scanner;

public class Factorial_Recursive {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Find Factorial of Number");
        System.out.println("Enter a Number to Find Factorial :   " );
        int number = sc.nextInt() ;
        if (( number < 1 ) || ( number ==1 )) {
            System.out.println("Invalid Number ");

        }else {
            int result = findFactorials(number);
            System.out.println("Factorial is: " + result);
        }
        sc.close();

    }
    static int findFactorials(int number) {

        if (number <= 1) {
            return 1;
        }

        return number * findFactorials(number - 1);
    }

}
