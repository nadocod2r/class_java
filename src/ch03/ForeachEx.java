package ch03;

public class ForeachEx {
	public static void main(String[] args) {
		int intArr[]= {10,30,15,20,100};
		String fruits[]= {"사과","배","딸기","바나나"};
		
		for(int i:intArr) {
			System.out.println(i);
		}
		for(String s:fruits) {
			System.out.print(s+" ");
		}
	}
}
