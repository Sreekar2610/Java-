public class cmparray{
		int[] arr3={4,7,3,9,2};
	public static void main(String[] args){
		int[] arr1={2,8,1,76};
		int[] arr2={91,2,3,6,4,1};
		System.out.println("same elements are");
		for(int i=0;i<arr1.length;i++){
		 for(int j=0;j<arr2.length;j++){
		    if(arr1[i]==arr2[j]){
			System.out.println(arr1[i]);
		     }
		  }
		}
	}
}
 