import java.util.Scanner;

public class Test_Palindrome {

    public static void main ( String[] args ){
        System.out.println("Test Palindrome");
        System.out.println("Enter a Number to test Palindrome  :   ");
        Scanner sc =  new Scanner ( System.in) ;
              int n = sc.nextInt() ;
        checkPalinDrome (n) ;

    }
    static void checkPalinDrome ( int Number )
    {
       int originalNumber = Number ;
       int rev = 0 ;
       while(Number > 0 )
       {
           int reminder = Number % 10 ;
           rev = (rev * 10 ) + reminder ;
            Number = Number / 10 ;

       }
       if ( originalNumber == rev )
       {
           System.out.println("Palindrome");
       }
       else {
           System.out.println("Mon_Palindrome");
       }
    }
}
