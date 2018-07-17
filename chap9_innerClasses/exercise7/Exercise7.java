class Outter{
	private int i  = 0;
	private void getInt(){ System.out.println(i); };
	private void put(){ System.out.println("outter put"); }
	
	class Inner{
		// i = 1;
		// //System.out.println(i);
		// public int set(int i){ this.i = i+1; }
		void set(){
			i = 9;
			put();
		}
	}
	
	public void take(){
		Inner i = new Inner();
		i.set();
	}
}

public class Exercise7{
	public static void main(String[] args){
		Outter o = new Outter();
		
		o.take();
	}
}