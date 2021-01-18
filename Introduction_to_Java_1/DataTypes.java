package Introduction_to_Java_1;

public class DataTypes {

	public static void main(String[] args) {
		
		byte b = 10;
		short s = 10000;
		int i = 10;
		long l = 10;
		
		
		//Part 1 (downcasting)
		//b = s;
		//b = i;
		//we want to store the value in variable l to the variable b. 
		//b = l;
		
		s = b;
		//s = i;
		//s = l;
		
		i = b;
		i = s;
		//i = l;
		//Byte - 128 to 127
		//Part 2 (typecasting)
		b = 10;
		b = 127;
		b = (byte)129;
		//System.out.println(b);

		//Part 3
		float fl = 5.5f;
		double db = 5.5;
		
		//fl = db;
		db = fl;
		
		//Part 4
		
		i  = (int)fl;
		fl = i; //i = 5
		System.out.println(fl);
		
		// Part 5
		boolean bl = true;
		bl = false;
		//bl = 0; //false //not possible
		//bl = 1; //true  //not possible
	}

}
