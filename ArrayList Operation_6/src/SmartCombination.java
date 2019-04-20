import java.util.*;
public class SmartCombination {

	public static void main(String[]args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		System.out.println("The first list is : " + populate1(list1));
		System.out.println("The second list is : " + populate2(list2));
		
		System.out.println(combineSmart(list1,list2));
	}
	
	public static ArrayList<Integer> populate1(ArrayList<Integer>list1){
		
		for (int i=14; i<18; i++) {
			
			list1.add(i);
		}
		
		return list1;
	}
	
	public static ArrayList<Integer> populate2(ArrayList<Integer>list2){
		
		for (int j=0; j<14; j++) {
			
			list2.add(j);
		}
		
		return list2;
	}
	
	public static ArrayList<Integer> combineSmart(ArrayList<Integer>list1, ArrayList<Integer>list2){
		
		int counter =0; 
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		while (counter<list1.size()) {
			
			if (!list2.contains(list1.get(counter))){
				
				list2.add(list1.get(counter));
			}
			
			counter ++;
		}
		
		return list2;
	}
}