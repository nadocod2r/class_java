package ch04.page246;

import java.util.Scanner;

public class CalcUse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 num1 입력 => ");
		int num1=sc.nextInt();
		System.out.println("정수 num2 입력 => ");
		int num2=sc.nextInt();
		System.out.println("연산자(1.+, 2.-, 3.*, 4./) 입력 => ");
//		int op=sc.nextInt();
		char op=sc.next().charAt(0);
		
//		Add add=new Add();
//		System.out.println("두수의 합 : "+add.calculate(num1, num2));
//		Sub sub=new Sub();
//		System.out.println("두수의 차 : "+sub.calculate(num1, num2));
//		Mul mul=new Mul();
//		System.out.println("두수의 곱 : "+mul.calculate(num1, num2));
//		Div div=new Div();
//		System.out.println("두수 나눗셈 : "+div.calculate(num1, num2));
		
		if(op=='+') {
			Add add=new Add();
			System.out.println("두수의 합 : "+add.calculate(num1, num2));
		}else if(op=='-') {
			Sub sub=new Sub();
			System.out.println("두수의 차 : "+sub.calculate(num1, num2));
		}else if(op=='*') {
			Mul mul=new Mul();
			System.out.println("두수의 곱 : "+mul.calculate(num1, num2));
		}else if(op=='/') {
			Div div=new Div();
			System.out.println("두수 나눗셈 : "+div.calculate(num1, num2));
		}else {
			System.out.println("연산자 다시 입력하세요.");
		}
		
		
//		if(op==1) {
//			Add add=new Add();
//			System.out.println("두수의 합 : "+add.calculate(num1, num2));
//		}else if(op==2) {
//			Sub sub=new Sub();
//			System.out.println("두수의 차 : "+sub.calculate(num1, num2));
//		}else if(op==3) {
//			Mul mul=new Mul();
//			System.out.println("두수의 곱 : "+mul.calculate(num1, num2));
//		}else if(op==4) {
//			Div div=new Div();
//			System.out.println("두수 나눗셈 : "+div.calculate(num1, num2));
//		}else {
//			System.out.println("연산자 다시 입력하세요.");
//		}
		
		sc.close();
	}
}
