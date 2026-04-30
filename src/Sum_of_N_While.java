import java.util.Scanner;

public class Sum_of_N_While {
    static void main() {
        System.out.println("Sum of N Numbers");
        System.out.println("Enter Nth Number");
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        Sum(n) ;

    }

    static void Sum( int n ){
        int i = 1 ;
        int sum = 0 ;
        while ( i <= n ){
            sum = sum + i ;

            i++ ;


        }
        System.out.println("The sum of "+n+" numbers is: " + sum);
    }
}
