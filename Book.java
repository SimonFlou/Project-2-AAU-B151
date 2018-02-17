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

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void borrowBook() {
        stockAmount--;
        System.out.println("You have now borrowed the book: " + this.name + ".\nThe stock is now: " + stockAmount);
        checkStock();
    }

    public returnBook() {
        stockAmount++;
        System.out.println("You have now returned the book: " + this.name + ".\nThe stock is now: " + stockAmount);
        checkStock();
    }

    private checkStock() {
        if (this.stockAmount <= 0) {
            inStock = false;
        } else if (this.stockAmount >= 1) {
            inStock = true;
        }
    }

    Book b1 = new Book("Alice in Wonderland", 6969, 12, 16);
    
    b1.borrowBook();
    b1.returnBook();
    System.out.println(getStockAmount);
    
}