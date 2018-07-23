import static java.lang.System.out;
import java.util.*;

class Gerbil{
	private int gerbilNum;
	public Gerbil(int gerbilNum){ this.gerbilNum = gerbilNum; }
	public void hop(){ out.println(gerbilNum); }
}

public class Exercise1{
	public static void main(String[] args){
		ArrayList<Gerbil> g = new ArrayList<Gerbil>();
		g.add(new Gerbil(1));
		g.add(new Gerbil(19));
		for(Gerbil i : g){
			i.hop();
		}
	}
}