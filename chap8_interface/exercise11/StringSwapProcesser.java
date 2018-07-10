class SwapAdapter implements Processor{
	StringSwap s = new StringSwap();
	//public SwapAdapter(StringSwap s){ this.s = s; }
	public String name(){ return getClass().getSimpleName(); }
	//@Override
	public String process(Object input){ return s.swap((String)input); }
}

public class StringSwapProcesser{
	//public static void main(String[] args){
	public void start(){
		String s = "StringSwap";
		Apply.apply(new SwapAdapter(), s);
	}
}