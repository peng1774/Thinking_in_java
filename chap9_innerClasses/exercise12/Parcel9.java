interface Destination{
}

public class Parcel9{
	public Destination destination(final String dest){
		return new Destination(){
			private String label = dest;
			public String readLabel(){ return label; }
		};
	}
	
	public static void main(String[] args){
		Destination d = new Parcel9().destination("yueyang");
	}
	
}