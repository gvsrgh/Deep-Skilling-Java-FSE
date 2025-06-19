package Code;
import java.util.ArrayList;
import java.util.Scanner;

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