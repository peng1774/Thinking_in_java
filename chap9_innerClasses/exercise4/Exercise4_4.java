interface Selector{
	boolean end();
	Object current();
	void next();
	Sequence getSequence();
}

class Sequence{
	private Object[] items;
	private int next = 0;
	public Sequence(int size){ items = new Object[size]; }
	public void add(Object x){
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end(){ return i == items.length; }
		public Object current(){ return items[i]; }
		public void next(){ if(i < items.length){ i++; }}
		public Sequence getSequence(){ return Sequence.this; }
	}
	
	public Selector selector(){
		return new SequenceSelector();
	}
}

class Holder{
	String name;
	public Holder(int name){ this.name = Integer.toString(name); }
	public String toString(){ return name; }
}

public class Exercise4_4{
	public static void main(String[] args){
		Sequence seq = new Sequence(10);
		for(int i = 0; i < 10; i++)
			seq.add(new Holder(i));
		Selector sel = seq.selector();
		while(!sel.end()){
			System.out.println(sel.current().toString());
			sel.next();
		}
		// exercise 4 //
		Sequence seq2 = sel.getSequence();
		
	}
}