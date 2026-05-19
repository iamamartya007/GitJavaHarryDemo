import java.util.Scanner;

public class Sum_of_N_numbers_DoWhile {

    static void main() {
        System.out.println("==========+   Sum of N Numbers  +==========");
        int n ;
        Scanner sc = new Scanner(System.in) ;
        n = sc.nextInt() ;
        sum(n) ;
    }
    static void sum ( int n){
        int i = 0  , sum = 0 ;
        do{
            sum = sum + i ;
            i++ ;

        }
        while(i<=n) ;

        System.out.println("Sum is : "+ sum);

    }
}
