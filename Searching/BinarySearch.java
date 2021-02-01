/**
 * Binary Search java program
 * java version 15.0.1 2020-10-20
 */

package Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** BinarySearch class 
 * @param target variable to check in array 
 * @param arr array name
 * @return index of the target if it is found in array else return -1
*/

public class BinarySearch {
    int binarySearch(int target, int arr[]) {
        int low=0;
        int high=arr.length-1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

/**
 * Takes input and pass it to BinarySearch class 
 * prints the result
 * length variable takes length of array
 * arr[] takes values
 * result variable prints index if found else -1
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
        int target = Integer.parseInt(inputReader.readLine());
        BinarySearch BinarySearchObject = new BinarySearch();
        int result = BinarySearchObject.binarySearch(target, arr);
        System.out.println("Index of " + target + " is " + result);
        inputReader.close();
        
    }
}
