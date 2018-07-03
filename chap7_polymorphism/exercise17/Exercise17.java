package chap7_polymorphism.exercise17;

class Cycle{
	public String toString(){
		return "Cycle";
	}
}

class Unicycle extends Cycle{
	public String toString(){
		return "Unicycle";
	}
	public void balance(){
		System.out.println("Unicycle do balance");
	}
}

class Bicycle extends Cycle{
	public String toString(){
		return "Bicycle";
	}
	public void balance(){
		System.out.println("Bicycle do balance");
	}
}

class Tricycle extends Cycle{
	public String toString(){
		return "Tricycle";
	}
}

public class Exercise17{
	public static void ride(Cycle c){
		System.out.println(c.toString());
	}
	
	public static void main(String[] args){
		// Unicycle u = new Unicycle();
		// Bicycle b = new Bicycle();
		// Tricycle t = new Tricycle();
		// ride(u);
		// ride(b);
		// ride(t);
		
		Cycle[] c = {new Unicycle(),new Bicycle(),new Tricycle()};
		System.out.println("Cycle array created");
		for(Cycle i : c){
			System.out.println(i.toString());
		}
		((Unicycle)c[0]).balance();
		((Bicycle)c[1]).balance();
		//((Tricycle)c[2]).balance();
		
	}
}