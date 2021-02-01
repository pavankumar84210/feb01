/**
 * MergeSort java program
 * java version 15.0.1 
 */

package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MergeSort class
 * 
 * @param arr array name
 * @return sorted array
 */

class MergeSort {
    void merge(int arr[], int l, int mid, int h) {
        int i = l, j = mid + 1, k = l;
        int tempArr[] = new int[arr.length - 1];

        while (i <= mid && j <= h) {
            if (arr[i] < arr[j])
                tempArr[k++] = arr[i++];
            else
                tempArr[k++] = arr[j++];
        }
        for (; i <= mid; i++)
            tempArr[k++] = arr[i];
        for (; j <= h; j++)
            tempArr[k++] = arr[j];

        for (i = l; i <= h; i++)
            arr[i] = tempArr[i];
    }

    void mergeSort(int arr[]) {
        int length = arr.length;
        int p, low, high, mid, i;
        for (p = 2; p < length; p = p * 2) {
            for (i = 0; i + p < length; i = i + p) {
                low = i;
                high = i + p - 1;
                mid = (low + high) / 2;
                merge(arr, low, mid, high);
            }

        }
        if (p / 2 < length) {
            merge(arr, 0, p / 2, length);
        }

    }

    /**
     * Takes inputs and pass it to MergeSort class and prints sorted array
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
        MergeSort MergeSortObject = new MergeSort();
        MergeSortObject.mergeSort(arr);
        System.out.println("Sorted array is");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        inputReader.close();

    }
}
