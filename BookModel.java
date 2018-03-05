
public class BookModel {
	private int totalAmount;
	private String bookName;
	private int modelId;
	
	BookModel(String bookName, int modelId, int totalAmount) {
		this.bookName = bookName;
		this.totalAmount = totalAmount;
		this.modelId = modelId;
	}
}
