package ch05.page253;

public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudent();
		System.out.println("이름 : " + stu.name);
		System.out.println("나이 : " + stu.age);
		System.out.println("신장 : " + stu.height);
//		System.out.println("체중 : "+stu.setStudent());
		System.out.println("체중 : " + stu.getWeight());
		System.out.println();

		System.out.println(stu.toString());
	}
}
