
import java.util.*;


//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

public class QuickSort{



	static int partition(int[] arr, int start, int end){

		int pIndex = (start + end) / 2;

		while(start != pIndex || end != pIndex){

			if(arr[start] > arr[pIndex] && arr[end] < arr[pIndex]){
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}

			if(arr[start] < arr[pIndex]) start++;
			if(arr[end] > arr[pIndex]) end--;


			if(start == pIndex && arr[end] < arr[pIndex]){
				int temp = arr[pIndex+1];
				arr[pIndex + 1] = arr[pIndex];
				arr[pIndex] = temp;	
				

				pIndex += 1;

			}else if(end == pIndex && arr[start] > arr[pIndex]){
				int temp = arr[pIndex];
				arr[pIndex] = arr[pIndex - 1];
				arr[pIndex - 1]  = temp;
				pIndex -= 1;
			}

		}

		return pIndex;
	}


	static int[] quickSort(int[] arr, int start, int end){


		if(start == end){
			return arr;
		}

		int pIndex = partition(arr, start, end);


		if(end - start <=2){
			return arr;
		}


		arr = quickSort(arr, start, pIndex);

		arr = quickSort(arr, pIndex, end);

		return arr;

	}



	static int[] quickSort(int[] arr){
		return quickSort(arr, 0, arr.length - 1);

	}

	public static void main(String[] args) {
    	System.out.println(Arrays.toString(quickSort(new int[]{1,9,2,8,3,7,4,6,5})));
   	
    	System.out.println(Arrays.toString(quickSort(new int[]{3,2})));

    	System.out.println(Arrays.toString(quickSort(new int[]{2})));

    	System.out.println(Arrays.toString(quickSort(new int[]{3,2, 1})));

    	System.out.println(Arrays.toString(quickSort(new int[]{0, 99,9,88, 8,77,7,66, 6,55, 5,44, 4,33, 3,22, 2,11, 1} )));

   	}

}






