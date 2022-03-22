package ch03.ex;

import java.util.Scanner;

public class Ex165_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int intArr[]=new int[10];
		System.out.println("양의 정수 10개 입력 => ");
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=sc.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for(int j=0;j<intArr.length;j++) {
			if(intArr[j]%3==0) {
				System.out.print(intArr[j]+" ");
			}
		}		
		sc.close();		
	}
}
