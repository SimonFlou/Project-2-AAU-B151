/**
 * Book
 */
public class Book {

    private String name;
    private int id;
    private int stock;
    private boolean inStock;

    Book(String name, int id, int stock) {
        this.name = name;
        this.id = id;
        this.stock = stock;
        
        if (stock >= 1) {
            inStock = true;
        } else {
            inStock = false;
        }
    }

    public static bookInStock(String name) {
        return true;
    }

    public static boolean bookInStock(int id) {
        return true;
    }

    public bookInStock() {
        
    }

    
}