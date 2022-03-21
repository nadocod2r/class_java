package helloworld_project;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름입력 => ");
		String name = scanner.next();
		String name2=scanner.nextLine();
		
		System.out.println("주소입력 => ");
		String addr = scanner.nextLine();
//		String addr2 = scanner.nextLine();
//		
//		String n1 = scanner.nextLine();
//		String n2 = scanner.nextLine();
		
		System.out.println("나이입력 => ");
		int age = scanner.nextInt();
		
		System.out.println("몸무게입력(실수) => ");
		double weight = scanner.nextDouble();
		
		System.out.println("이름 : "+name+
				"\n주소 : "+addr+
				"\n나이 : "+age+
				"\n몸무게 : "+weight);
		
//		System.out.println(name);
//		System.out.println(addr);
		scanner.close();
	}
}
