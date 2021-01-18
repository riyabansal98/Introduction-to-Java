package Introduction_to_Java_3;

public class If_else_if {

	public static void main(String[] args) {
		
		int marks = -10;
		
		if(marks >= 0 && marks < 33) {
			System.out.println("Student failed");
		}else if(marks >= 33 && marks < 60) {
			System.out.println("D grade");
		}else if(marks >= 60 && marks < 70) {
			System.out.println("C grade");
		}else if(marks >= 70 && marks < 80) {
			System.out.println("B grade");
		}else if(marks >= 80 && marks < 100) {
			System.out.println("A grade");
		}else {
			System.out.println("Invalid marks entered");
		}
		

	}

}
