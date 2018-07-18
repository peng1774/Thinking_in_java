interface Contents{
}

public class Parcel7{
	public Contents contents(){
		return new Contents(){
			private int i = 11;
			public int value(){ return i; }
		}; // this semicolon is required for anonymous inner class
	}
	
	public static void main(String[] args){
		Contents c = new Parcel7().contents();
	}
}