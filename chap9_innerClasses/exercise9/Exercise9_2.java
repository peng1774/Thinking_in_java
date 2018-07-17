interface Intf{
	void play();
}

class Outter{
	private int i = 0;
	public void start(){
		class Inner implements Intf{
			public void play(){ System.out.println("inner play()"); }
		}
		Inner inn = new Inner();
		inn.play();
	}
}

public class Exercise9_2{
	public static void main(String[] args){
		new Outter().start();
	}
}