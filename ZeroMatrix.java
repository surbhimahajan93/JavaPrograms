import java.util.Arrays;

public class ZeroMatrix{
	public static void main( String [] args){
		int[][] a = new int[4][5];
	a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,0,14,15},{16,17,18,19,20};
		 //int[][]  res = getZeroMatrix(a);
  		 //for (int[] r: res)
            	 //System.out.println(Arrays.toString(r)); 
   	 } 
	
	public static void getZeroMatrix(int[][] matrix){
	      int m = matrix.length;
		int n = matrix[0].length;
		int[][] res = new int[m][n];
		List<Integer> row = new ArrayList<>();
		List<Integer> column = new ArrayList<>();
		for(int i=0 ; i< m; i++){
			for(int j = 0; j < n; j++){
				if(matrix[i][j] == 0){
					row.add(i);
					column.add(j);
				}
			}
		}
		for(int i=0 ; i< m; i++){
			for(int j = 0; j < n; j++){
				if(row.contains(i) || column.contains(j)){
					matrix[i][j] = 0;
				}

			}
		}
	}
}