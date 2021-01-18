package Introduction_to_Java_4;

public class Fibonacci {

	public static void main(String[] args) {

		int num = 0;
		
		int a = 0;
		int b = 1;

		for(int i = 1; i<= num; i++) {
			
			System.out.println(a);
			
			int sum = a + b;
			a = b;
			b = sum;
		}
	}
	

}
