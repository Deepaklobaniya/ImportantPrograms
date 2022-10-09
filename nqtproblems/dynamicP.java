package nqtproblems;

public class dynamicP {

	public static int kadanes(int[] n) {
		int max = Integer.MIN_VALUE;
		int cursum = 0;
		for(int i = 0; i < n.length; i++) {
			cursum = cursum + n[i];
			
			if(cursum > max) {
				max = cursum;
			}
			
			if(cursum < 0) {
				cursum = 0;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(kadanes(num));
	}

}
