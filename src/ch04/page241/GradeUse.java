package ch04.page241;

import java.util.Scanner;

public class GradeUse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
//		System.out.printf("평균은 %.2f", me.average());

		sc.close();
	}
}
