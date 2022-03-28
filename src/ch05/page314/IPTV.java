package ch05.page314;

public class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int colors) {
		super(size, colors);
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 " + this.ip + " 주소의 ");
		System.out.print(getSize() + "인치 " + getColors() + "컬러");
	}
}
