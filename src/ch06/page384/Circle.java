package ch06.page384;

import ch06.page350.Rect;

public class Circle {
	private int x, y, radius;

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

//	public boolean equals(Circle c) {
//		
//		if () {
//			return true;
//		} else {
//			return false;
//		}
//	}
	public boolean equals(Circle c) {
		int area=(int)(c.radius*c.radius*3.14);
		int area_self=(int)(this.radius*this.radius*3.14);
		if(area==area_self) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Circle("+x+","+y+")"+"반지름"+radius;
	}
}
