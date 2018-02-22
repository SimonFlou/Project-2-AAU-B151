/**
 * Book
 */
import java.lang.System;

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

    public boolean bookInStock() {
        return inStock;
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

    public void returnBook() {
        stockAmount++;
        System.out.println("You have now returned the book: " + this.name + ".\nThe stock is now: " + stockAmount);
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