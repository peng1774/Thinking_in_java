class DotNew{
	public class Inner{}
}

public class Exercise4_2{
	public static void main(String[] args){
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
	}
}