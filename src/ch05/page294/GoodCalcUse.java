package ch05.page294;

public class GoodCalcUse {
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] { 1, 2, 3, 4 }));
	}
}
