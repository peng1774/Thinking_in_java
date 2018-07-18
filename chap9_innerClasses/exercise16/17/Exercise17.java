import static java.lang.System.out;
import java.util.Random;

interface Toss{
	void toss();
}

interface TossFactory{
	Toss getToss();
}

class Coin implements Toss{
	public void toss(){ 
		Random rand = new Random();
		int rand_int1 = rand.nextInt(2);
		if(rand_int1 == 0)
			out.println("coin - head");
		else if (rand_int1 == 1)
			out.println("coin - tail");
		else
			out.println("wtf...");
	}
	
	public static TossFactory factory = 
		new TossFactory(){
			public Toss getToss(){ return new Coin(); }
		};
}

class Dice implements Toss{
	public void toss(){ 
		Random rand = new Random();
		int rand_int1 = rand.nextInt(6) + 1;
		out.println("dice tosses: " + rand_int1);
	}
	
	public static TossFactory factory = 
		new TossFactory(){
			public Toss getToss(){ return new Dice(); }
		};
}

// class CoinFactory implements TossFactory{
	// public Toss getToss(){ return new Coin(); }
// }

// class DiceFactory implements TossFactory{
	// public Toss getToss(){ return new Dice(); } 
// }

// class Game{
	// public static Toss start(TossFactory t){
		// return t.getToss();
	// }
// }

public class Exercise17{
	public static void main(String[] args){
		// Game g = new Game();
		// g.start(new CoinFactory()).toss();
		// g.start(new DiceFactory()).toss();
		
		Toss c = Coin.factory.getToss();
		c.toss();
		
		Toss d = Dice.factory.getToss();
		d.toss();
	}
}

