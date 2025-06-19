package Code;
/* Invetory management system for a warehouse */

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