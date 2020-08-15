//reverse character array

class ReverseCharArray {
	
	public static void main(String[] args) {
		char[] result = reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });
		System.out.println(result);
	}

	public static char[] reverseString(char[] s) {
		char[] result = new char[s.length];
		int j = 0;
		for (int i = s.length - 1; i >= 0; i--) {
			result[j++] = s[i];

		}
		return result;
	}

}