package helloworld_project;

public class Helloworld {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println("\n\nHello World!\n\n");
		System.out.println(sum(10, 20));
		int a=100, b=200, c=123_456_789;
		int s1, s2;
		String str = "Hello World!";
		s1=sum(a, b);
		s2=sum(b, c);
		System.out.println(s1);
		System.out.println(String.format("%,d", s2));
		
		for(int i=0;i<10;i++) {
			System.out.println(String.format("%02d", i+1)+" " +str);
		}
		
		System.out.println("Hello World!  <=   added.");
	}
}
