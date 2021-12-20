package javaexamples;

public class StaticBlockTest {
	static {
		System.out.println("Ststic Block 1");
	}
	
	public static final int x =20;
	public static void main(String[] args) {
		System.out.println(x);
	}

}
