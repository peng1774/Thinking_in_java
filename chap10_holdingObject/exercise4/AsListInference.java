import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference{
	public static void main(String[] args){
		//1
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Powder());
		//2
		//won't work
		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		//3
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		//4
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
	}
}