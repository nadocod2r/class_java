package ch04.page241;

public class TV {
	private String tv_name;
	private int year;
	private int inch;

	public TV(String tv_name, int year, int inch) {
		super();
		this.tv_name = tv_name;
		this.year = year;
		this.inch = inch;
	}

	public String getTv_name() {
		return tv_name;
	}

	public void setTv_name(String tv_name) {
		this.tv_name = tv_name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public void show() {
//		System.out.println(tv_name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
		System.out.println(this.tv_name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
