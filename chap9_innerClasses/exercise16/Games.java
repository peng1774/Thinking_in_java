import static java.lang.System.out;

interface Game{ boolean move(); }
interface GameFactory{ Game getGame(); }

class Checkers implements Game{
	private Checkers(){};
	public boolean move(){ return true; }
	public static GameFactory factory = 
		new GameFactory(){
			public Game getGame(){
				return new Checkers();
			}
		};
}

class Chess implements Game{
	private Chess(){};
	public boolean move(){ return false; }
	public static GameFactory factory = 
		new GameFactory(){
			public Game getGame(){
				return new Chess();
			}
		};
}

public class Games{
	public static void main(String[] args){
		Game g = Chess.factory.getGame();
		boolean b = g.move();
	}
}