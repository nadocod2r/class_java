package ch02;

import java.util.Scanner;

public class Ex110_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 두자리 입력 => ");
		int num = sc.nextInt();
		
//		while(true) {
//			int n;
//			System.out.println("실행 1번 // 종료 0번");
//			if() {
//				
//			}else {
//				
//			}
//		}
		
		if(num>=10 && num<100) {			
			if((num/10)==(num%10)) {
				System.out.println("10의 자리와 1의 자리가 같습니다.");
			}else {
				System.out.println("10의 자리와 1의 자리가 다릅니다.");
			}
		}else {
			System.out.println("다시 입력하세요.");
		}	
		
		sc.close();
	}
}
