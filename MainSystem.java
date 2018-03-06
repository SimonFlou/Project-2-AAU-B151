public class MainSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookModel bm1 = new BookModel("Alice in Wonderland", 4, 4, 123);
		bm1.addBook(bm1.getBookName(), bm1.getModelId());
		bm1.addBook(bm1.getBookName(), bm1.getModelId());
		bm1.addBook(bm1.getBookName(), bm1.getModelId());
		bm1.addBook(bm1.getBookName(), bm1.getModelId());
		bm1.addBook(bm1.getBookName(), bm1.getModelId());
		
		BookModel bm2 = new BookModel("Peter Plys", 2, 0, 456);
		Book b3 = bm1.books.get(3);
		System.out.println(b3.getIDString());
	}
	
}
