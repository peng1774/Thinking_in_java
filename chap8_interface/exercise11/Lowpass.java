public class Lowpass extends Filter{
	private double cutoff;
	public Lowpass(double c){ this.cutoff = c; }
	
	public Waveform process(Waveform w){ return w; }
}