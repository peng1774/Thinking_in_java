interface Service{
	void method1();
}

interface ServiceFactoryInterface{
	Service getService();
}

//
class ImpService1 implements Service{
	//ImpSerive(){} // package access
	public void method1(){System.out.println("imp service 1 method");};
}

class ImpFactory1 implements ServiceFactoryInterface{
	public Service getService(){
		return new ImpService1();
	}
}

//
class ImpService2 implements Service{
	//ImpService2(){} //package access
	public void method1(){System.out.println("imp service 2 method");};
}

class ImpFactory2 implements ServiceFactoryInterface{
	public Service getService(){
		return new ImpService2();
	}
}

//

class Factories{
	public static void serviceConsumer(ServiceFactoryInterface fact){
		Service s = fact.getService();
		s.method1();
	}
	public void start(){
		serviceConsumer(new ImpFactory1());
		serviceConsumer(new ImpFactory2());
	}
}

public class Exercise18{
	public static void main(String[] args){
		new Factories().start();
	}
}