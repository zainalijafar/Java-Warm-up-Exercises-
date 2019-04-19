public class StringSearch {

	public static void main(String[]args) {
		
		String [] array = {"Zain","Mazin","Safder","Matt"};
		
		System.out.print(StringSearch(array,"hello"));
	}
	
	public static boolean StringSearch(String[]array, String target) {
		
		for (int i=0; i<array.length-1; i++) {
			
			if (array[i].equals(target)) {
				
				return true;	
			}
			
		} return false;
	}
}