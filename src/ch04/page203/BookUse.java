package ch04.page203;

import java.util.Scanner;
import ch04.page202.*;

public class BookUse {
	public static void main(String[] args) {
		Book[] book=new Book[2];
		Circle[] c=new Circle[2];
		for(int i=0;i<c.length;i++) {
			c[i]=new Circle(i);
		}
		for(int i=0;i<c.length;i++) {
			System.out.print((int)(c[i].getArea())+"  ");
		}
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<book.length;i++) {
			System.out.print("제목 입력>>");
			String title=sc.nextLine();
			System.out.print("저자 입력>>");
			String author=sc.nextLine();
			book[i]=new Book(title, author);
		}
		
		for(int i=0;i<book.length;i++) {
			System.out.print("("+book[i].title+", "+book[i].author+")");
		}
		sc.close();
	}
}
