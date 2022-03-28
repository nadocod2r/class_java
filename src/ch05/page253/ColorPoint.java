package ch05.page253;

public class ColorPoint extends Point {
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}

//	Point p=new Point();

	@Override
	public String toString() {
		return this.color + "(" + getX() + ", " + getY() + ")";
//		return color;
	}
}
