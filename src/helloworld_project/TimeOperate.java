package helloworld_project;

import java.util.Scanner;

public class TimeOperate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간(second)을 입력하세요 => ");
		int time = sc.nextInt();
		
		int second = time % 60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간 / ");
		System.out.print(minute + "분 / ");
		System.out.print(second + "초입니다.");		
		
		sc.close();
	}
}
