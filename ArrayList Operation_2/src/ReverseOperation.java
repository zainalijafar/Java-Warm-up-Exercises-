import java.util.Scanner;
import java.util.*;

public class ReverseOperation {

	public static void main(String[]args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		
		while(!input1.equals("")) {
			
			words.add(input1);
			input1 = input.nextLine();
		}
		
		for (int i=words.size()-1; i>=0; i--) {
			
			System.out.println(words.get(i));
		}
	}
}