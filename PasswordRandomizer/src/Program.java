public class Program {

	public static void main(String[]args) {
		
		PasswordRandomizer randomizer = new PasswordRandomizer(13);
		
		System.out.println("The password is " + randomizer.createPassword());
		System.out.println("The password is " + randomizer.createPassword());
		System.out.println("The password is " + randomizer.createPassword());
		System.out.println("The password is " + randomizer.createPassword());
	}
}
