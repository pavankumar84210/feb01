/**
 * Quick Sort java program
 * java version 15.0.1 
 */

package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * QuickSort class
 * 
 * @param arr array name
 * @return sorted array
 */

public class QuickSort {
    int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1); 
		for (int j=low; j<high; j++) 
		{ 
			if (arr[j] <= pivot) 
			{ 
				i++; 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 
		return i+1; 
	}

    int[] quickSort(int arr[], int low, int high) {

        int holder;
        if (low < high) {
            holder = partition(arr, low, high);
            quickSort(arr, low, holder-1);
            quickSort(arr, holder + 1, high);
        }
        return arr;
    }

    /**
     * Takes inputs and pass it to QuickSort class and prints sorted array
     */
    // Driver code

    public static void main(String args[]) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of Array");
        int length = Integer.parseInt(inputReader.readLine());
        int arr[] = new int[length];
        System.out.println("Enter " + length + " Elements");
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(inputReader.readLine());
        }
        QuickSort QuickSortObject = new QuickSort();
        int[] sortedArray = QuickSortObject.quickSort(arr, 0, length-1);
        System.out.println("Sorted array is");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        inputReader.close();

    }
}
