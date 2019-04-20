import java.util.ArrayList;

public class Program {

	public static void main(String[]args) {
		
		LotteryNumbers lotteryNumber = new LotteryNumbers();
		ArrayList<Integer> numbers = lotteryNumber.numbers();
		
		System.out.println("The numbers are : ");
		
		for (int no : numbers) {
			
			System.out.print(no+ " ");
		}
		
		System.out.println();
	}
}