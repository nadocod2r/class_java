package ch04.page202;

public class CircleUse {
	public static void main(String[] args) {
		Circle[] c=new Circle[5];
		
		for(int i=0;i<c.length;i++) {
			c[i]=new Circle(i);
		}
		for(int i=0;i<c.length;i++) {
			System.out.print((int)(c[i].getArea())+" ");
		}
	}
}
