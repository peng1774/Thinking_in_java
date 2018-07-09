public abstract class StringProcessor implements Processor{
	//public String name(){ return this.getClass.simpleString(); }  // not this.getClass()
	public String name(){ return this.getClass().getSimpleName(); }
	//public abstract String process(String s){return s;}
	public abstract String process(Object input);

	public static void main(String[] args){
		String s = "This is Cool.";
		Apply.apply(new Upcase(), s);
		Apply.apply(new Downcase(), s);
	}
}

class Upcase extends StringProcessor{
	public String process(Object s){
		return ((String)s).toUpperCase();
	}
}

class Downcase extends StringProcessor{
	public String process(Object s){
		return ((String)s).toLowerCase();
	}
}