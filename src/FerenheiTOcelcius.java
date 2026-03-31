import java.util.Scanner;

public class FerenheiTOcelcius {

    public static void main(String[] args) {
        System.out.println("Fahrenheit  ---- >  Celcius :Conversion");
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter F : ");
        double F = sc.nextDouble() ;
        F ( F) ;
    }


    public static void F ( double f )
    {
        double c ;
        c = ((f   -32) / 1.8 );
        System.out.println(" Converted  Fahrenheit  to Celcius  : " +c + "  Degree");

    }
}

