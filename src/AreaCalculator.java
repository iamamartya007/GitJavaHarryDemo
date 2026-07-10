import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Geometric Area Calculator ===");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Regular Pentagon (5 sides)");
        System.out.println("5. Regular Hexagon (6 sides)");
        System.out.println("6. Regular Decagon (10 sides)");
        System.out.print("Select a shape (1-6): ");

        int choice = sc.nextInt();
        double area = 0;

        switch (choice) {
            case 1: // Square
                System.out.print("Enter the side length: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square: " + area);
                break;

            case 2: // Rectangle
                System.out.print("Enter the length: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width: ");
                double width = sc.nextDouble();
                area = length * width;
                System.out.println("Area of Rectangle: " + area);
                break;

            case 3: // Triangle
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of Triangle: " + area);
                break;

            case 4: // Pentagon
                System.out.print("Enter the side length of the regular pentagon: ");
                double pSide = sc.nextDouble();
                // Formula: (1/4) * sqrt(5 * (5 + 2 * sqrt(5))) * side^2
                area = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(pSide, 2);
                System.out.println("Area of Regular Pentagon: " + area);
                break;

            case 5: // Hexagon
                System.out.print("Enter the side length of the regular hexagon: ");
                double hSide = sc.nextDouble();
                // Formula: (3 * sqrt(3) / 2) * side^2
                area = ((3 * Math.sqrt(3)) / 2) * Math.pow(hSide, 2);
                System.out.println("Area of Regular Hexagon: " + area);
                break;

            case 6: // Decagon
                System.out.print("Enter the side length of the regular decagon: ");
                double dSide = sc.nextDouble();
                // Formula: (5/2) * side^2 * sqrt(5 + 2 * sqrt(5))
                area = 2.5 * Math.pow(dSide, 2) * Math.sqrt(5 + 2 * Math.sqrt(5));
                System.out.println("Area of Regular Decagon: " + area);
                break;

            default:
                System.out.println("Invalid selection! Please choose a number between 1 and 6.");
                break;
        }

        sc.close();
    }
}