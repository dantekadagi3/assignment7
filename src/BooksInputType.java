import java.util.Scanner;

import java.util.Scanner;

public class BooksInputType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Books myTitle=new Books();
		Books myWriter=new Books();
		Books myPages=new Books();
		System.out.println("Please enter the title of the book");
		Scanner name=new Scanner(System.in);
		myTitle.title=name.next();
		System.out.println("Please enter the author name");
		Scanner auth=new Scanner(System.in);
		myWriter.author=auth.next();
		System.out.println("Please enter the number of pages");
		Scanner pages=new Scanner(System.in);
		myPages.numberOfPages=pages.nextInt();
		
		System.out.println("The book title is:"+myTitle.title);
		System.out.println("The book author is:"+myWriter.author);
		System.out.println("The book has"+myPages.numberOfPages +"pages");
	

	}

}
