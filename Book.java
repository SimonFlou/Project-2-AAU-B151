/**
 * Book
 */
public class Book {

    private String name;
    private int id;
    private int stockAmount;
    private boolean inStock;
    private int totalAmount;

    Book(String _name, int _id, int _stockAmount, int _totalAmount) {
        name = _name;
        id = _id;
        stockAmount = _stockAmount;
        totalAmount = _totalAmount;

        if (stockAmount >= 1) {
            inStock = true;
        } else {
            inStock = false;
        }
    }

    public boolean bookInStock(String name) {
        return inStock;
    }

    public boolean bookInStock(int id) {
        return inStock;
    }

    public boolean bookInStock() {
        return bookInStock(name);
    }

    public void setTotalAmount(int num) {
        if(num >= 1) {
        this.totalAmount = num;
        System.out.println(name + " has its total amount set to " + totalAmount);
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
        System.out.println("You have now borrowed the book: " + name + ".\nThe stock is now: " + stockAmount);
        checkStock();
    }

    public void returnBook() {
        stockAmount++;
        System.out.println("You have now returned the book: " + name + ".\nThe stock is now: " + stockAmount);
        checkStock();
    }

    private void checkStock() {
        if (this.stockAmount <= 0) {
            inStock = false;
        } else if (this.stockAmount >= 1) {
            inStock = true;
        }
    }

}
