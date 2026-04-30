import java.util.Scanner;

public class Sum_of_Even_ODD_Numbers {
    static void main() {

        System.out.println("========SUM of Even & ODD Numbers=========");
        System.out.println("Enter nth  Number : ");
        Scanner sc = new Scanner( System.in) ;
        int number = sc.nextInt () ;
        Even(number) ;
        ODD(number) ;

     }
     static void Even (int N){
         System.out.println("Even Numbers");
         int sum = 0 ;
         for ( int i = 1 ; i <= N ; i++){
              if (i %2 == 0 ){
                  System.out.println(i);
                  sum = sum + i ;
              }
         }
         System.out.println("The Sum of all Even Numbers is :  " +sum);

     }
    static void ODD (int Np){
        System.out.println("ODD Numbers");
        int sum = 0 ;
        for ( int i = 1 ; i <= Np ; i++){
            if (i %2 != 0 ){
                System.out.println(i);
                sum = sum + i ;
            }
        }
        System.out.println("The Sum of all ODD Numbers is :  " +sum);

    }
}
