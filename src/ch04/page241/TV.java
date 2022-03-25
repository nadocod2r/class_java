package ch04.page241;

public class TV {
	String name;
	String year;
	String size;
	
	public TV(String name, String year, String size) {
		this.name=name;
		this.year=year;
		this.size=size;
	}
	public void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+size+"인치 TV");
	}
}
