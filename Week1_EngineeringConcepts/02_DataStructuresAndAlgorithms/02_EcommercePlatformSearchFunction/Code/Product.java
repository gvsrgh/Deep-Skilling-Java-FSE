/*A singleton class for Product */

public class Product {
    private int productId;
    private String productName;
    private String category;

    Product () {};

    // Constructor to initialize Product with parameters
    Product (int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Getters for product attributes
    protected int getProductId(){
        return productId;
    }

    protected String getProductName(){
        return productName;
    }

    protected String getCategory(){
        return category;
    }

    // Setters for product attributes
    protected void setProductId(int productId) {
        this.productId = productId;
    }

    protected void setProductName(String productName) {
        this.productName = productName;
    }

    protected void setCategory(String category) {
        this.category = category;
    }
}