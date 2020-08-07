import java.util.*;

/*
Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
1.5
1.6
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)
*/
public class PallindromePermutaion{
	public static void main(String[] args) {
		String s = "tact coa";
		Sol1 sol = new Sol1();
		System.out.println(sol.isPalPermutation(s));
	}
}

class Sol1 {
	public boolean isPalPermutation(String s) {
	//	String s = s1.replaceAll("\\s", "");
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char mapKey = s.charAt(i);
			if(mapKey == ' '){
				continue;
			}
			if (map.containsKey(mapKey)) {
				map.put(mapKey, map.get(mapKey) + 1);
			} else {
				map.put(mapKey, 1);
			}
		}

		int count = 0;
		for (int a : map.values()) {
			if (a % 2 != 0) {
				count++;
			}
		}
		if (count > 1) {
			return false;
		}
		return true;
	}
}