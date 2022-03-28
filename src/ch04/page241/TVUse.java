package ch04.page241;

public class TVUse {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		// LG에서 만든 2017년형 32인치 TV
		System.out.println();

		TV yourTV = new TV("SAMSUNG", 2022, 82);
		yourTV.show();
		// SAMSUNG에서 만든 2022년형 82인치 TV
	}
}
