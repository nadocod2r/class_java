package ch05.page314;

public class IPTVUse {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
//		IPTV iptv2 = new IPTV("192.1.1.2", 50, 4096);
		
		ColorTV colortv = new IPTV("192.1.1.2", 50, 4096);
		TV tv = new IPTV("192.1.1.2", 50, 4096);
		//다형성 =>
		//자식클래스에서 오버라이딩하면 
		//부모클래스로 자식클래스를 참조가능
		
		iptv.printProperty();
		System.out.println();
		
//		iptv2.printProperty();
		colortv.printProperty();
//		tv.printProperty();
		System.out.println();
		System.out.println(tv.getSize());
		//TV클래스에 printProperty메쏘드가 없기때문에
		//존재하는 메쏘드 getSize만 접근가능하다.
		//자신의 변수라도 private면 접근불가능
	}
}
