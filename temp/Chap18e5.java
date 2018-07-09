package temp;

import chap8_interface.exercis5;
import static java.lang.System.out;

class Windwind2 implements Instrument{
	public void play(){ out.println("Windwind2 plays"); }
	public String what(){ 
		out.println("Windwind2 waht"); 
		return "Windwind2 waht";
	}
}

class Chap18e5{
	public static void main(String[] args){
		Windwind2 w = new Windwind2();
		w.play();
		w.what();
	}
}