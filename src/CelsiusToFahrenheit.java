import java.util.Scanner;

public class CelsiusToFahrenheit {


        public static void main(String[] args) {
            System.out.println("Celsius  ---- >  Fahrenheit :Conversion");
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter C : ");
            double C = sc.nextDouble() ;
            C ( C) ;
        }


        public static void C ( double c )
        {
            double f ;
            f = (c*1.8)+32 ;
            System.out.println(" Converted  Celsius  to Fahrenheit  : " +f + "  Degree");

        }
    }


