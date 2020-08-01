import java.util.*;

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