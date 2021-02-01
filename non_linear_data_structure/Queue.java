/**
 * Queue  java program
 * java version 15.0.1 2020-10-20
 */
package non_linear_data_structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Queue class
 */

class Queue {
    int start;
    int size;
    int end;

    void push(int arr[], int data, int length) {
        if (size <= length) {
            end = size % length;
            arr[end] = data;

            size++;
        } else {
            System.out.println("stack is full");
        }

    }

    void pop(int arr[]) {
        System.out.println("poped " + arr[start]);

        start++;
        // size--;
    }

    void display(int arr[], int length) {
        if (size == 0) {
            System.out.println("stack is empty");
        } else {
            for (int i = start; i < size; i++) {
                System.out.print(arr[i % length] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Takes inputs and pass it to Queue class methods
     */
    // Driver code
    public static void main(String args[]) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(inputReader.readLine());

        int arr[] = new int[length];
        Queue queueObject = new Queue();
        while (true) {
            int options = Integer.parseInt(inputReader.readLine());

            switch (options) {
                case 1:
                    int data = Integer.parseInt(inputReader.readLine());

                    queueObject.push(arr, data, length);
                    break;
                case 2:
                    queueObject.pop(arr);
                    System.out.println("size = " + queueObject.size);

                    break;
                case 3:
                    System.out.println("size = " + queueObject.size);

                    queueObject.display(arr, length);
            }
        }

    }
}