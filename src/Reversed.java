import java.util.Scanner;

public class Reversed {

    public static void main(String[] args) {
        System.out.println("Reverse Number");
        System.out.print("Enter any Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        reverse(number);
    }

    static void reverse(int number) {
        String temp = Integer.toString(number);
        int len = temp.length();
        int[] array = new int[len];

        // 2. Single loop to read digits from right to left into the array
        for (int i = 0; i < len; i++) {
            array[i] = temp.charAt(len - 1 - i) - '0';
        }

        // 3. Print the elements side-by-side to display the full reversed number
        System.out.print("Reversed Number: ");
        for (int digit : array) {
            System.out.print(digit);
        }
        System.out.println();
    }
}