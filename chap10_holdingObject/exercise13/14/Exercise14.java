import java.util.*;

public class Exercise14{
	public static LinkedList<Integer> inserInMiddle(LinkedList<Integer> ints, int input){
		//ListIterator it = ints.listIterator();
		int length = ints.size();
		int mid = length / 2;
		
		if(length == 0){
			System.out.println("\n length = 0, length is : " + length);
			Collections.addAll(ints, input);
			System.out.println("this operation ints:");
			System.out.println(ints);
			return ints;
		}
		if(length == 1){
			System.out.println("\n length = 1, length is : " + length);
			Collections.addAll(ints, input);
			System.out.println("this operation ints:");
			System.out.println(ints);
			return ints;
		}
		
		
		
		LinkedList<Integer> ls = new LinkedList<Integer>();
		System.out.println("\nadd by half, length is : " + length);

		// add first half
		for(int i = 0; i < mid; i++){
			Collections.addAll(ls, ints.get(i));
			System.out.println(ls);
		}
		// add element
		System.out.println("first half finish.");
		
		Collections.addAll(ls, input);
		
		System.out.println(ls);
		System.out.println("start second half.");
		// add second half
		for(int i = mid; i < length; i++){
			Collections.addAll(ls, ints.get(i));
			System.out.println(ls);
		}
		
		System.out.println("FINISH. add by half, this operation ls:");
		System.out.println(ls);
		return ls;
	}
	public static void main(String[] args){
		LinkedList<Integer> ints = new LinkedList<Integer>();
		for(int i = 0; i < 10; i++){
			ints = inserInMiddle(ints, i);
		}
		System.out.println("after insertions, final result:");
		System.out.println(ints);
		System.out.println(3/2);
	}
}