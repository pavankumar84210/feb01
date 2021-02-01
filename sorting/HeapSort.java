/**
 * HeapSort java program
 * java version 15.0.1 
 */

package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * HeapSort class
 * 
 * @param arr array name
 * @return sorted array
 */

public class HeapSort {
	int[] heapSort(int arr[]) {
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heaps(arr, n, i);

		for (int i = n - 1; i > 0; i--) {

			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heaps(arr, i, 0);
		}
		return arr;
	}

	void heaps(int arr[], int n, int i) {
		int node = i;
		int leftNode = 2 * i + 1;
		int rightNode = 2 * i + 2;

		if (leftNode < n && arr[leftNode] > arr[node])
			node = leftNode;

		if (rightNode < n && arr[rightNode] > arr[node])
			node = rightNode;

		if (node != i) {
			int s = arr[i];
			arr[i] = arr[node];
			arr[node] = s;

			heaps(arr, n, node);
		}
	}

	/**
	 * Takes inputs and pass it to HeapSort class and prints sorted array
	 */
	// Driver code

	public static void main(String args[]) throws Exception {
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of Array");
		int length = Integer.parseInt(inputReader.readLine());
		int arr[] = new int[length + 1];
		arr[0] = 0;
		System.out.println("Enter " + length + " Elements");
		for (int i = 1; i < length + 1; i++) {
			arr[i] = Integer.parseInt(inputReader.readLine());
		}
		for (int i = 1; i < length + 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		HeapSort heapSortObject = new HeapSort();
		int[] sortedArray = heapSortObject.heapSort(arr);
		System.out.println("Sorted array is");
		for (int i = 1; i < sortedArray.length + 1; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		inputReader.close();
	}
}
