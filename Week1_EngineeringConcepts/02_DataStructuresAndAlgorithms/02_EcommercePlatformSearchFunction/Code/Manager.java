//Menu Driven code for adding and searching
import java.util.Scanner;

public class Manager extends ProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager pm = new ProductManager();
        boolean running = true;
        System.out.println("Welcome to Product Management System");
        while (running) {
            System.out.println();
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product (Linear Search)");
            System.out.println("3. Search Product (Binary Search)");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    pm.addProduct(sc);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Enter ProductId to search: ");
                    int linearId = sc.nextInt();
                    sc.nextLine();
                    int linearIndex = pm.linearSearch(linearId);
                    if (linearIndex != -1) {
                        System.out.println("Product found at index: " + linearIndex);
                        pm.displaySpecificProduct(linearId);
                    } else {
                        System.out.println("Product not found.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Enter ProductId to search: ");
                    int binaryId = sc.nextInt();
                    sc.nextLine();
                    int binaryIndex = pm.binarySearch(binaryId);
                    if (binaryIndex != -1) {
                        System.out.println("Product found at index: " + binaryIndex);
                        pm.displaySpecificProduct(binaryId);
                    } else {
                        System.out.println("Product not found.");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Displaying all products:");
                    pm.displayProducts();
                    System.out.println();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        sc.close();
    }
}
