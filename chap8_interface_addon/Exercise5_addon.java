package chap8_interface_addon;
import static java.lang.System.out;


class Wind implements Instrument{
	 public void play(){ out.println("wind plays");}
	 public String what(){ 
		out.println("wind what");
		return "wind what";
	}
}

class Woodwind extends Wind{
	@Override
	 public void play(){ out.println("Woodwind plays");}
	 public String what(){ 
		out.println("Woodwind what");
		return "Woodwind what";
	}
}

class Exercise5_addon{
	public static void main(String[] args){
		Woodwind w = new Woodwind();
		w.play();
		w.what();
	}
}