import static java.lang.System.out;

interface U{
	void A();
	void B();
	void C();
}

class A{
	//static U getU = new U(){
	U getU = new U(){
		public void A(){ out.println("A()"); };
		public void B(){ out.println("B()"); };
		public void C(){ out.println("C()"); };
	};
}

class B{
	U[] arrayU;
	int size;
	public B(int size){ 
		this.size = size;
		arrayU = new U[size]; 
	}
	
	public void add(U u, int pointer){
		if(pointer < size)
			arrayU[pointer] = u;
		else
			out.println("\npointer: " + pointer +" is out range\n");
	}
	
	public void setNull(int pointer){
		if(pointer < size)
			arrayU[pointer] = null;
		else
			out.println("\npointer: " + pointer +" is out range\n");
	}
	
	public void roll(){
		for(U u : arrayU)
			if( u != null ){
				u.A();
				u.B();
				u.C();
			} else {
				out.println("this U object is null");
			}
	}
}

public class Exercise23{
	public static void main(String[] args){
		B b = new B(5);
		A a = new A();
		b.roll();
		
		out.println("\nb.add(a.getU, 1);b.add(a.getU, 5);");
		b.add(a.getU, 1);
		b.add(a.getU, 5);
		b.roll();
		
		out.println("\nb.setNull(1);");
		b.setNull(1);
		b.roll();
	}
}

