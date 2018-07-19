interface Contents{
}

interface Destination{
}

public class Parcel11{
	private static class ParcelContents implements Contents{
		private int i = 11;
		public int value(){ return i; }
	}
	protected class ParcelDestination implements Destination{
		private String label;
		private ParcelDestination(String whereTo){
			label = whereTo;
		}
		public String readlabel(){ return label; }
		// nested class can contain other static elements;
		// public static void f(){}
		// static int x = 10;
		// static class AnotherLebel{
			// public static void f(){}
		// }
	}
	public Destination destination(String s){
		return new ParcelDestination(s);
	}
	public static Contents contents(){
		return new ParcelContents();
	}
	public static void main(String[] args){
		//static method
		Contents c = contents();
		//non-static method
		Destination d = new Parcel11().destination("Tas");
	}
}