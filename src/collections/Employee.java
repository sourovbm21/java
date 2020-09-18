package collections;

public class Employee {

	
	
	String name;
	int age;
	String dept;
	
	
	public Employee(String name,int age,String dept) {
		this.name=name;
		this.age=age;
		this.dept=dept;
		
		
	}

	String bookname,author;
	int quantity;
	
	public void Book(String bookname,String author,int quantity) {
		this.bookname=bookname;
		this.author=author;
		this.quantity=quantity;
	}
}
