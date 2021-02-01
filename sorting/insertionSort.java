/**
 * InsertionSort java program
 * java version 15.0.1 2020-10-20
 */

package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * InsertionSort class
 * 
 * @param arr array name
 * @return sorted array
 */

class InsertionSort {
    int[] insertionSort(int arr[]) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            j = i - 1;
            temp = arr[i];
            while (j > -1 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
        return arr;

    }

    /**
     * Takes inputs and pass it to InsertionSort class and prints sorted array
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
        InsertionSort insertionSortObject = new InsertionSort();
        int[] sortedArray = insertionSortObject.insertionSort(arr);
        System.out.println("Sorted array is");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        inputReader.close();

    }
}
