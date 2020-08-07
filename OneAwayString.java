import java.util.*;

/*

One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.

*/
public class OneAwayString{
		public static void main(String[] args) {
		
		System.out.println(getOneAway("pale","ple"));
			System.out.println(getOneAway("pales","pale"));
	System.out.println(getOneAway("pale","bale"));
	System.out.println(getOneAway("pale","bae"));
	System.out.println(getOneAway("pales","pales"));
	}
		public static boolean getOneAway(String s1, String s2){
				HashMap<Character,Integer> map = new HashMap<>();
				for(int i=0; i < s1.length() ; i++){
					char c = s1.charAt(i);
						map.put(c,1);
				}
				for(int i = 0; i <s2.length(); i++){
					char c = s2.charAt(i);
					if(map.containsKey(c)){
						map.replace(c,map.get(c) -1);
					}
				}
				int count = 0;
				for(int a : map.values()){
					if(a == 0){
						count++;
					}
				}
				if(count == s1.length()-1 || count== s1.length()){
						return true;
				}
				return false;
		}
}