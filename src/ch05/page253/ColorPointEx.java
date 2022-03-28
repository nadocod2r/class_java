package ch05.page253;

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();

		// 다형성이 왜 안될까? => override를 해야한다. page280, page288참고
		// 즉 override를 하면 superclass객체이름으로 subclass의 method를 참조가능
//		Point p2=new ColorPoint();
//		p2.set(3, 4);
//		p2.setColor("red");
//		p2.showColorPoint();
		System.out.println(p.toString());
		System.out.println(cp.toString());
	}
}
