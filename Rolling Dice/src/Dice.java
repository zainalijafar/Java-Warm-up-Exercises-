import java.util.Random;
public class Dice {
		
	private Random random;
	private int numberOfSides;
	
	public Dice(int numberOfSides) {
		
		this.numberOfSides = numberOfSides;
		random = new Random();
	}
	
	public int roll() {
		
		int number = random.nextInt(numberOfSides + 1);
		return number;
	}
		
}