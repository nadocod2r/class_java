package ch05.page321;

public class Rect implements Shape {
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "x" + height + "크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		double area = width * height;
		return area;
	}

}
