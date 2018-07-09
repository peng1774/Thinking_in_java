class FilterAdapter implements Processor{
	Filter f;
	public FilterAdapter(Filter f){ this.f = f; }
	public String name(){ return f.name(); }
	public Waveform process(Object o){
		return f.process((Waveform)o);
	}
}

public class FilterProcesser{
	public static void main(String[] args){
		Waveform w = new Waveform();
		Apply.apply(new FilterAdapter(new Highpass(2.0)), w);
		Apply.apply(new FilterAdapter(new Lowpass(1.0)), w);
	}
}