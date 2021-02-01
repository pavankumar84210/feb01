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

public class QueueL {
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

    public void Enqueue(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;

            tail = newNode;
        }
    }
    public void Dequeue() {
        System.out.println(head.data);
        head = head.next;
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
        System.out.println();
    }
 /**
     * Takes inputs and pass it to Queue class methods
     */
    // Driver code
    public static void main(String args[]) throws Exception {
        BufferedReader InputReader = new BufferedReader(new InputStreamReader(System.in));
QueueL QueueObject=new QueueL();
        while (true) {
            int options = Integer.parseInt(InputReader.readLine());

            switch (options) {
                case 1:
                int num = Integer.parseInt(InputReader.readLine());
                QueueObject.Enqueue(num);
                    break;
                case 2:
                QueueObject.Dequeue();
                    break;
                case 3:

                    QueueObject.display();
            }
        }


    }
    
}
