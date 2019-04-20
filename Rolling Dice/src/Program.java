public class Program {

	public static void main(String[]args) {
		
		Dice dice = new Dice(6);
		
		int counter = 0;
		
		while(counter<10) {
			
			System.out.print(dice.roll() + " "); 
			counter ++ ;
		}
	}
}