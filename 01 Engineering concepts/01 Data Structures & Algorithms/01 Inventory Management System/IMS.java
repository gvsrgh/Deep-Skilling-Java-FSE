/* Invetory management system for a warehouse */
import java.util.Scanner; //For user input
import java.util.ArrayList; //For storing products

/*****
 * 1. Why DSA for handling inventory?
 *  - Efficient data management
 *  - Quick access and retrieval
 *  - Scalability for large datasets
 *  - Improved performance
 * 
 * 2. Type of data structure used:
 *  - HashMap for quick lookups
 *  - ArrayList for ordered storage
 *  - LinkedList for dynamic data handling
******/

class Product {
    //Suggested attributes for Product class
    protected int productId;
    protected String productName;
    protected int quantity;
    protected double price;

    //A default constructor, so that we can extend Product class
    protected Product(){}

    // Constructor for adding the product details
    protected Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    //Getter for productId
    protected int getProductId(){
        return this.productId;
    }

    //Setter methods for remaining product details
    protected void setProductName(String productName){
        this.productName = productName;
    }

    protected void setQuantity(int quantity){
        this.quantity = quantity;
    }

    protected void setPrice(double price){
        this.price = price;
    }
}

class IMS extends Product {
    protected ArrayList<Product> inventory = new ArrayList<>();

    //Adding a new product to our inventory
    protected void addProduct(int productId, String productName, int quantity, double price){
        if(productId <= 0){
            System.out.println("Please enter a valid productId");
            return;
        }
        for(Product p: inventory){
            if(p.getProductId() == productId){
                System.out.println("A product with productId " + productId + " already exists.");
                return;
            }
        }
        System.out.println();
        Product p = new Product(productId, productName, quantity, price);
        inventory.add(p);
        System.out.println("Product Added to the inventory Successfully!!!");
    }

    //Updating details of an existing product in the inventory
    protected void updateProduct(Scanner sc, int productId){
        boolean found = false;
        for(Product product: inventory){
            if(product.getProductId() == productId){
                System.out.print("Enter new product name: ");
                String productName = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter the new quantity of the product: ");
                int quantity = sc.nextInt();
                System.out.print("Enter new product price: ");
                double price = sc.nextDouble();
                product.setProductName(productName);
                product.setQuantity(quantity);
                product.setPrice(price);
                found = true;
            }
        }
        if(!found)
            System.out.println("There is no Product with that ProductId");
        else
            System.out.println("The product Details with the product Id " + productId + " Updated Successfully!!");
    }

    //Deleting a product from the inventory based on the productId
    protected void deleteProduct(int productId){
        boolean found = false;

        for(Product product: inventory){
            if(product.getProductId() == productId){
                inventory.remove(product);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("There is no product with given productId");
        else
            System.out.println("Deleteion Successfull!!!");

    }

    //Viewing the Product details, if present in the inventory
    protected void viewProduct(){
        if (inventory.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : inventory) {
                System.out.println("Product ID: " + p.productId + ", Name: " + p.productName + ", Quantity: " + p.quantity + ", Price: " + p.price);
            }
        }
    }
}

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