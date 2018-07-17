interface Destination{
}

public class Exercise9{
	public Destination destination(String s){
		class PDestination implements Destination{
			private String label;
			private PDestination(String label){ this.label = label; }
			public String readLabel(){ return this.label; }
		}
		return new PDestination(s);
	}
	public static void main(String[] args){
		Exercise9 e = new Exercise9();
		Destination d = e.destination("Tas");
	}
}
