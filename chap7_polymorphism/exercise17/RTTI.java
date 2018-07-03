class Useful{
	public void f(){}
	public void g(){}
}

class MoreUseful extends Useful{
	public void f(){}
	public void g(){}
	public void u(){}
	public void v(){}
}

public class RTTI{
	public static void main(String[] args){
		Useful[] x = {new Useful(), new MoreUseful()};
		x[0].f();
		x[1].g();
		((Useful)x[1]).f();
		//((MoreUseful)x[0]).f();  // invalid downcasting
	}
}