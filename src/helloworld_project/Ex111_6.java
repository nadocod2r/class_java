package helloworld_project;

import java.util.Scanner;

public class Ex111_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 => ");
		int num = sc.nextInt();
		int a=num/10;	//10의 자리
		int b=num%10;	//1의 자리
		
		if(num>=1 && num<=99) {
			if((a%3==0)&&(b%3==0)&&(a!=0)&&(b!=0)) {
				System.out.println("박수짝짝");
			}else if(((a!=0)&&(a==0))||((b!=0)&&(b%3==0))) {
				System.out.println("박수짝");
			}else {
				System.out.println("박수없음");
			}
		}else {
			System.out.println("다시 입력하세요.");
		}
	}
}
