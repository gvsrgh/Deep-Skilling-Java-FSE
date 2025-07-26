public class Main {
    public static void main(String[] args) {
        // Sample data
        Order[] orders = {
            new Order("O101", "Alice", 200.50),
            new Order("O102", "Bob", 150.00),
            new Order("O103", "Charlie", 300.75),
            new Order("O104", "Diana", 250.00)
        };

        // Uncomment one of the following based on which sort you want to run

        // --- Bubble Sort ---
        // bubbleSort(orders);

        // --- Quick Sort ---
        quickSort(orders, 0, orders.length - 1);

        // Print sorted orders
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    // Bubble Sort Method
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort Method
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
}
