import java.util.* ;
public class UserInput {
    public static void main(String[] args) {
            System.out.println ("Enter a Number : ") ;
            Scanner sc = new Scanner (System.in ) ;
            int Number = sc.nextInt() ;
            System.out.println("Number is :  " + Number);

        System.out.println ("Enter a Floater : ") ;
        Scanner sc1 = new Scanner (System.in ) ;
        float Floater = sc1.nextFloat();
        System.out.println("Floater is :  " + Floater);

        System.out.println ("Enter a Character : ") ;
        char Character = sc1.next().charAt(0);
        System.out.println("Character is :  " + Character);

        System.out.println ("Enter a Int : ") ;
        boolean b = sc.hasNextInt() ;
        System.out.println ("Sysso "+b);


    }
}
