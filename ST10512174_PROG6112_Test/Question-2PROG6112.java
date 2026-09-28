import java.util.Scanner;

// The Interface 
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// The Abstract Class
abstract class Consoles implements IConsoles {
    // Variables to store data (Encapsulation)
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor accepting parameters
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Methods to get the values
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}

// The Subclass
class ConsoleSales extends Consoles {
    
    // Constructor matching the abstract class
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print the report
    public void printReport() {
        System.out.println("\n--- CONSOLE SALES REPORT ---");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store Name   : " + getStore());
        System.out.println("Total Sales  : R" + getTotalSales()); // Assuming R for Rand based on previous context
        System.out.println("----------------------------");
    }
}

// The RunApplication Class
public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Electronics Store System");

        // Prompt user for console device type
        System.out.print("Enter console device type (e.g., PS5, XBOX, SWITCH): ");
        String consoleType = scanner.nextLine();

        // Prompt user for store name
        System.out.print("Enter store name: ");
        String storeName = scanner.nextLine();

        // Prompt user for total sales
        System.out.print("Enter total amount of sales: ");
        int totalSales = scanner.nextInt();

        // Instantiate the ConsoleSales class
        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);

        // Call the printReport method to display the output
        sale.printReport();

        scanner.close();
    }
}