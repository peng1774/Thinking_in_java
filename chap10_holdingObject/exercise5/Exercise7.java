import java.util.*;

class Player{
}

public class Exercise7{	
	public static void main(String[] args){
		Player[] playerArray = {new Player(), new Player(), new Player()};
		List<Player> playList = new ArrayList<Player>();
		for(Player p : playerArray)
			playList.add(p);
		List<Player> subList = playList.subList(0,1);
		playList.removeAll(subList);
	}
}