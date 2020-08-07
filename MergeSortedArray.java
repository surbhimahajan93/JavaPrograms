
//Question: Merge two already sorted arrays to a sorted array? 

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] a = new int[] { 4, 5, 30, 45 };
		int[] b = new int[] { 5, 6, 10, 56, 89 };
		int[] mergedArray = mergeSortedArrays(a, b);
	}

	static int[] mergeSortedArrays(int[] a, int[] b) {

		if (a == null)
			return b;
		if (b == null)
			return a;
		int[] merged = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			merged[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
		}
		while (i < a.length) {
			merged[k++] = a[i++];
		}
		while (j < b.length) {
			merged[k++] = b[j++];
		}

		return merged;
	}
}
