import static java.lang.System.out;

interface Cycle{
	void ride();
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public void ride(){ out.println("unicycle rides"); }
}

class Bicycle implements Cycle{
	public void ride(){ out.println("Bicycle rides"); }
}

class Tricycle implements Cycle{
	public void ride(){ out.println("Tricycle rides"); }
}

// class ImpCycFactory implements CycleFactory{
	// public static Cycle getCycle(){ return new c; }
// }

class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){ return new Unicycle(); } 
}

class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){ return new Bicycle(); }
}

class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){ return new Tricycle(); }
}

//

class Exercise18_3{
	public static void play(CycleFactory c){ 
		Cycle s = c.getCycle();
		s.ride();
	}
	
	public static void main(String[] args){
		play(new TricycleFactory());
	}
}