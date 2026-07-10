import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorldClock {
    public static void main(String[] args) {
        // Parallel arrays containing names and their standard IANA Time Zone IDs
        String[] cities = {
                "London, UK", "Paris, France", "Berlin, Germany", "Cairo, Egypt",
                "Moscow, Russia", "Dubai, UAE", "Mumbai, India", "Bangkok, Thailand",
                "Singapore", "Tokyo, Japan", "Sydney, Australia", "Auckland, New Zealand",
                "Honolulu, USA", "Los Angeles, USA", "Denver, USA", "Chicago, USA",
                "New York, USA", "Sao Paulo, Brazil", "Buenos Aires, Argentina", "Reykjavik, Iceland"
        };

        String[] timeZones = {
                "Europe/London", "Europe/Paris", "Europe/Berlin", "Africa/Cairo",
                "Europe/Moscow", "Asia/Dubai", "Asia/Kolkata", "Asia/Bangkok",
                "Asia/Singapore", "Asia/Tokyo", "Australia/Sydney", "Pacific/Auckland",
                "Pacific/Honolulu", "America/Los_Angeles", "America/Denver", "America/Chicago",
                "America/New_York", "America/Sao_Paulo", "America/Argentina/Buenos_Aires", "Atlantic/Reykjavik"
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("                 WORLD CLOCK SYSTEM                 ");
        System.out.println("====================================================");

        // Print the city selection list across two neat columns
        for (int i = 0; i < cities.length / 2; i++) {
            System.out.printf("%-2d. %-22s | %-2d. %-22s\n",
                    (i + 1), cities[i],
                    (i + 11), cities[i + 10]);
        }
        System.out.println("====================================================");

        System.out.print("Select a city by entering its Serial Number (1-20): ");
        int choice = sc.nextInt();

        System.out.println("====================================================");

        if (choice >= 1 && choice <= 20) {
            int index = choice - 1;
            String selectedCity = cities[index];
            String selectedZoneId = timeZones[index];

            // 1. Grab your exact system time and automatically map it to the target zone
            ZoneId zone = ZoneId.of(selectedZoneId);
            ZonedDateTime cityTime = ZonedDateTime.now(zone);

            // 2. Format output for easy readability (e.g., 2026-07-10 23:43:15 PM)
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a (z)");

            System.out.println("Selected Destination: " + selectedCity);
            System.out.println("Current Date:         " + cityTime.format(dateFormatter));
            System.out.println("Current Time:         " + cityTime.format(timeFormatter));
        } else {
            System.out.println("❌ Invalid choice! Please run the program again and choose 1-20.");
        }
        System.out.println("====================================================");

        sc.close();
    }
}