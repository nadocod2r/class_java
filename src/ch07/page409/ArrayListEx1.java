package ch07.page409;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	public static void printLine(int n) {		
		for(int i=0;i<n;i++) {
			System.out.print("=");			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		
		String str1="Korea";
		String str2="Japan";
		String str3="France";
		String str4="USA";
		
		str.add(str1);
		str.add(str2);
		str.add(str3);
		str.add(str4);
		
//		String str0=str.get(0);
//		System.out.println(str0);
		for(int i=0;i<str.size();i++) {
			System.out.println(str.get(i));
		}
		
		printLine(50);
		
		Iterator<String> it=str.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
