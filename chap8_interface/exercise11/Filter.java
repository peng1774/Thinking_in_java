public abstract class Filter{
	public String name(){ return getClass().getSimpleName(); }
	public abstract Waveform process(Waveform o);
}