package ch06.page350;

public class Rect {
	private int width, height;
	
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public boolean equals(Rect rec) {
		int area=rec.height*rec.width;
		int area_self=this.width*this.height;
		if(area==area_self) {
			return true;
		}else {
			return false;
		}
	}
}
