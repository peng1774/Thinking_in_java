import static java.lang.System.out;

interface Intf{
	void play();
}

class Outter{
	public Intf getIntf(){
			class Inner implements Intf{
			public void play(){ out.println("inner play"); }
			public void take(){ out.println("inner take"); }
		}
		return new Inner();
	}
	
	public void start(){
		Intf intf = getIntf();
		intf.play();
	}
}

public class Exercise11{
	public static void main(String[] args){
		new Outter().start();
		//new Outter().take(); //can not do downcasting
	}
}