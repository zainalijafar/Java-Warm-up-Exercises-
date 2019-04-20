import java.util.Random;
public class PasswordRandomizer {

	private int length;
	private Random random;
	
	public PasswordRandomizer(int length) {
		
		this.length = length;
		random = new Random();
	}
	
	public String createPassword() {
		
		String password = "abcdefghijklmnopqrstuvwxyz1234567890";
		String newPassword = "";
		
		for (int i=0; i<this.length; i++) {
			
			int number = random.nextInt(password.length());
			newPassword = newPassword + password.charAt(number);
		}
		
		return newPassword;
	}
}
