/*
Write a function that reverses a string. The input string is //given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.*/

class ReverseCharArrayInplace {

	public void reverseString(char[] s) {
		int begin = 0;
		int end = s.length - 1;
		while (begin < end) {
			char temp = s[begin];
			s[begin] = s[end];
			s[end] = temp;
			end--;
			begin++;
		}

	}

}