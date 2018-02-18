public class MainSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Book b1 = new Book("Alice in Wonderland", 6969, 12, 16);

    b1.borrowBook();

    b1.returnBook();

    System.out.println(b1.getStockAmount());

	}
	
}
