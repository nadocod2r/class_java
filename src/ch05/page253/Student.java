package ch05.page253;

public class Student extends Person {
	public void setStudent() {
		age = 30;
		name = "John";
		height = 170;
//		weight = 80; 
		//슈퍼클래스에서 private 선언되어 있어 접근 불가능
		
		Person p = new Person();
		p.age = 30;
		p.setWeight(80);
	}
}
