class ReverseVowel1 {
	public String reverseVowels(String s) {
		boolean[] map = new boolean[256];
		map['a'] = true;
		map['e'] = true;
		map['i'] = true;
		map['u'] = true;
		map['o'] = true;

		map['A'] = true;
		map['E'] = true;
		map['I'] = true;
		map['U'] = true;
		map['O'] = true;

		char[] sCharArray = s.toCharArray();
		int begin = 0;
		int end = s.length() - 1;
		while (begin < end) {
			while (begin < end && map[sCharArray[begin]] == false)
				++begin;
			while (begin < end && map[sCharArray[end]] == false)
				--end;
			if (begin < end) {
				char temp = sCharArray[begin];
				sCharArray[begin] = sCharArray[end];
				sCharArray[end] = temp;
			}
			--end;
			++begin;
		}

		return new String(sCharArray);

	}
}


/*Write a function that takes a string as input and reverse only the vowels of a string.
Example 1:
Input: "hello"
Output: "holle"
Note:
The vowels does not include the letter "y".

 */