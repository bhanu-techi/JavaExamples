package javaexamples;

public class IntegerPalindrome {

	public static void main(String[] args) {
		System.out.println(chkPalindrome(12321));
	}

	public static boolean chkPalindrome(int num) {
		int reversed = 0;
		int temp = 0;
		int original = num;
		while (num != 0) {
			temp = num % 10;
			reversed = reversed * 10 + temp;

			num = num / 10;
		}
		System.out.println(original);
		System.out.println(reversed);
		if (original == reversed)
			return true;
		else
			return false;
	}
}
