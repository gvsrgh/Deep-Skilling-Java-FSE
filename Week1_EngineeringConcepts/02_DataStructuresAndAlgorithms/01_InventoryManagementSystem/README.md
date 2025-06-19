## 📘 **Exercise 1: Inventory Management System**

### **Scenario:**

You are developing an inventory management system for a warehouse. Efficient data storage and retrieval are crucial.

## 🔍 1. Understand the Problem

### **Why use Data Structures and Algorithms (DSA)?**

* 🧠 **Efficient data management** – critical when dealing with hundreds or thousands of items.
* ⚡ **Quick access & retrieval** – possible using proper data structures.
* 📈 **Scalability** – ensures performance doesn't degrade with size.
* 🚀 **Improved performance** – especially for searching, updating, and deleting.

### **Suitable Data Structures:**

* **ArrayList**: Simple and useful for maintaining order.
* **HashMap**: Allows constant-time lookup by `productId`.
* **LinkedList**: Good for frequent additions/deletions (not used here).

## 🛠️ 2. Setup

* Java-based console project structure.
* Key components:

  * `Product`: Represents individual inventory items.
  * `IMS`: Handles logic for adding, updating, deleting, and viewing products.
  * `Main`: User interface with a text-based menu and input handling.

## 🔧 3. Implementation

### ✅ **Product Class**

Defines a product with:

* `productId`
* `productName`
* `quantity`
* `price`

### ✅ **IMS Class**

Uses `ArrayList<Product>` for storing inventory data. Key methods:

* `addProduct()`
* `updateProduct()`
* `deleteProduct()`
* `viewProduct()`

### ✅ **Main Class**

* Displays menu
* Takes input using `Scanner`
* Invokes IMS methods
* Fixes scanner-related crash by **not closing `Scanner` prematurely**

## 🧪 4. Demonstration (Screenshots)

### ✏️ **Adding and Updating Product**

![Updating Product Details](./assets/Updating%20Product%20Details.png)

### 🗑️ **Deleting Product**

![Deletion](./assets/Deletion.png)

### ❌ **Failure Cases (No product found)**

![Failure Cases](./assets/Failure%20Cases.png)

### ⚠️ **Invalid Product ID**

![Invalid ProductId](./assets/Invalid%20ProductId.png)

### 🔁 **Duplicate Product Entry**

![Already Exists](./assets/Already%20Exists.png)

## 📊 5. Analysis

### **Time Complexity**

| Operation      | Complexity | Why                                  |
| -------------- | ---------- | ------------------------------------ |
| Add Product    | O(n)       | Linear search to avoid duplicate IDs |
| Update Product | O(n)       | Linear search by `productId`         |
| Delete Product | O(n)       | Find product to remove               |
| View Products  | O(n)       | Print all items in list              |

### **Space Complexity**

* **O(n)**: Storing `n` products in the `ArrayList`.

## 🚀 Optimization Suggestions

* Replace `ArrayList` with **`HashMap<Integer, Product>`**:

  * ✔️ `O(1)` for add, update, delete by `productId`.
  * ❌ Order of insertion is lost.
* Use **`LinkedHashMap`** instead to:

  * ✔️ Maintain insertion order
  * ✔️ Allow fast access via keys