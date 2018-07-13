// Exercise 16: (3) Create a class that produces a sequence of chars. 
// Adapt this class so that it can be an input to a Scanner object.

import java.util.*;
import java.nio.*;

class CharGenerator implements Readable{
	private int count;
	private char[] charList = {'a', 'b', 'c'};
	public CharGenerator(int count){ this.count = count; }
	public int read(CharBuffer cb){
		if(count-- == 0) 
			return -1;
		for(char c : charList){
			cb.append(c + " | ");
			
		}
		cb.append(" / ");
		return 1;
		// cb.append(charList[1]);
		// cb.append('p');
		
	}
}

public class Exercise16_2{
	public static void main(String[] args){
		CharGenerator c = new CharGenerator(5);
		Scanner s = new Scanner(c);
		while(s.hasNext())
			System.out.println(s.next());
	}
}