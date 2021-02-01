/**
 * Stackjava program
 * java version 15.0.1 
 */
package non_linear_data_structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Stack class
 */

class Stack {
    int top;

    void push(int arr[], int data, int length) {
        if (top <= length) {
            arr[top] = data;
            top++;

        } else {
            System.out.println("stack is full");
        }

    }

    void pop() {
        top--;
    }

    void peek(int arr[]) {
        System.out.println(arr[top - 1]);
    }

    void display(int arr[]) {
        if (top == 0) {
            System.out.println("stack is empty");
        } else {
            for (int i = 0; i < top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Takes inputs and pass it to stack class methods
     */
    // Driver code
    public static void main(String args[]) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(inputReader.readLine());

        int arr[] = new int[length];
        Stack stackObject = new Stack();
        while (true) {
            int options = Integer.parseInt(inputReader.readLine());

            switch (options) {
                case 1:
                    int data = Integer.parseInt(inputReader.readLine());

                    stackObject.push(arr, data, length - 1);
                    break;
                case 2:
                    stackObject.pop();
                    break;
                case 3:
                    stackObject.display(arr);
                    break;
                case 4:
                    stackObject.peek(arr);
            }
        }

    }
}