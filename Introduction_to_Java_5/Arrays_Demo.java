package Introduction_to_Java_5;

public class Arrays_Demo {

	public static void main(String[] args) {
		
		
		//no actual array exists as of now. No memory has been
		//allocated to arr in the RAM. 
		//arr is just a reference in the memory
		
		//basically increase readibility of the code. 
		int[] arr;
		arr = new int[5];
		
		System.out.println(arr);
		
		System.out.println(arr.length);
		System.out.println("----------------------");
		//get
		//arr[0] trying to get the first value in the array present at
		//the 0th index 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//set
		System.out.println("----------------------");
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("----------------------");
		
		//loop
		for(int i= 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//enhanced for loops
		//only for reading the values. 
		for(int val: arr) {
			System.out.println(val);
		}
	
		
		
		
	}

}
