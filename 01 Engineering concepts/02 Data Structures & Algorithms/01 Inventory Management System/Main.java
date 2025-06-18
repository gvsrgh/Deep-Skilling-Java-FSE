import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IMS ims = new IMS();
        while(true){
            System.out.println("1. View Product Details");
            System.out.println("2. Add new Product Details");
            System.out.println("3. Update an existing Product Details");
            System.out.println("4. Remove a Product by ProdcutId");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {
            case 1:
                System.out.println();
                System.out.println("View Product Details:");
                ims.viewProduct();
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.println("Add New Product:");
                System.out.print("Enter Product ID: ");
                int productId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Product Name: ");
                String productName = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                ims.addProduct(productId, productName, quantity, price);
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.println("Updating the Existing Product...");
                System.out.print("Enter the product's Product Id to update: ");
                productId = sc.nextInt();
                ims.updateProduct(sc, productId);
                System.out.println();
                break;
            case 4:
                System.out.println();
                System.out.print("Enter the product's productId to be removed: ");
                productId = sc.nextInt();
                ims.deleteProduct(productId);
                System.out.println();
                break;
            case 5:
                System.out.println("Program Execution Successfull, exiting...");
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println();
                System.out.println("Please enter a valid choice");
            }
        }
    }
}

/****
 * Analysis:
 * - The IMS class extends the Product class to manage inventory.
 * - It uses an ArrayList to store products, allowing dynamic resizing.
 * - The program provides methods to add, update, delete, and view products.
 * - The main method provides a simple text-based menu for user interaction.
 * 
 * Time Complexity:
 * - Adding a product: O(n) in the worst case (to check for duplicates)
 * - Updating a product: O(n) (to find the product)
 * - Deleting a product: O(n) (to find the product)
 * - Viewing products: O(n) (to iterate through the list)
 * 
 * Space Complexity:
 * - O(n) for storing products in the ArrayList
 * 
 * Optimizations:
 * - Use a HashMap for faster lookups if productId is unique.
 * - We can add product details with time complexity O(1) using HashMap.
 * - But the order of products will not be maintained.
 * - We can use LinkedHashMap to maintain the insertion order.
 ****/