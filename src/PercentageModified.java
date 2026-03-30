import java.util.Scanner;

public class PercentageModified {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter your Marks ---");
        System.out.print("Science: "); int science = sc.nextInt();
        System.out.print("Math: "); int math = sc.nextInt();
        System.out.print("Bio: "); int bio = sc.nextInt();
        System.out.print("Geography: "); int geography = sc.nextInt();
        System.out.print("History: "); int history = sc.nextInt();
        System.out.print("Physics: "); int physics = sc.nextInt();
        System.out.print("EVS: "); int evs = sc.nextInt();
        System.out.print("Sports: "); int sports = sc.nextInt();


        calculateAndDisplay(science, math, bio, geography, history, physics, evs, sports);

        sc.close();
    }


    public static void calculateAndDisplay(int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8) {

        double total = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8;
        double avg = total / 8.0;
        double percentage = (avg / 100) * 100;


        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Percentage: " + percentage + "%");
    }
}