/**
 * Linear Search java program
 * java version 15.0.1 2020-10-20
 */

package Searching;

import java.io.InputStreamReader;
import java.io.BufferedReader;

/** LinearSearch class 
 * @param target variable to check in array 
 * @param arr array name
 * @return index of the target if it is found in array else return -1
*/

public class LinearSearch {

    int linearsearch(int arr[], int target) {
        int length = arr.length;
        for (int j = 0; j < length; j++) {
            if (target == arr[j]) {
                return j;
            }
        }
        return -1;
    }
/**
 * Takes input and pass it to LinearSearch class 
 * prints the result
 * @param length takes length of array
 * @param arr[] takes values
 * @param result prints index if found else -1
 */
// Driver code 
    public static void main(String[] args) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(inputReader.readLine());
        System.out.println("length=" + length);
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(inputReader.readLine());
        }
        int target = Integer.parseInt(inputReader.readLine());
        LinearSearch linearsearchObject = new LinearSearch();
        int result = linearsearchObject.linearsearch(arr, target);
        System.out.println(result);
        inputReader.close();
    }

}