import java.util.Scanner;

public class PrimeNumberGivenRange {
    public static void main(String[] args){
        System.out.println("BREAK___TEST");
        System.out.println("Enter Range of Numbers to Print 1st Prime Number");
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter 1st Number");
        int a1 = sc.nextInt() ;
        System.out.println("Enter 2nd Number");
        int a2 = sc.nextInt();
        if((a1>a2)|| ((a2-a1)<5)){
            System.out.println("Wrong Input");
        }
        else {
            testPrime(a1, a2);
        }


    }
    public static void testPrime (int n1 , int n2 ){
        System.out.println("Prime numbers in the given range are:");


        for (int i = n1; i <= n2; i++) {
            // 1 and lower are not prime numbers
            if (i <= 1) {
                continue;
            }

            boolean isPrime = true;


            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

