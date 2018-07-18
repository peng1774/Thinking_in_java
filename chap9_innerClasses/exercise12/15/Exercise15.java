class Throbber{
	int i;
	Throbber(int i){
		this.i = i;
	}
}

class Bobber{
	Throbber getThrobber(int i){
			return new Throbber(i){ // this is an anonymous class extends Throbber
				private int a = 1;
			};
	}
}

public class Exercise15{
	public static void main(String[] args){
		Bobber b = new Bobber();
		Throbber t = b.getThrobber(1);
		System.out.println(t.i);
	}
}