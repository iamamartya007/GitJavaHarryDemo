import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MilestoKM{
    public static void main(String[] args) {
        System.out.println("Miles ---- >  KM:Conversion");
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Miles : ");
        double miles = sc.nextDouble() ;
        miles ( miles) ;
    }


public static void miles ( double mile )
{
    double km ;
    km = mile * 1.60934 ;
    System.out.println(" Converted  Miles to Km  : " +km + "  KM");

}
}
