import static java.lang.System.out;

interface Game{
	void move();
}

interface GameFactory{
	Game getGame();
}

class CheckGame implements Game{
	public void move(){out.println("CheckGame starts");}
}

class ChessGame implements Game{
	public void move(){out.println("ChessGame starts");}
}

class CheckGameFactory implements GameFactory{
	public Game getGame(){ return new CheckGame(); }
}

class ChessGameFactory implements GameFactory{
	public Game getGame(){ return new ChessGame(); }
}

public class Games{
	public static void playGame(GameFactory g){
		Game s = g.getGame();
		s.move();
	}
	
	// public static void main(String[] args){
		// Games.playGame();
	// }
}





	