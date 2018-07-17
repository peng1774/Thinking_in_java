interface Selector{
	boolean end();
	Object current();
	void next();
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
	}
	
	public Selector selector(){
		return new SequenceSelector();
	}
}

public class Exercise2{
	public static void main(String[] args){
		Sequence seq = new Sequence(10);
		for( int i = 0; i < 10; i++)
			seq.add(Integer.toString(i));
		Selector sel = seq.selector();
		Object o = sel.current();
		System.out.println((String)o);
	}
}