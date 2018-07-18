interface Intf{
	void play();
}

class Outter{
	private int i = 0;
	// public void start(){
		// class Inner implements Intf{
			// public void play(){ System.out.println("inner play()"); }
		// }
		// Inner inn = new Inner();
		// inn.play();
	// }
	
	public Intf intf(){
		return new Intf(){
			public void play(){ System.out.println("new Intf play()"); }
			public void take(){}
		};
	}
}

public class Exercise13{
	public static void main(String[] args){
		new Outter().intf().play();
		//new Outter().intf().take();//invalid, interface doesn't have take()
	}
}