import java.util.Scanner;

public class GroceryCalculator {
    public static void main(String[] args) {
        // Arrays storing the exact data from your image
        String[] items = {
                "Organic Bananas", "Honeycrisp Apples", "Baby Spinach",
                "Roma Tomatoes", "Boneless Chicken Breasts", "Lean Ground Beef",
                "Atlantic Salmon Fillet", "Whole Milk (1 Gallon)",
                "Greek Yogurt (Large Tub)", "Cheddar Cheese Block",
                "Large White Eggs", "Rolled Oats"
        };

        double[] prices = {
                2.50, 4.99, 3.29, 1.99, 11.50, 8.99, 14.00, 3.89, 5.49, 4.29, 3.50, 2.79
        };

        Scanner sc = new Scanner(System.in);
        double totalBill = 0.0;
        boolean shopping = true;

        System.out.println("=================================================");
        System.out.println("            WELCOME TO THE GROCERY STORE          ");
        System.out.println("=================================================");

        while (shopping) {
            // 1. Print the price list dynamically
            System.out.printf("\n%-7s %-28s %-15s\n", "S.No.", "Item Description", "Estimated Price");
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%-7d %-28s $%-15.2f\n", (i + 1), items[i], prices[i]);
            }
            System.out.println("-------------------------------------------------");
            System.out.println("0       👉 CHECKOUT & EXIT");
            System.out.println("=================================================");

            // 2. User selection
            System.out.print("Enter the Serial Number (S.No.) to add to cart: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                shopping = false; // Break out of loop to checkout
            } else if (choice >= 1 && choice <= items.length) {
                // Adjust index for 0-based array mapping
                int index = choice - 1;

                System.out.print("Enter quantity for " + items[index] + ": ");
                int quantity = sc.nextInt();

                if (quantity > 0) {
                    double cost = prices[index] * quantity;
                    totalBill += cost;
                    System.out.printf("Added: %d x %s ($%.2f each) = $%.2f\n",
                            quantity, items[index], prices[index], cost);
                    System.out.printf("Current running total: $%.2f\n", totalBill);
                } else {
                    System.out.println("❌ Invalid quantity! Must be greater than 0.");
                }
            } else {
                System.out.println("❌ Invalid Serial Number! Please select a valid option from the menu.");
            }
        }

        // 3. Final Checkout Display
        System.out.println("\n=================================================");
        System.out.println("                    FINAL BILL                   ");
        System.out.println("=================================================");
        System.out.printf("Total Pricing: $%.2f\n", totalBill);
        System.out.println("Thank you for shopping with us!");
        System.out.println("=================================================");

        sc.close();
    }
}