import static java.lang.System.out;

interface Service{
	void method1();
	void method2();
}

interface ServiceFactory{
	Service getService();
}

class Imp1 implements Service{
	private Imp1(){}
	public void method1(){ out.println("imp1 method1"); }
	public void method2(){ out.println("imp1 method2"); }
	
	public static ServiceFactory factory = 
		new ServiceFactory(){
			public Service getService(){
				return new Imp1();
			}
		};
}

class Imp2 implements Service{
	private Imp2(){}
	public void method1(){ out.println("imp2 method1"); }
	public void method2(){ out.println("imp2 method2"); }
	public static ServiceFactory factory = new ServiceFactory(){
			public Service getService(){
				return new Imp2();
			}
		};
}

public class Factories{
	public static void serviceConsumer(ServiceFactory fact){
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args){
		// serviceConsumer(Imp1.factory);
		// serviceConsumer(Imp2.factory);
		Service imp1 = Imp1.factory.getService();
		
	}	
}