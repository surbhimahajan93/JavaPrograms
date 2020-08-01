public class UniqueCharacters{
	public static void main(String[] args){
		Solution sol = new Solution();	
		System.out.println(sol.uniqueCharacters("@_"));
		
		
	}
}

class Solution{
	 public boolean uniqueCharacters(String s){
		boolean a[] = new boolean[128];
		for(char i : s.toCharArray()){
			if(a[i]){
				return false;
			}
			a[i] = true; 	
		}
		return true;
	}

}