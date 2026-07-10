import java.util.Scanner;

public class LargestOF3 {

    static void main() {
        System.out.println("SWAPPING 2 NUMBERS");
        System.out.println("Enter 1st Number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd Number  :  ");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd Number  :  ");
        int n3 = sc.nextInt();
        largest ( n1 , n2 , n3 ) ;

    }
    static void largest ( int a1, int a2 , int a3 ){
        if ( a1 > a2 ){
            System.out.println(a1+"  IS LARGEST ");
        }
        if ( a2 > a3 ){
            System.out.println(a2+"  IS LARGEST ");
        }
        else {
            System.out.println(a3+"  IS LARGEST ");
        }


    }
}