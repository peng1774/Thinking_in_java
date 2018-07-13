public class Exercise18_2{
	public static void main(String[] args){
		Games.playGame(new CheckGameFactory());
		Games.playGame(new ChessGameFactory());
	}
}