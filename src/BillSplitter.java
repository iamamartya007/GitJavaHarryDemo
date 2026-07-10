import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("             BILL SPLITTER               ");
        System.out.println("=========================================");

        // 1. Get total bill amount
        System.out.print("Enter the total bill amount (₹): ");
        double totalBill = sc.nextDouble();

        // 2. Get number of people
        System.out.print("Enter the number of people: ");
        int numberOfPeople = sc.nextInt();

        System.out.println("=========================================");

        // 3. Input Validation Checklist
        if (totalBill < 0) {
            System.out.println("❌ Error: Total bill amount cannot be negative.");
        } else if (numberOfPeople <= 0) {
            System.out.println("❌ Error: Number of people must be 1 or more.");
        } else {
            // 4. Calculate split share
            double sharePerPerson = totalBill / numberOfPeople;

            // 5. Display formatted results
            System.out.printf("Total Bill:       ₹  %.2f\n", totalBill);
            System.out.printf("Total People:     %d\n", numberOfPeople);
            System.out.println("-----------------------------------------");
            System.out.printf("Each Person Pays: ₹  %.2f\n", sharePerPerson);
        }
        System.out.println("=========================================");

        sc.close();
    }
}