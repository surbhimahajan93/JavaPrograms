


public class MergeSort {

	public static void main(String args[]) {
		//input array
		int[] input = { 12,98,88,55,89,5,4,1,-1 };
		int[] arr = sort(input);
		//printing the sorted array
		for (int i : arr) {
			System.out.println(i);
		}
	}

	
	public static int[] sort(int[] arr) {
		int length = arr.length;
		divideArray(arr, 0, length - 1);
		return arr;

	}

	public static int[] divideArray(int[] arr, int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// recursion to solve the left partition
			divideArray(arr, lowerIndex, middle);
			// recursion to sort the right partition
			divideArray(arr, middle + 1, higherIndex);
			// merge array
			mergeArray(arr, lowerIndex, middle, higherIndex);

		}
		return arr;
	}

	public static int[] mergeArray(int[] arr, int lowerIndex, int middle, int higherIndex) {
		int[] tempArr = new int[arr.length];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		int start = lowerIndex;
		int end = middle + 1;
		int i = lowerIndex;
		;
		while (start <= middle && end <= higherIndex) {
			if (tempArr[start] <= tempArr[end]) {
				arr[i] = tempArr[start];
				start++;
			} else {
				arr[i] = tempArr[end];
				end++;
			}
			i++;
		}
		while (start <= middle) {
			arr[i] = tempArr[start];
			i++;
			start++;
		}
		return arr;
	}
}
