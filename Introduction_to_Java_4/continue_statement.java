package Introduction_to_Java_4;

public class continue_statement {

	public static void main(String[] args) {
		

		//Print numbers from 1 to 10 except 5.
		
		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}

		
	}

}
