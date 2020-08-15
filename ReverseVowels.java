import java.util.*;

/*Write a function that takes a string as input and reverse only the vowels of a string.
Example 1:
Input: "hello"
Output: "holle"
Note:
The vowels does not include the letter "y".

 */


class ReverseVowels {
	public String reverseVowels(String s) {
		if (s == null || s.length() < 2) {
			return s;
		}
		List<Character> vowels = new ArrayList<>();
		List<Character> arr = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		for (char c : s.toCharArray()) {
			if (arr.contains(c)) {
				vowels.add(c);
			}
		}

		Collections.reverse(vowels);
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (arr.contains(c)) {
				sb.append(vowels.get(0));
				vowels.remove(0);
			} else {
				sb.append(c);
			}
		}
		return sb.toString();

	}
}