package chap8_interface.exercise1;

import static java.lang.System.out;



//--exercise2
abstract class noAbstractMethod{
	public String say(){ return "whatever";}
}

//--exercise3
abstract class baseClass{
	public abstract void print();
}

class derivedClass extends baseClass{
	private int i = 0;
	public void print(){ out.println(i); }
}

//--exercise4
abstract class baseClass4{
}

class derivedClass4 extends baseClass4{
	public void say(){ out.println("derivedclass4 obj say"); }
}
//


abstract class Instrument{
	private int i;
	public abstract void play(String n);
	public String what(){return "instrument";}
	public abstract void adjust();
}

class Wind extends Instrument{
	public void play(String n){
		out.println("Wind.play() " + n);
	}
	public String what(){ return "Wind"; }
	public void adjust(){}
}

public class Music4{
	static void tune(Instrument i){
		i.play("play =)\n");
	}
	static void tuneAll(Instrument[] e){
		for(Instrument i : e)
			tune(i);
	}
	
	//exercise4
	static void ex4(baseClass4 b){
		((derivedClass4)b).say();
	}
	
	public static void main(String[] args){
			Instrument[] orchestra = {
				new Wind(),
				new Wind()
			};
			tuneAll(orchestra);
			
			//exercise2
			//noAbstractMethod n = new noAbstractMethod();	//exception
			
			//exercise3
			derivedClass d = new derivedClass();
			d.print();
			
			//exercise4
			ex4(new derivedClass4());
			
	}
}