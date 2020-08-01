
public class ProductSolution1{
	public static void main(String [] args){
		int [] array = new int[]{1,2,3,4,5};
		array = getProductArray(array);
		for(int a  : array){
			System.out.println(a);
		}
	}	
	

	public static int[] getProductArray(int[] arr){
		if(arr.length ==0 || arr == null){
			return arr;
		}
		int product = 1;
		for(int i = 0 ; i <arr.length ; i++){
			product = product * arr[i];
		}
		for(int i=0 ; i < arr.length; i++){
			arr[i] = product/arr[i];
		}
		return arr;
	}
}