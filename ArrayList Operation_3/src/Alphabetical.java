import java.util.*;
import java.util.Scanner;

public class Alphabetical {

	public static void main(String[]args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		
		while(!input1.equals("")) {
			
			words.add(input1);
			input1 = input.nextLine();
		}
		
		for (int i=0; i<words.size(); i++) {
			
			for (int j=i+1; j<words.size(); j++) {
				
				if (words.get(i).compareTo(words.get(j))>0) {
					
					Collections.swap(words,i,j);
				}
			}
		}
		
		for (String s: words) {
			
			System.out.println(s);
		}
	}
}