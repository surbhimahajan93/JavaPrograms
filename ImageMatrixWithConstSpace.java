import java.util.Arrays;

/*
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

*/

public class ImageMatrixWithConstSpace{
	public static void main( String [] args){
	int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	//int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][]  res = getImageMatrix(a);
  		for (int[] r: res)
            System.out.println(Arrays.toString(r)); 
   	 } 
  


	public static int[][] getImageMatrix(int[][] a){
		int arrLen = a.length;
		for(int i = 0;i < arrLen;i++){
			 for(int j= i+1 ; j < arrLen ;j++){	
				int temp = a[j][i];	
				a[j][i] = a[i][j];
				a[i][j] = temp;
				}	
		}
   	  
		for(int i=0 ; i < arrLen  ; i++){
				int first = 0;
				int lastIndex = arrLen -1;
				while(lastIndex - first > 0 ){
					int temp = a[i][first];
					a[i][first] = a[i][lastIndex];
					a[i][lastIndex] = temp;
					first++;
					lastIndex --;
				}			
		}
		return a;
	}

}