package Introduction_to_Java_5;

public class Max_Value_In_Array {

	public static void main(String[] args) {
		
		int[] arr  = {10, 40, 30, 50, 90, 80, -120};
		//int[] arr  = {-10, -20, -30, -40};
//		for(int i= 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		//find and print the max element in the array. 
		
		int max = Integer.MIN_VALUE;
		
		for(int i  = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}

}
