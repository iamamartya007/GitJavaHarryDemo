import java.util.Scanner;

public class WhileMultiplicationLoop {
    static void main() {
        System.out.println("===============================");
        System.out.println("Enter the Number of the multiplication table");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt() ;
        System.out.println("Enter the Number for the number up to multiplication table");
        int N = sc.nextInt() ;
        System.out.println("===============================");
        multiple(Number , N ) ;


    }
    static  void multiple ( int num , int n){
       int i =1 ;
        while ( i <= n) {
            System.out.println(num+" "+" x " + i+"   = " + num *  i );
            i++;
        }
    }
}


