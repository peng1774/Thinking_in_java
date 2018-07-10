public class StringSwap{
	public String swap(String s){
		// int len = s.length();
		// len = len/2 * 2;
		// for(int i = 0; i < len; i += 2){
			// s[i] = '1';
		// }
		// return s;
		
		char[] c = s.toCharArray();
		int len = c.length;
		char temp;
		len = len/2 * 2;
		for(int i = 0; i < len; i += 2){
			temp = c[i];
			c[i]= c[i+1];
			c[i+1] = temp;
		}
		return String.valueOf(c);
	}
}