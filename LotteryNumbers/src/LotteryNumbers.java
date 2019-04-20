import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public class LotteryNumbers {

	private ArrayList<Integer>numbers; 
	private Random random = new Random();
	
	public LotteryNumbers() {
		
		this.numbers = new ArrayList<Integer>();
		this.drawNumbers();
		
	}
	
	public ArrayList<Integer>numbers() {
		
		return this.numbers;
	}
	
	public void drawNumbers() {
		
		for (int i=0; i<7; i++) {
			
			int number = random.nextInt(39);
			
			if (!containsNumber(number)) {
				
				this.numbers.add(number);
			}
		}
	}
	
	public boolean containsNumber(int number) {
		
		boolean contains = false;
		
		if (this.numbers.contains(number)) {
			
			contains = true;
		}
		return contains;
	}
}