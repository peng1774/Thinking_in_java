import static java.lang.System.out;

interface Slayer{
	void set();
}

class Mage{
	private int i;
	private void put(){ out.println("mage put()"); }
	public Slayer slayer(){
		return new Slayer(){
			public void set(){
				out.println(i);
				i =  5;
				out.println(i);
				put();
			}
		};
	}
}

public class Exercise12_2{
	public static void main(String[] args){
		Mage m = new Mage();
		m.slayer().set();
	}
}