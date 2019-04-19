public class ReverseString {

	public static void main(String[]args) {
		
		String name = "Zain";
		System.out.println(reverseString(name));
	}
	
	public static String reverseString(String name) {
		
		String reversedString = "";
		
		for (int i=name.length()-1; i>=0; i--) {
			
			char a = name.charAt(i);
			reversedString = reversedString + a;
		}
		
		return reversedString;
	}
}