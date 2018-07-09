public class Waveform{
	private long counter;
	private final long id = counter++;
	public String toString(){ return ("waveform id: " + id); }	
}