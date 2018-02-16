/**
 * Book
 */
public class Book {

    private String name;
    private int id;
    private int stockAmount;
    private boolean inStock;
    private int totalAmount;

    Book(String name, int id, int stockAmount, int totalAmount) {
        this.name = name;
        this.id = id;
        this.stockAmount = stockAmount;
        this.totalAmount = totalAmount;
        
        if (stockAmount >= 1) {
            inStock = true;
        } else {
            inStock = false;
        }
    }

    public static boolean bookInStock(String name) {
        return inStock;
    }

    public static boolean bookInStock(int id) {
        return inStock;
    }

    public boolean bookInStock() {
        return = bookInStock(this.name);
    }

    public void setTotalAmount(int num) {
        if(num >= 1) {
        this.totalAmount = num;
        System.out.println(this.name + " has its total amount set to " + this.totalAmount);
        }
    }
    
}