package Introduction_to_Java_5;

public class Reverse_the_Array {

	public static void main(String[] args) {

		int[] arr = { 112, 231, 12, 434, 231 };

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
