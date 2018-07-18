import static java.lang.System.out;

abstract class Base{
	public Base(int i){ out.println("nothing"); }
	public abstract void f();
}

class AnonymousConstructor{
	public static Base getBase(int i){
		return new Base(i){
			{ out.println("inside instance initializer"); }
			public void f(){
				out.println("in anonymous f()");
			}
		};
	}
	public void start(){
		Base base = getBase(24);
		base.f();
	}
}

public class Exercise12{
	public static void main(String[] args){
		new AnonymousConstructor().start();
	}
}