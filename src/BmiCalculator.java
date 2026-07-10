import  java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("            BODY MASS INDEX (BMI)        ");
        System.out.println("=========================================");

        // Directly take metric inputs
        System.out.print("Enter weight in kilograms (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in centimeters (cm): ");
        double heightCm = sc.nextDouble();

        // Convert centimeters to meters for the calculation
        double heightMeters = heightCm / 100.0;

        // Calculate BMI using the standard Metric formula
        double bmi = weight / (heightMeters * heightMeters);

        // Display results
        System.out.println("=========================================");
        System.out.printf("Your calculated BMI is: %.2f\n", bmi);

        // Categorize BMI based on official health standards
        System.out.print("Health Category: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight (Healthy)");
        } else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
        System.out.println("=========================================");

        sc.close();
    }
}