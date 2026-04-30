import java.util.Scanner;

public class EvenAndODD {
    static void main() {
        System.out.println("Enter Nth Number");
        Scanner sc = new Scanner(System.in) ;
        int number = sc.nextInt() ;

        System.out.println("==========EVEN Numbers=============");
        Even(number);
        System.out.println("==========ODD Numbers=============");
        Odd(number) ;
    }

    static void Even ( int p ) {
        int n = 1 ;
        while (p>=n){
            if( n % 2 == 0 ){
                System.out.println(n);
            }
            n++;
        }
    }

    static void Odd ( int p ) {
        int n = 1 ;
        while (p>=n){
            if( n % 2 !=0 ){
                System.out.println(n);
            }
            n++;
        }
    }
}
