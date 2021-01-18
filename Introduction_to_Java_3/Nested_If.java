package Introduction_to_Java_3;

public class Nested_If {

	public static void main(String[] args) {
		
		int age = 10;
		int weight = 40;
		
		if(age >= 18) {
			
			if(weight > 50) {
				System.out.println("You are eligible to donate blood. ");
			}else {
				System.out.println("Not enough weight");
			}
		}else {
			System.out.println("Not an eligible age to donate blood.");
		}
		

		//First we check age eligibility. 
		//if age eligibility is true, then only we check weight. 
	}

}
