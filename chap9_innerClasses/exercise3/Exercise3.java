class Outer{
	private String s;
	public Outer(String s){ this.s = s; }
	
	class Inner{
		int i;
		public Inner(int i){this.i = i;}
		public String toString(){ return s; }
	}
	
	public Inner getInner(){
		Inner In = new Inner(1);
		return In;
	}
}

public class Exercise3{
	public static void main(String[] args){
		Outer outer = new Outer("abc");
		// outer.getInner();
		// Outer.Inner i = outer.getInner();
		String s = outer.getInner().toString();
		System.out.println(s);
	}
}