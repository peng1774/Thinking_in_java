import java.util.*;

public class AddingGroups{
	public static void main(String[] args){
		Collection<Integer> col = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		Integer[] moreInts = {3,4,5,6};
		col.addAll(Arrays.asList(moreInts));
		//runs significantly faster but you can't construct a Collection this way:
		Collections.addAll(col, 11, 12, 13);
		Collections.addAll(col, moreInts);
		//so easy way is to create Collection with no elements, then call Collections.addAll()
		// // Collection<Integer> col = new ArrayList<Integer>
		// // col.addAll(moreInts);
		List<Integer> list = Arrays.asList(16,17,18);
		list.set(1,99);
		//list.add(21); // runtime eoor cuz underlying array cannot be resized.
	}
}