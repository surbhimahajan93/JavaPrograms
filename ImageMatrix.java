import java.util.Arrays;
/*
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

*/
public class ImageMatrix{
	public static void main( String [] args){
		float[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		float[][]  res = getImageMatrix(a);
  		for (float[] r: res)
            System.out.println(Arrays.toString(r)); 
   	 } 
  


	public static float[][] getImageMatrix(float[][] a){
		int len = a.length;
		int arrLen = a.length;
		float[][] result = new float[arrLen][arrLen];
		for(int i=0 ; i < arrLen  ; i++){
			for(int j=0 ; j < arrLen ;j++){
				result[i][j] = a[len-1][j];
			}
			len--;
		}
		return swap(result,arrLen);
	}
	
	public static float[][] swap(float[][] result, int arrLen){
		float[][] r = new float[arrLen][arrLen];
		for(int i = 0;i < arrLen;i++){
			 for(int j=0 ; j < arrLen ;j++){			
				r[i][j] = result[j][i];
				}
			
		}
		return r;
	}
}