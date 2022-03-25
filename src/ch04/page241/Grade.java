package ch04.page241;

public class Grade {
	int math;
	int science;
	int english;
	public Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	public double average() {
		double avg = (double)((math+science+english)/3.0);
		return avg;
	}
}
