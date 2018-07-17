public class Exercise8{
	class Inner{
		private int i = 0;
	}
	
	public int getInt(){ 
		Inner inn = new Inner();
		return inn.i;
	}
}