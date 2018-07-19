class Outter{
	int a = 0;
	protected static class Inner{
		static int b =2;
		protected static class Inner_level2{
			protected int c = 3;
			protected static void play(){
				System.out.println("Outter Inner Inner-level2 play()");
			}
		}	
	}		
}

public class Exercise19{
	public static void main(String[] args){
		Outter.Inner.Inner_level2.play();
		int a = Outter.Inner.b;
	}
}