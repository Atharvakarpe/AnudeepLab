package com.anudeep;

import java.util.*;
class Book{
	public void show() {
	ArrayList<String>books=new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	while(true) {
	System.out.println("Welcome to Librabry System");
	System.out.println("Enter 1 to See Books");
	System.out.println("Enter 2 to add Books");
	System.out.println("Enter 3 to delete Books");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:System.out.println(books);
	break;
	case 2:
		System.out.println("Enter the book numers u want to add");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.printf("Book=");
			books.add(sc.next());
		
		}
	break;
	case 3:
		System.out.println("Enter Book name to delete");
		books.remove(sc.next());
		break;
	default:System.out.println("Invalid choice");
	}
	


	}
	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.show();
		

	}

}
