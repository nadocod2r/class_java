package ch05.page298;

public interface PhoneInterface {
	final int TIMEOUT = 10000;

	void sendCall();

	void receiveCall();

	default void printlLogo() {
		System.out.println("** Phone **");
	}
}
