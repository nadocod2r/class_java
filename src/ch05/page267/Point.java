package ch05.page267;

public class Point {
	private int x, y;

	public Point() {
		System.out.println("기본생성자");
		this.x = this.y = 0;
	}

	public Point(int x, int y) {
		System.out.println("인수있는 생성자");
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
