package day01;

public class Base {
	private void test() {
		String aStr = "?One?";
		String bStr = aStr;
		aStr.toUpperCase();
		aStr.trim();
		System.out.println("[" + aStr + "," + bStr + "]");
	}
	public static void main(String[] a) {
		new Base().test();
	}


}
