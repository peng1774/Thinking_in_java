interface Parent1{
	void a();
}

interface Parent2{
	void b();
 }

interface Parent3{
	void c();
}

interface ChildInterface extends Parent1, Parent2, Parent3{
	void d();
}

abstract class AbstractChildClass implements Parent1, Parent2{
	abstract public void a();
	public void b(){System.out.print("AbstractChildClass b");}
}

class ChildClass extends AbstractChildClass implements ChildInterface{
	public void a(){
		System.out.println("a");
	};
	public void b(){
		System.out.println("b");
	};
	public void c(){
		System.out.println("c");
	};
	public void d(){
		System.out.println("d");
	};
	public void e(){
		System.out.println("e");
	};
}
 
public class Exercise14{
	public static void main(String[] args){
		ChildClass c = new ChildClass();
		c.a();
		c.b();
		c.c();
		c.d();
		c.e();
	}
}
 
 