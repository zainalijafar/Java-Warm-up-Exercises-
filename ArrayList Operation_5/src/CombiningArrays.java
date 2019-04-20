import java.util.Scanner;
import java.util.*; 

public class CombiningArrays {

	public static void main(String[]args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for (int i=0; i<5; i++) {
			
			list1.add(i);
		}
		
		for (int j=0; j<5; j++) {
			
			list2.add(j);
		}
		
		combine(list1,list2);
		
		for (int s: list1) {
			
			System.out.print(s + " ");
		}
	}
	
	public static void combine(ArrayList<Integer>list1, ArrayList<Integer>list2) {
		
		list1.addAll(list2);
	}
}