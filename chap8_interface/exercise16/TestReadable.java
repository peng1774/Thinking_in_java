import java.nio.*;
import java.util.*;
import static java.lang.System.out;

public class TestReadable implements Readable{
	private int readCount = 1;
	private int loopCount = 1;
	public TestReadable(){}
	public int read(CharBuffer cb){
		if(loopCount == 1){out.println(" -- into readCount: " + readCount); readCount++; cb.append(" aa bb cc "); loopCount++; return 1;}
		if(loopCount == 2){out.println(" -- into readCount: " + readCount); readCount++; loopCount++; return 1;}
		if(loopCount == 3){out.println(" -- into readCount: " + readCount); readCount++; loopCount++; return 1;}
		if(loopCount == 4){out.println(" -- into readCount: " + readCount); readCount++; loopCount++; return 1;}
		if(loopCount == 5){out.println(" -- into readCount: " + readCount); readCount++; loopCount++; return 1;}
	
		if(loopCount == 6){out.println(" -- into readCount: " + readCount); readCount++; cb.append(" xx yy zz ");loopCount++; return 1;}
		if(loopCount == 7){out.println(" -- into readCount: " + readCount); readCount++; loopCount++; return 1;}
		if(loopCount == 8){out.println(" -- into readCount: " + readCount); readCount++; loopCount++; return 1;}
		if(loopCount == 9){out.println(" -- into readCount: " + readCount); readCount++; loopCount++; return 1;}
		if(loopCount == 10){out.println(" -- into readCount: " + readCount); readCount++; return -1;}
		return 1;
	}
	
	public static void main(String[] args){
		int a = 1;
		
		out.println("1");
		Scanner s = new Scanner(new TestReadable());
		out.println("2");
		
		while(s.hasNext()){
			out.println(" - into loopCount(represented by a): " + a);
			a ++;
			System.out.println(" ---- read from cb: " + s.next()); 
			
		}
	}
}


