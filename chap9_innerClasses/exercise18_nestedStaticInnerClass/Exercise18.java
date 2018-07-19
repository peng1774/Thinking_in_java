class Outter{
	int i = 0;
	protected static class Inner{
		public static int a = 9;
		public static void play(){ System.out.println("protected static inner play()"); }
	}
	
	protected class NonStaticInner{
		//public static int a = 3; //'static' is only allowed in constant variable declarations
		public void play(){ System.out.println("protected NonStatic inner play()"); }
	}
	protected NonStaticInner getNonStaticInner(){
		return new NonStaticInner();
	}
}

public class Exercise18{
	public static void main(String[] args){
		Outter.Inner.play();
		int a = Outter.Inner.a;
		
		new Outter().getNonStaticInner().play();
	}
}