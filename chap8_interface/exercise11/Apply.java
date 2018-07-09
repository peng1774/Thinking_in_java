public class Apply{
	public static void apply(Processor p, Object o){
		System.out.println("we are using processor: " + p.name());
		System.out.println(p.process(o));
	}
}