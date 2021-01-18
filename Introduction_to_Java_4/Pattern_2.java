package Introduction_to_Java_4;

public class Pattern_2 {

	public static void main(String[] args) {
		
		int n = 21;
		
		int rows = n;
		
		//no of stars
		int nst = 1;
		
		//The no of rows equal to the value of n. 
		for(int i = 1; i <= rows; i++) {
			
			//print the no of stars for each row
			//cst = count of stars. 
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}
			
			//move to the next line
			System.out.println();
			
			//check the current row, based on that, 
			//take the decision to increase/decrease the stars.
			if(i <= rows / 2) {
				nst++;
			}else {
				nst--;
			}
			
		}

	}

}
