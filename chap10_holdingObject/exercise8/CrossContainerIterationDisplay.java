import java.util.*;

public class CrossContainerIterationDisplay{
	public static void display(Iterator<String> it){
		while(it.hasNext()){
			String p = it.next();
			System.out.println(p);
		}
	}
	
	public static void main(String[] args){
		ArrayList<String> str = new ArrayList<String>();
		Collections.addAll(str, "abc", "bcd", "qwe");
		LinkedList<String> strl = new LinkedList<String>(str);
		HashSet<String> strh = new HashSet<String>(str);
		TreeSet<String> strt = new TreeSet<String>(str);
		
		display(str.iterator());
		System.out.println();
		
		display(strl.iterator());
		System.out.println();
		
		display(strh.iterator());
		System.out.println();
		
		display(strt.iterator());
		
		
	}
}