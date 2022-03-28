package ch05.page314;

public class ColorTV extends TV {
	private int colors;

	public ColorTV(int size, int colors) {
		super(size);
		this.colors = colors;
	}

	public int getColors() {
		return colors;
	}

	public void setColors(int colors) {
		this.colors = colors;
	}

	public void printProperty() {
		System.out.print(getSize() + "인치 " + this.colors + "컬러");
	}
}
