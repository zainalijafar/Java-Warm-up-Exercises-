import java.util.*;
import java.util.Scanner;

public class ListOperations {

	public static void main(String[]args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		
		String input1 = input.nextLine();
		
		while(!input1.isEmpty()) {
			
			words.add(input1);
			input1 = input.nextLine();
		}
		
		for (String s : words) {
			
			System.out.println(s);
		}
	}
}