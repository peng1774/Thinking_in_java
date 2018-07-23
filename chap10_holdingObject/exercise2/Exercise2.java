import java.util.*;

public class Exercise2{
	public static void main(String[] args){
		Set<Integer> c =new HashSet<Integer>();
		for(int i = 0; i < 5; i++)
			c.add(i);
		for(int i = 1; i < 8; i++)
			c.add(i);
		for(int i : c)
			System.out.println(i);
	}
}