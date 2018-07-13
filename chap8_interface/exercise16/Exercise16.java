import java.nio.*;
import java.util.*;

class RandomWords implements Readable{
	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFG".toCharArray();
	private static final char[] lowers = "abcdefg".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	
	private int count;
	public RandomWords(){}
	public RandomWords(int count){ this.count = count; }
	public int read(CharBuffer cb){
		if(count-- == 0)
			return -1; // indicates end of input
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i = 0; i < 4; i++){
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	
	public static void start(){
		Scanner s = new Scanner(new RandomWords(2));
		while(s.hasNext())
			System.out.println(s.next());
	}
}

public class Exercise16{
	public static void main(String[] args){
		new RandomWords().start();
	}
}