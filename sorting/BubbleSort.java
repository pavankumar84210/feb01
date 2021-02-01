/**
 * Bubble Sort java program
 * java version 15.0.1 2020-10-20
 */

package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * BubbleSort class
 * @param arr array name
 * @return sorted array
 */

class BubbleSort {
    int[] bubbleSort(int arr[]) {
        int length = arr.length-1;
        int temp = 0, flag = 0;
        for (int i = 0; i <= length; i++) {
            flag = 0;
            for (int j = 0; j <= length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return arr;
            }
        }
        return arr;
    }

    /**
     * Takes inputs and pass it to BubbleSort class prints the result length
     * variable takes length of array arr[] takes values sortedArray variable prints
     * prints sorted array
     */
    // Driver code

    public static void main(String args[]) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of Array");
        int length = Integer.parseInt(inputReader.readLine());
        int arr[] = new int[length];
        System.out.println("Enter "+length+" Elements");
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(inputReader.readLine());
        }
        BubbleSort bubbleSortObject = new BubbleSort();

        int[] sortedArray = bubbleSortObject.bubbleSort(arr);
        System.out.println("Sorted array is");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        inputReader.close();
    }
}