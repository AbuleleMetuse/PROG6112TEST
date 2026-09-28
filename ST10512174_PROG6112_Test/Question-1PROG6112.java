public class Number1Electronics {

    public static void main(String[] args) {

        // Declare and initialize single-dimensional arrays for cities and consoles
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Declare and initialize a two-dimensional array for sales data
        // Rows represent cities (0: Cape Town, 1: PE, 2: Pretoria)
        // Columns represent consoles (0: PS5, 1: XBOX, 2: SWITCH)
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // Declare an array to store the total sales for each city
        int[] cityTotals = new int[cities.length];

        // --- FIRST SECTION: GAMING CONSOLE REPORT ---
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-25s %-10s %-10s %-10s%n", "GAMING CONSOLE REPORT", "", "", "");
        System.out.println("---------------------------------------------------------");
        
        // Print headers for consoles
        System.out.printf("%-25s %-10s %-10s %-10s%n", "", consoles[0], consoles[1], consoles[2]);

        // Loop through the 2D array to print city names and their respective sales
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-25s %-10d %-10d %-10d%n", 
                              cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        // --- SECOND SECTION: CONSOLE SALES TOTALS FOR EACH CITY ---
        System.out.println("\n---------------------------------------------------------");
        System.out.printf("%-25s%n", "CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------");

        int maxSales = 0;
        String topCity = "";

        // Calculate the total sales per city (summing rows)
        for (int i = 0; i < sales.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < sales[i].length; j++) {
                rowSum += sales[i][j];
            }
            cityTotals[i] = rowSum; // Store total in the 1D array
            
            // Print the total for the city
            System.out.printf("%-25s %d%n", cities[i], cityTotals[i]);

            // Check if this city has the most sales so far
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                topCity = cities[i];
            }
        }

        // --- THIRD SECTION: CITY WITH THE MOST SALES ---
        System.out.println("\n---------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("---------------------------------------------------------");
    }
}