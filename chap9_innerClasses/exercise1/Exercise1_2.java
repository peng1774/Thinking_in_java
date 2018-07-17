class Outer{
	class Inner{
		int i;
		public Inner(int i){this.i = i;}
	}
	
	public Inner getInner(){
		Inner In = new Inner(1);
		return In;
	}
}

public class Exercise1_2{
	public static void main(String[] args){
		Outer outer = new Outer();
		outer.getInner();
		Outer.Inner i = outer.getInner();
	}
}