import java.util.*;
import static java.lang.System.out;

public class LinkedListFeatures{
	public static void main(String[] args){
		LinkedList<String> str = new LinkedList<String>("asd", "ssdf", " werdsf");
		out.println(str);
		out.println(".getFitst(): " + str.getFirst());
		out.println(".element(): " + str.element());
		out.println(".peek(): " + str.peek());
		out.println(".remove(): " + str.remove());
		out.println(".removeFirst(): " + str.removeFirst());
		out.println(".poll(): " + str.poll());
		
		out.println(str);
		str.addFirst("kjn");
		out.println(".addFrist(): " + str);
		str.offer("qwe");
		out.println(".offer(): " + str);
		str.add("kjn");
		out.println(".add(): " + str);
		str.addLast("12edf");
		out.println(".addLast(): " + str);
		
		out.println(".removeLast(): " + str.removeLast());
		
		
	}
}