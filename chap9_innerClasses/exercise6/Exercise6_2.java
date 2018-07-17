import chap9_innerClasses_addOn.Player;

public class Exercise6_2{
	protected class PPlayer implements Player{
		private String name;
		public PPlayer(String name){ this.name = name; }
		public String getName(){ return this.name; }
	}
	// public static void main(String[] args){
		
	// }
}