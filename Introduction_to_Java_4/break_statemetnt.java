package Introduction_to_Java_4;

public class break_statemetnt {

	public static void main(String[] args) {
		

		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) {
				break;
			}
			//System.out.println(i);
		}

		//break statement for nested loops
		
		
		for(int i = 1; i <= 3; i++) {
			
			
			for(int j = 1; j <= 3; j++) {
				
				//i = 2 && j == 2
				if(i == 2 && j == 2) {
					continue;
				}
				System.out.println(i + " " + j);
			}
		}
	}

}
