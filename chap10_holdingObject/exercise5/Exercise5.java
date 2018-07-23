import java.util.*;
import static java.lang.System.out;

public class Exercise5{
	public static List<Integer> IntegerToList(int last){
		Random rand = new Random(47);
		List<Integer> intlist = new ArrayList<Integer>();
		for(int i = 0; i < last; i++)
			intlist.add(rand.nextInt(47));
		return intlist;
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		List<Integer> intList = IntegerToList(7);	//8 21 5 6 21 39 33
		out.println("1: " + intList);
		Integer h = 1;
		intList.add(h);
		out.println("2: " + intList);	//8 21 5 6 21 39 33 1
		out.println("3: " + intList.contains(h));	//true
		intList.remove(h);
		Integer p = intList.get(2);	
		out.println("4: " + p + " " + intList.indexOf(p));	//2
		Integer cymric = 2;
		out.println("5: " + intList.indexOf(cymric));	//-1
		out.println("6: " + intList.remove(cymric));	//false
		out.println("7: " + intList.remove(p));		//true
		out.println("8: " + intList);	//8 21 6 21 39 33 
		intList.add(3,3);
		out.println("9: " + intList);	//8 21 6 3 21 39 33 
		List<Integer> sub = intList.subList(1,4);
		out.println("sublist: " + sub);	//21 6 3// there is no 3
		out.println("10: " + intList.containsAll(sub));	// true
		Collections.sort(sub);
		out.println("sorted sublist: " + sub);	//3 6 21
		out.println("11: " + intList.containsAll(sub));	//true
		Collections.shuffle(sub,rand);	
		out.println("shuffled sublist: " + sub);	// 21 6 3 
		out.println("12: " + intList.containsAll(sub));	// true
		List<Integer> copy = new ArrayList<Integer>(intList);
		sub = Arrays.asList(intList.get(0), intList.get(5));
		out.println("sub: " + sub);	//21 21
		copy.retainAll(sub); 		
		out.println("13: copy.retainAll(sub) " + copy);	//21 21
		copy = new ArrayList<Integer>(intList);
		out.println("new copy is : " + copy);
		//copy.remove(2);
		copy.remove(0);
		out.println("copy.remove(1):");
		out.println("14: " + copy); //8 21 3 21 39 33 	// can we remove something not there
														// answer is it is valid. just doing nothing
		copy.removeAll(sub);
		out.println("copy.removeAll(sub)");
		out.println("copy.remove(1) : " + copy);
		out.println("15: " + copy);	//8 3 39 33 
		copy.set(1,5); // replace
		out.println("16: " + copy);	// 8 5 39 33 
		copy.addAll(2,sub);
		out.println("17: " + copy);	//8 5 21 21 39 33 
		out.println("18: " + intList.isEmpty());	// false
		intList.clear();
		out.println("19: " + intList);	// not null. but []
		out.println("19: " + intList.isEmpty());	//true
		intList.addAll(IntegerToList(4));
		out.println("21: " + intList); //8 21 5 6 
		Object[] o = intList.toArray();
		out.println("22: " + o[1]);	//21
		Integer[] pa = intList.toArray(new Integer[0]);
		out.println("23: " + pa[3]);	// not null, but 6
	}
}