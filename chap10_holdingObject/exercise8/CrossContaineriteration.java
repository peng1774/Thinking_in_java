import java.util.*;

class Pet{
}

public class CrossContaineriteration{
	// public static void display(Iterator<Pet> it){
		// while(it.hasNext()){
			// Pet p = it.next();
			// System.out.println("cool");
		// }
		// System.out.println();
	// }
	public static void main(String[] args){
		ArrayList<Pet> pets = new ArrayList<Pet>();
		Collections.addAll(pets, new Pet(), new Pet());
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()){
			Pet p = it.next();
			System.out.println("=)");
		}
		
		for(Pet p: pets){
			System.out.println("twt");
		}
		
	}
}