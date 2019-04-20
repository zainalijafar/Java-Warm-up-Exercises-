import java.util.*;
import java.util.Scanner;

public class MoreThanOnce {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(10);
		
		System.out.println("Type a number : ");
		int number = Integer.parseInt(input.nextLine());
		
		if(morethanOnce(list,number)) {
			
			System.out.println("The number appears more than once");
			
		}else {
			
			System.out.println("The number does not appear more than once");
		}
	}
	
	public static boolean morethanOnce(ArrayList<Integer> list, int number) {
		
		int counter = 0;
		boolean equals = false;
		
		for (int i=0; i<list.size(); i++) {
				
				if (list.get(i).equals(number)) {
					
					counter++;
				}
		}
		if (counter>1) {
			
			equals = true;
		}
		System.out.println(counter);
		
		return equals;
	}
}