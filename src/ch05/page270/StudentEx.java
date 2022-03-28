package ch05.page270;

public class StudentEx {
	public static void main(String[] args) {

		Person p;
		Student s = new Student("홍길동");
		p = s; //업캐스팅

		Person ps = new Student("John"); //업캐스팅 한줄표현

		System.out.println("Person : " + p.name);
		System.out.println("Student : " + s.name);
		System.out.println(ps.name);

		Person pp=new Student("Chance"); //업캐스팅
		Student ss;
		
		ss=(Student)pp; //다운캐스팅
		
		System.out.println(ss.name);
		ss.grade="A+";
	}
}
