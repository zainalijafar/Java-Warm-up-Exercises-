import java.util.Arrays; 

public class Sorting {

	public static void main(String[]args) {
		
		int [] values = {-3,10,15,20,99,1,4,7,8};
		Arrays.sort(values);
		
		//{1,3,5,32,33,54,57} (index==2, <7)
		
		for (int value : values) {
			
			System.out.println(value);
		}
		
		System.out.println("Smallest element is " +  smallest(values) + " at index " + indexOfSmallest(values));
		
		System.out.println("Smallest element is at index : " + indexSmallestFrom(values,4));
		
		int [] value = {3,2,5,4,8};
		
		System.out.println(Arrays.toString(value));
		swap(value,1,0);
		System.out.println(Arrays.toString(value));
		swap(value,0,3);
		System.out.println(Arrays.toString(value));
		
		selectionSort(value);
		System.out.println(Arrays.toString(value));
		
	}
	
	public static int smallest(int[]array) {
		
		int smallest = array[0];
		
		for (int i=1; i<array.length; i++) {
				
			if (array[i]<smallest) {
					
					smallest = array[i];
				}
		}
		return smallest;
	}
	
	public static int indexOfSmallest(int[]array) {
		
		int smallest = array[0];
		int index = 0;
		
		for (int i=1; i<array.length; i++) {
			
			if (array[i]<smallest) {
				
				smallest = array[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int indexSmallestFrom(int[]array, int index) {
		
		int smallest = array[index];
		int arrayIndex = 0;
		
		for (int i=0; i<array.length-index-1; i++) {
			
			if (array[index+i]<smallest) {
				
				smallest = array[index + i];
				arrayIndex = index + i ;
			}
		}
		return arrayIndex;
	}
	
	public static void swap(int[]array,int index1,int index2) {
		
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static void selectionSort(int[]array) {
		
		int min = 0;
		
		for (int i=0; i<array.length; i++) {
			
			min = i;
			for (int j = i + 1; j<array.length; j++) {
				
				if (array[j]<array[min]) {
					
					min = j;
				}
			}
			swap(array,i,min);
			System.out.print(Arrays.toString(array));
			System.out.println();
		}
	}
}