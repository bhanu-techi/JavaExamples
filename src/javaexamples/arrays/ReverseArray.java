package javaexamples.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int[] result = reverseAnArray(intArray);
		int[] result2 = reverseArrayUsingSameArray(intArray);
		System.out.println("Reversed from first method : ");
		for (int i = 0; i <= result.length - 1; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println("Reversed from first method : ");
		for (int i = 0; i <= result.length - 1; i++) {
			System.out.print(result2[i] + ",");
		}
	}

	public static int[] reverseAnArray(int[] numbers) {
		int[] reversed = new int[numbers.length];
		int length = numbers.length - 1;
		int j = 0;
		for (int i = length; i >= 0; i--) {
			reversed[j] = numbers[i];
			j++;
		}
		return reversed;
	}
	
	public static int[] reverseArrayUsingSameArray(int[] numbersArray) {
		int end = numbersArray.length-1;
		int start = 0;
		int temp;
		while(start < end) {
			temp = numbersArray[start];
			numbersArray[start] = numbersArray[end];
			numbersArray[end] = temp;
			start++;
			end--;
		}
	return numbersArray;
	}
}
