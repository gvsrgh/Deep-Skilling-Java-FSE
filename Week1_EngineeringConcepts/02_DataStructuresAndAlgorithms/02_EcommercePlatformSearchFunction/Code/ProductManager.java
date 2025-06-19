/*ProductManger class for managing products*/
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager extends Product {
    ArrayList<Product> products = new ArrayList<>();
    private int productId;
    private String productName;
    private String category;

    protected void addProduct(Scanner sc) {
        System.out.print("Enter the ProductId: ");
        productId = sc.nextInt();
        sc.nextLine();

        boolean exists = false;
        for (Product p : products) {
            if (p.getProductId() == productId) {
                System.out.println("A product with same productId Exists");
                exists = true;
                break;
            }
        }

        if (!exists) {
            System.out.print("Enter the ProductName: ");
            productName = sc.nextLine();

            System.out.print("Enter the Category: ");
            category = sc.nextLine();

            Product p = new Product(productId, productName, category);
            products.add(p);
            System.out.println("Successfully added the Product!!!");
        }
    }

    protected int linearSearch(int productId){
        int index = -1;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProductId() == productId){
                index = i;
            }
        }
        return index;
    }

    protected int binarySearch(int productId){
        products.sort((p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));
        int index = -1;
        int low = 0;
        int high = products.size() - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(products.get(mid).getProductId() == productId){
                index = mid;
                break;
            } else if(products.get(mid).getProductId() < productId){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    protected void displaySpecificProduct(int productId){
        int index = binarySearch(productId);
        if(index != -1){
            Product p = products.get(index);
            System.out.println("ProductId: " + p.getProductId());
            System.out.println("ProductName: " + p.getProductName());
            System.out.println("Category: " + p.getCategory());
        } else {
            System.out.println("Product with ProductId " + productId + " not found.");
        }
    }

    protected void displayProducts(){
        if(products.isEmpty()){
            System.out.println("No products available.");
        } else {
            System.out.println("ProductId\tProductName\tCategory");
            for(Product p: products){
                System.out.println(p.getProductId() + "\t\t" + p.getProductName() + "\t\t" + p.getCategory());
            }
        }
    }
}
