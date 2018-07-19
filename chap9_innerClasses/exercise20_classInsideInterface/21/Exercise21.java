interface SCSI{
	String rString();
	class Wire{
		static void show(SCSI s){
			System.out.println(s.rString());
		}
	}
}

public class Exercise21 implements SCSI{
	public String rString(){
		int i = 1;
		i++;
		return Integer.toString(i);
	}
	
	public static void main(String[] args){
		SCSI.Wire.show(new Exercise21());
	}
}