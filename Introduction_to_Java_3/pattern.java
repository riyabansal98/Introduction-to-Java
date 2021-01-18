package Introduction_to_Java_3;

public class pattern {

	public static void main(String[] args) {
		
		int rows = 15;
		
		for(int i = 1; i <= rows; i++) {
			for(int j = rows; j>= i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

		System.out.println();
	
	

	}
	

}
