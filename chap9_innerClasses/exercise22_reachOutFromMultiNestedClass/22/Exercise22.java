interface Selector2{
	boolean end();
	Object current();
	void next();
}

class Sequence2{
	private Object[] items;
	private int next = 0;
	public Sequence2(int size){ items = new Object[size]; }
	public void add(Object x){
		if(next < items.length)
			items[next++] = x;
	}
	
	private class ReverseSequenceSelector implements Selector2{
		private int i = items.length - 1;
		public boolean end(){ return i == -1; }
		public Object current(){ return items[i]; }
		public void next(){ if(!end()) i--; }
	}
	
	public Selector2 reverseSelector(){
		return new ReverseSequenceSelector();
	}
}

public class Exercise22{
	public static void main(String[] args){
		Sequence2 seq = new Sequence2(5);
		for(int i = 0; i < 10; i++){
			seq.add(Integer.toString(i));
		}
		Selector2 sel = seq.reverseSelector();
		while(!sel.end()){
			System.out.println((String)sel.current());
			sel.next();
		}
	}
}