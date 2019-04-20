import java.util.Scanner; 
public class Palindrome {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		
		System.out.println(Palindrome(input1));
	}
	
	public static boolean Palindrome(String text) {
		
		int i=0; 
		int j= text.length()-1;
		boolean check = true;
		
		while (i<j) {
			
			if (text.charAt(i)!=text.charAt(j)) {
				
				check = false;
			}
			
			i++;
			j--; 
		}
		
		return check;
	}
}