package patterns;

public class pyramidPattern {

	public static void printStars(int n) 
    {   
        for(int i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
            {           
                System.out.print("*"); // printing space
                for(int j = 1; j<i-1; j++) {
                	System.out.println("*");
                }
            } 
             
    } 
	
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
}
