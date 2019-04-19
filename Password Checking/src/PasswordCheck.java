import java.util.Scanner;
public class PasswordCheck {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		String entPassword = input.nextLine();
		
		while(!Check(entPassword)) {
			
			entPassword = input.nextLine();
		}
		
		input.close();
	}
	
	public static boolean Check(String password) {
		
		String passwordCheck = "zain";
		
		if (!password.equals(passwordCheck)) {
			
			System.out.println("You have entered the wrong password" + ". Please enter password again");
			return false;
		}
		
		System.out.println("You have entered the right password");
		System.out.println("The secret message is hey");
		return true;
	}
}