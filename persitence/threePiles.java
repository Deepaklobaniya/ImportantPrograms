package persitence;

public class threePiles {

	public static String fun(int a, int b, int c, int x, int y) {
		if(a+b+c != x+y) 
			return "No";
		else  {
			if(y < Math.min(a, Math.min(b, c)) || x < Math.min(a, Math.min(b, c))) {
				return "NO";
			}
			
			else {
				return "yes";
			}
		}
	}
	
	public static void main(String[] args) {
		int a = 3, b = 2, c = 5, x = 6, y = 5;
		System.out.println(fun(a, b, c, x, y));
	}

}
