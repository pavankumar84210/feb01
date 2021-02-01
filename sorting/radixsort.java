/**
 * Radix Sort java program
 * java version 15.0.1 
 */

package sorting;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * RadixSort class
 * 
 * @param arr array name
 * @return sorted array
 */

class Radixsort {
	static int getMaxElement(int arr[]) {
		int length = arr.length;
		int maxElement = arr[0];
		for (int i = 1; i < length; i++)
			if (arr[i] > maxElement)
				maxElement = arr[i];
		return maxElement;
	}

	int[] radixSort(int arr[]) {
		int length = arr.length;
		int maxElement = getMaxElement(arr);
		for (int exp = 1; maxElement / exp > 0; exp *= 10) {
			ArrayList<ArrayList<Integer>> al = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
				al.add(new ArrayList<Integer>());
			}
			for (int i = 0; i < length; i++) {
				al.get((arr[i] / exp) % 10).add(arr[i]);
			}
			int incrementor = 0;
			for (int i = 0; i < 10; i++) {
				// for (int j = 0; j < al.get(i).size(); j++) {
				for (Integer k : al.get(i)) {
					arr[incrementor++] = k;
				}
			}
		}
		return arr;
	}

	/**
	 * Takes inputs and pass it to RadixSort class and prints sorted array
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
		Radixsort radixsortObject = new Radixsort();
		int[] sortedArray = radixsortObject.radixSort(arr);
		System.out.println("Sorted array is");
		for (int i = 0; i < length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		inputReader.close();
	}
}