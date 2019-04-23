import java.util.Arrays;

public class Main {

	public static void main(String[]args) {
		
		int [] array = {5,1,3,4,2};
		System.out.println(sum(array));
		
		int [] original = {1,2,3,4};
		int [] copy = copy(original);
		
		copy[0] = 99;
 		
		int [] reverse = reverseArray(original);
		
		System.out.println("Original : " + Arrays.toString(original));
		System.out.println("Copied : " + Arrays.toString(copy));
		
		System.out.println("Reverse : " + Arrays.toString(reverse));
	}
	
	public static int sum(int[]array) {
		
		int sum = 0;
		
		for (int i=0; i<array.length; i++) {
			
			sum = sum + array[i];
		}
		
		return sum;
	}
	
	public static int[] copy(int[]array) {
		
		int [] newArray = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static int[] reverseArray(int[]array) {
		
		int [] reversedArray = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			
			reversedArray[i] = array[array.length-1-i];
		}
		
		return reversedArray;
	}
}
