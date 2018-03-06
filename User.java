import java.util.ArrayList;

public class User {
	static private int userIdStatic = 1;
	private int userId = 0;
	private String userName;
	private String userMail;
	private String userPassword;
	private ArrayList<Book> borrowBooks = new ArrayList<Book>();
	private boolean online = false;
	
	User(String userName, String userMail, String userPassword) {
		this.userName = userName;
		this.userMail = userMail;
		this.userPassword = userPassword;
		this.userId = userIdStatic;
		userIdStatic++;
	}
	
	public void login(String userName, String userPassword) {
		this.online = true;
	}
	
	public void logout() {
		this.online = false;
	}

	public void borrowBook(Book bookID) {
		
	}
	
	public void returnBook(int listIndex) {
		
	}
}
