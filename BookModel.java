import java.util.ArrayList;

public class BookModel {
	private int totalAmount = 0;
	private String bookName;
	private int modelId = 1;
	private boolean inStock = false;
	private int stockAmount = 0;
	ArrayList<Book> books = new ArrayList<Book>();
	
	BookModel(String bookName, int totalAmount, int stockAmount, int modelId) {
		this.bookName = bookName;
		this.totalAmount = totalAmount;
		this.modelId = modelId;
		this.stockAmount = stockAmount;
		
		if(stockAmount > 0) {
			inStock = true;
			inStock = false;
		}
		}
	
	public void addBook(String bookName, int modelId) {
		int size = books.size();
		System.out.println("Current size of Arraylist: " + size);
		if (size < totalAmount) {
			books.add(new Book(this.bookName, this.modelId));
			Book bookIndex = books.get(books.size()-1);
			System.out.println("Book " + bookIndex.getName() + " has been added at index " + (books.size()-1));
		} else {
			totalAmount++;
			stockAmount++;
			books.add(new Book(this.bookName, this.modelId));
			System.out.println("New books has been added \nNew total is: " + totalAmount);
//			System.out.println("You have to increase the total amount of this book to add more.\nThe current total is: " + totalAmount);
		}
	}
	
    public boolean bookInStock() {
        return inStock;
    }

    public void setTotalAmount(int num) {
        if(num >= 1) {
        this.totalAmount = num;
        System.out.println(bookName + " has its total amount set to " + totalAmount);
        }
    }
    
    public int getModelId() {
    	return modelId;
    }
    
    public String getBookName() {
    	return bookName;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getStockAmount() {
        return stockAmount;
    }
}
