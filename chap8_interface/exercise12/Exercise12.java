interface CanFight{
	void fight();
}

interface CanSwim{
	void swim();
}

interface CanFly{
	void fly();
}

interface CanClimb{
	void climb();
}

interface CanClimbAndFly extends CanFly, CanClimb{
	// void fly();
	// void climb();
}

class ActionCharacter{
	public void fight(){}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanClimbAndFly{
	public void swim(){}
	public void fly(){}
	public void climb(){}
}

class Adventure{
	public static void t(CanFight x){ x.fight(); }
	public static void u(CanSwim x){ x.swim(); }
	public static void v(CanFly x){ x.fly(); }
	public static void w(ActionCharacter x){ x.fight(); }
	public static void c(CanClimb x){ x.climb(); }
}
	
public class Exercise12{
	public static void main(String[] args){
		Adventure a = new Adventure();
		Hero h = new Hero();
		a.t(h);
		a.u(h);
		a.v(h);
		a.w(h);
		a.c(h);
	}
}