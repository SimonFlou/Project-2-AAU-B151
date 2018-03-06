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
		} else {
			inStock = false;
		}
		
//		for (idCounter = 1; idCounter < totalAmount+1; idCounter++) {
//				books.add(idCounter, new Book(bookName, idCounter, modelId));
//			}
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
    
    public int getModelID() {
    	return modelId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getStockAmount() {
        return stockAmount;
    }
}
