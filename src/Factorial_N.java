import java.util.Scanner;

public class Factorial_N {
    static void main() {
        System.out.println(" FACTORIAL ");
        System.out.println(" Enter Number to find Factorial ");
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;
        System.out.print(" FACTORIAL of " +n+" is  ---- > " );
        factorial (n) ;
    }
    static void factorial ( int N)
    {
        int mul = 1 ;
        for( int i = 1 ; i <= N ; i ++ ){
            mul = mul * i ;
        }
        System.out.println(mul);

    }
}
