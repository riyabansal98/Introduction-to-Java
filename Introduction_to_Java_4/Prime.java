package Introduction_to_Java_4;

public class Prime {

	public static void main(String[] args) {
		
		
		int num = 8;
		
		boolean flag = true;
		
		for(int div = 2; div <= num / 2; div++) {
			
			int rem = num % div;
			
			if(rem == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("PRIME");
		}else {
			System.out.println("NOT PRIME");
		}

	}

}
