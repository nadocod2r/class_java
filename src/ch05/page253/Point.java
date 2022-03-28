package ch05.page253;

public class Point {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
