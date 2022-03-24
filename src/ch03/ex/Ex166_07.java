package ch03.ex;

public class Ex166_07 {
	public static void main(String[] args) {
		
		int intArr[]=new int[10];		
		int sum=0;
		double avg=0;
		
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=(int)(Math.random()*10+1);
			sum+=intArr[i];
		}
		
		avg=(double)sum/intArr.length;
		
		System.out.print("램덤한 정수들 : ");
		for(int j=0;j<intArr.length;j++) {
			System.out.print(intArr[j]+" ");
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);		
		System.out.println("평균 : " + String.format("%.2f", avg));	
		System.out.println("added!!!");
		System.out.println("added!!!!");
	}
}
