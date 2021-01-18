package Introduction_to_Java_3;

public class Check_leap_year {

	public static void main(String[] args) {
		

		int year = 2100;
		
		//A  year is a leap year if any one the following conditions are true:
		//a) if it is divisible by 4 and not 100
		//b) It it is divisible by 400. 
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}

	}

}
