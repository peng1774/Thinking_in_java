interface Monster{
	void menace();
}

interface DangerousMonster extends Monster{
	void destory();
}

interface Lethal{
	void kill();
}

class DragonZilla{
	DangerousMonster dangerousMonster(){
		return new DangerousMonster(){
			public void menace(){}
			public void destory(){}
		};
	}
}

interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
}
	
class VeryBadVampire{
	Vampire vampire(){
		return new Vampire(){
			public void menace(){}
			public void destory(){}
			public void kill(){}
			public void drinkBlood(){}
		};
	}
}

public class Exercise14{
	static void u(Monster b){ b.menace(); }
	static void v(DangerousMonster d){
		d.menace();
		d.destory();
	}
	static void w(Lethal l){ l.kill(); }
	
	public static void main(String[] args){
		DangerousMonster d = new DragonZilla().dangerousMonster();
		u(d);
		v(d);
		Vampire va = new VeryBadVampire().vampire();
		u(va);
		v(va);
		w(va);
	}
}