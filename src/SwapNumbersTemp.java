import java.util.Scanner;

public class SwapNumbersTemp {

    static void main() {
        System.out.println("Enter 2 Numbers -----");
        System.out.println("Enter 1st Number  ");
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        System.out.println("1st Number->   A :  " +a);


        System.out.println("Enter 2nd Number  ");
        Scanner sc1 = new Scanner(System.in) ;
        int b = sc1.nextInt() ;
        System.out.println("2nd Number->   B :  " +b);

        Swap (a,b);
    }

    public static void Swap ( int a , int b){
        int temp ;
        temp =a ;
        a= b;
        b=temp;
        System.out.println( " Now A--- >  " + a);
        System.out.println( " Now A--- >  " + b);
    }
}
