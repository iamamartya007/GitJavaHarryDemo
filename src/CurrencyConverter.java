import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("          MODERN GLOBAL CURRENCY CONVERTER       ");
        System.out.println("=================================================");
        System.out.println("Available Currencies:");
        System.out.println("1. USD - US Dollar ($)");
        System.out.println("2. EUR - European Euro (€)");
        System.out.println("3. GBP - British Pound (£)");
        System.out.println("4. INR - Indian Rupee (₹)");
        System.out.println("5. JPY - Japanese Yen (JPY)");
        System.out.println("6. CNY - Chinese Yuan (CNY)");
        System.out.println("7. CHF - Swiss Franc (CHF)");
        System.out.println("8. ARS - Argentine Peso (ARS)");
        System.out.println("=================================================");

        // 1. Get Source Currency
        System.out.print("Select the SOURCE currency (1-8): ");
        int sourceChoice = sc.nextInt();

        // 2. Get Target Currency
        System.out.print("Select the TARGET currency (1-8): ");
        int targetChoice = sc.nextInt();

        // 3. Get Amount
        System.out.print("Enter the amount to convert: ");
        double amount = sc.nextDouble();

        // 4. Conversion Logic via Base USD Anchoring
        double amountInUSD = 0.0;
        String sourceSymbol = "";
        boolean validSource = true;

        // Step A: Convert Source Currency to standard USD base value
        switch (sourceChoice) {
            case 1: amountInUSD = amount;           sourceSymbol = "$";   break; // USD
            case 2: amountInUSD = amount / 0.85;    sourceSymbol = "€";   break; // EUR
            case 3: amountInUSD = amount / 0.74;    sourceSymbol = "£";   break; // GBP
            case 4: amountInUSD = amount / 89.96;   sourceSymbol = "₹";   break; // INR
            case 5: amountInUSD = amount / 156.69;  sourceSymbol = "JPY"; break; // JPY
            case 6: amountInUSD = amount / 7.00;    sourceSymbol = "CNY"; break; // CNY
            case 7: amountInUSD = amount / 0.79;    sourceSymbol = "CHF"; break; // CHF
            case 8: amountInUSD = amount / 1487.50; sourceSymbol = "ARS"; break; // ARS
            default:
                validSource = false;
                break;
        }

        // Step B: Convert USD base value to Target Currency
        double finalAmount = 0.0;
        String targetSymbol = "";
        boolean validTarget = true;

        switch (targetChoice) {
            case 1: finalAmount = amountInUSD;           targetSymbol = "$";   break;
            case 2: finalAmount = amountInUSD * 0.85;    targetSymbol = "€";   break;
            case 3: finalAmount = amountInUSD * 0.74;    targetSymbol = "£";   break;
            case 4: finalAmount = amountInUSD * 89.96;   targetSymbol = "₹";   break;
            case 5: finalAmount = amountInUSD * 156.69;  targetSymbol = "JPY"; break;
            case 6: finalAmount = amountInUSD * 7.00;    targetSymbol = "CNY"; break;
            case 7: finalAmount = amountInUSD * 0.79;    targetSymbol = "CHF"; break;
            case 8: finalAmount = finalAmount = amountInUSD * 1487.50; targetSymbol = "ARS"; break;
            default:
                validTarget = false;
                break;
        }

        // 5. Output Result Display
        System.out.println("=================================================");
        if (!validSource || !validTarget) {
            System.out.println("❌ Error: Invalid currency selection choice!");
        } else if (amount < 0) {
            System.out.println("❌ Error: Conversion amount cannot be negative.");
        } else {
            System.out.printf("Success: %.2f %s  ➡️  %.2f %s\n",
                    amount, sourceSymbol, finalAmount, targetSymbol);
        }
        System.out.println("=================================================");

        sc.close();
    }
}