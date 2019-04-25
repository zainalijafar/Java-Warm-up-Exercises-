import java.util.*;

public class HashMapOperation {

	public static void main(String[]args) {
		
		HashMap<String,String> numbers = new HashMap<String,String>();
		numbers.put("One", "Zain");
		numbers.put("Two","Safder");
		
		System.out.println(numbers.get("One"));
		System.out.println(numbers.get("Two"));
		
		System.out.println(numbers.get("Three"));
	}
}