public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The White Tiger", "Aravind Adiga"),
            new Book(2, "Midnight's Children", "Salman Rushdie"),
            new Book(3, "The God of Small Things", "Arundhati Roy"),
            new Book(4, "Train to Pakistan", "Khushwant Singh"),
            new Book(5, "Wings of Fire", "A.P.J. Abdul Kalam")
        };

        System.out.println("Linear Search for 'Wings of Fire':");
        Book foundLinear = BookSearch.linearSearch(books, "Wings of Fire");
        if (foundLinear != null) {
            System.out.println(foundLinear);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nBinary Search for 'Train to Pakistan':");
        Book foundBinary = BookSearch.binarySearch(books, "Train to Pakistan");
        if (foundBinary != null) {
            System.out.println(foundBinary);
        } else {
            System.out.println("Book not found.");
        }
    }
}