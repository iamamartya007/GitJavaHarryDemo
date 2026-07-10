import java.util.Scanner;

public class swap2Numbers_with3rdVeriable {
    static void main() {
        System.out.println("SWAPPING 2 NUMBERS");
        System.out.println("Enter 1st Number : ");
        Scanner sc = new Scanner(System.in) ;
        int n1 = sc.nextInt() ;
        System.out.println("Enter 2nd Number  :  ");
        int n2 = sc.nextInt();
        swapping ( n1 , n2 ) ;
    }
    static void swapping ( int a1 , int a2 ){
        int temp = 0 ;

        temp =a1 ;
        a1 = a2 ;
        a2 = temp ;

        System.out.println("1st NUMBER IS  :  " + a1);
        System.out.println("2nd NUMBER IS  :  "  +a2);
    }
}
