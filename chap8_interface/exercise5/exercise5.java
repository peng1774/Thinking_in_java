package chap8_interface.exercise5;
import chap8_interface_addon.Instrument;
import static java.lang.System.out;

class Wind2 implements Instrument{
	 // void play(){ out.println("wind2 plays");} // invalid cuz interface all methods are public 
	 public void play(){ out.println("wind2 plays");}
	 public String what(){ 
		out.println("wind2 what");
		return "wind2 what";
	}
}

class Exercise5{
	public static void main(String[] args){
		new Wind2().play();
		new Wind2().what();
	}
}