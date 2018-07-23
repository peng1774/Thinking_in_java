import static java.lang.System.out;
import java.util.*;

class Gerbil{
        private int gerbilNum;
        public Gerbil(int gerbilNum){ this.gerbilNum = gerbilNum; }
		public String toString(){
			return Integer.toString(gerbilNum);
		}
        
}

public class Exercise8{
		public static void hop(Iterator<Gerbil> it){
			//Iterator it = g.iterator();
			while(it.hasNext()){
				Gerbil gr = it.next();
				System.out.println(gr);
			}
		}
	
        public static void main(String[] args){
                ArrayList<Gerbil> g = new ArrayList<Gerbil>();
                g.add(new Gerbil(1));
                g.add(new Gerbil(19));
				Iterator it = g.iterator();
				hop(it);
                // for(Gerbil i : g){
                        // i.hop();
                // }
        }
}
