public class Book {

    private String name;
    private String idString;
    private int id;
    static private int pieceId;

    Book(String _name, int _id) {
        name = _name;
        id = _id;
        idString = id + "-" + pieceId;
        pieceId++;
    }

    public String getName() {
    	return name;
    }
    
    public String getIDString() {
    	return idString;
    }
//    public void borrowBook() {
//        stockAmount--;
//        System.out.println("You have now borrowed the book: " + name + " id: " + id + ".\nThe stock is now: " + stockAmount);
//        checkStock();
//    }
//
//    public void returnBook() {
//        stockAmount++;
//        System.out.println("You have now returned the book: " + name + " id: " + id + ".\nThe stock is now: " + stockAmount);
//        checkStock();
//    }
//
//    private void checkStock() {
//        if (this.stockAmount <= 0) {
//            inStock = false;
//        } else if (this.stockAmount >= 1) {
//            inStock = true;
//        }
//    }
}
