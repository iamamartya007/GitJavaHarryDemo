import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {

        System.out.println(" Add your Numbers ");
        int total = 0;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter Marks of Science :  ");
        int science = sc.nextInt() ;
        System.out.println("Enter Marks of Math :  ");
        int math = sc.nextInt() ;
        System.out.println("Enter Marks of Bio :  ");
        int Bio = sc.nextInt() ;
        System.out.println("Enter Marks of Geography :  ");
        int Geography = sc.nextInt() ;
        System.out.println("Enter Marks of History :  ");
        int History = sc.nextInt() ;
        System.out.println("Enter Marks of Physics :  ");
        int Physics = sc.nextInt() ;
        System.out.println("Enter Marks of EVS :  ");
        int EVS = sc.nextInt() ;
        System.out.println("Enter Marks of Sports :  ");
        int Sports = sc.nextInt() ;


        int avg = (science +  math + Bio + Geography + History + Physics + EVS + Sports ) / 8 ;
        float percent = (float) avg /100 ;

        System.out.println(" Average is : " + avg);
        System.out.println(" Percentage is :   " + percent);


    }
}
