public class Highpass extends Filter{
	private double cutoff;
	public Highpass(double c){ this.cutoff = c; }
	
	public Waveform process(Waveform w){ return w; }
}