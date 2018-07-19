interface Exercise201{
	void f();
	class InnerClass implements Exercise201{
		public void f(){ System.out.println("asd"); }
		
		// public static void main(String[] args){
			// new InnerClass().f();
		// }
	}
}

public class Exercise20{
	public static void main(String[] args){
		new Exercise201.InnerClass().f();
	}
}