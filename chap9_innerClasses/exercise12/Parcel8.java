class Wrapping{
	public Wrapping(int x){};
	public int value(){return 1;}
}

public class Parcel8{
	public Wrapping wrapping(int x){
		return new Wrapping(x){
			public int value(){
				return super.value()*47;
			}
		};
	}
	public static void main(String[] args){
		Wrapping w = new Parcel8().wrapping(1);
	}
}