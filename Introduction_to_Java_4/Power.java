package Introduction_to_Java_4;

public class Power {

	public static void main(String[] args) {
		

		//a**b = a multiplied b times. 
		
		//2**3 = 2*2*2
		
		//5**4 = 5*5*5*5
		
		int a = 2;
		int b = 6;
		
		
		int ans = 1;
		
		for(int i = 1; i <= b; i++) {
			ans = ans * a;
			
		}
		
		System.out.println(ans);
	}

}
