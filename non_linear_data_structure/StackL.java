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
 
public class StackL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public Node holder = null;


    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;

            tail = newNode;
        }
    }
    public void pop() {
        Node holder = head;
        while (holder.next.next != null) {
            holder = holder.next;
        }
        System.out.println(holder.next.data);

        holder.next = null;

    }

    public void display() {

        Node current = head;

        if (head == null) {
            System.out.println("empty");
            return;
        }
        while (current != null) {

            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
 /**
     * Takes inputs and pass it to stack class methods
     */
    // Driver code
    public static void main(String args[]) throws Exception {
        BufferedReader InputReader = new BufferedReader(new InputStreamReader(System.in));
StackL stackObject=new StackL();
        while (true) {
            int options = Integer.parseInt(InputReader.readLine());

            switch (options) {
                case 1:
                int num = Integer.parseInt(InputReader.readLine());
                stackObject.push(num);
                    break;
                case 2:
                stackObject.pop();
                    break;
                case 3:

                    stackObject.display();
            }
        }


    }
    
}
