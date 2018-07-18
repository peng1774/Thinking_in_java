import static java.lang.System.out;

interface Cycle{
	void ride();
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public void ride(){ out.println("unicycle rides"); }
	public static CycleFactory factory = 
		new CycleFactory(){
			public Cycle getCycle(){ return new Unicycle(); }
		};
}

class Bicycle implements Cycle{
	public void ride(){ out.println("Bicycle rides"); }
	public static CycleFactory factory = 
		new CycleFactory(){
			public Cycle getCycle(){ return new Bicycle(); }
		};
}

class Tricycle implements Cycle{
	public void ride(){ out.println("Tricycle rides"); }
	public static CycleFactory factory = 
		new CycleFactory(){
			public Cycle getCycle(){ return new Tricycle(); }
		};
}


class Exercise16{
	// public static void play(Cycle c){ 
		// Cycle s = c.getCycle();
		// s.ride();
	// }
	public static void main(String[] args){
		// play(new TricycleFactory());
		Cycle b = Bicycle.factory.getCycle();
		b.ride();
	}
}