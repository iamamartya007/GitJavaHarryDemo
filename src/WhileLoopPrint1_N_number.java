import java.util.Scanner;

public class WhileLoopPrint1_N_number {


    static void main() {
        System.out.println("Enter nth Number");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        System.out.println("Straight Print==========");
        StraightPrint2N(p);

        System.out.println("Reverse Print==========");
        ReversePrint2N(p);
    }


    static void StraightPrint2N(int p) {

        int n = 1;
        while (n <= p) {
            System.out.println(n);
            n++;

        }
    }
     static   void ReversePrint2N(int q){

            int n = 1;
            while (q >= n) {
                System.out.println(q);
                q--;

            }
        }

    }
