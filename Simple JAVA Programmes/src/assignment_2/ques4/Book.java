package assignment_2.ques4;

public class Book {
	String name,author;
	double price;
	String[] javabooks={"Java in 30 days","Thinking in java"};
	String[] jspbooks={"Pro JSP","Learning JSP"};
	
	public Book(String name, double price, String author) {
		this.name=name;
		this.price=price;
		this.author=author;
	}
	
	void getDetails() {
		System.out.println("Name : "+this.name+"\nPrice : "+this.price+"\nAuthor : "+this.author);
	}
	
	void getAllBooks(String booktype) {
		if(booktype.equals("java")) {
			for(String book:javabooks) {
				System.out.println(book);
			}
		}else if(booktype.equals("jsp")) {
			for(String book:jspbooks) {
				System.out.println(book);
			}
		}else {
			System.out.println("Please enter java or jsp");
		}
	}
	
}