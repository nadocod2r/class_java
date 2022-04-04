package ch06.page350;

public class EqualsEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(2,3);
		Rect c = new Rect(2,3);
		
		if(a.equals(b)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}
