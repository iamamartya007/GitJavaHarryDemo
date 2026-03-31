import java.util.Scanner;

public class KMtoMiles {
        public static void main(String[] args) {
            System.out.println("KM ---- >  Mile :Conversion");
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter KM : ");
            double KM = sc.nextDouble() ;
            KM ( KM) ;
        }


        public static void KM ( double km )
        {
            double mile ;
            mile = km / 1.60934 ;
            System.out.println(" Converted  KM to Miles  : " +mile + "  Miles");

        }
    }


