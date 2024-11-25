package week2.day1;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println( "Books added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Books issued successfully");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library libObject=new Library();
		libObject.addBook("IKIGAI");
		libObject.issueBook();

	}

}
