package rahultast;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		// sorting array in Ascending or desending manner 

		int[] arr = {2, 1, 3, 4, 5, 3};
		

	int sum=0;
		for (int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		for (int i = 0; i < arr.length - 1; i++) {
		    for (int j = 0; j < arr.length - 1; j++) {
		        if (arr[j] <arr[j + 1]) {
		            int temp;
		            temp = arr[j];
		            arr[j] = arr[j + 1];
		            arr[j + 1] = temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));  // [1, 2, 3, 3, 4, 5]

	}

}
