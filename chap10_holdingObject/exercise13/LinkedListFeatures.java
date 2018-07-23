import java.util.*;
import static java.lang.System.out;

public class LinkedListFeatures{
	public static void main(String[] args){
		List<String> s = new ArrayList<String>();
		Collections.addAll(s, "asd", "ssdf", "werdsf", "23s");
		//LinkedList<String> str = new LinkedList<String>(("asd"), ("ssdf"), ("werdsf"));
		LinkedList<String> str = new LinkedList<String>(s);
		out.println(str);
		out.println("str.get(1): " + str.get(1));
		out.println(".getFitst(): " + str.getFirst());
		out.println(".element(): " + str.element());
		out.println(".peek(): " + str.peek());
		
		out.println("\n.remove(): " + str.remove());
		out.println(str);
		out.println("\n.removeFirst(): " + str.removeFirst());
		out.println(str);
		out.println("\n.poll(): " + str.poll());
		out.println(str);
		
		str.addFirst("kjn");
		out.println("\n.addFrist(): " + str);
		str.offer("qwe");
		out.println(".offer(): " + str);
		str.add("kjfgn");
		out.println(".add(): " + str);
		str.addLast("12edf");
		out.println(".addLast(): " + str);
		
		out.println(".removeLast(): " + str.removeLast());
		out.println(str);
		
		
	}
}