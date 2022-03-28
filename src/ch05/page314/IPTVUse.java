package ch05.page314;

public class IPTVUse {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
//		IPTV iptv2 = new IPTV("192.1.1.2", 50, 4096);
		
		ColorTV colortv = new IPTV("192.1.1.2", 50, 4096);
		//다형성 =>
		//자식클래스에서 오버라이딩하면 
		//부모클래스로 자식클래스를 참조가능
		
		iptv.printProperty();
		System.out.println();
		
//		iptv2.printProperty();
		colortv.printProperty();
	}
}
