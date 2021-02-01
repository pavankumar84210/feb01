package non_linear_data_structure;

/**
 * LinkedList java program
 * java version 15.0.1 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * LinkedList class
 */

class LinkedList {
    static int size;

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

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
            size++;
        } else {

            tail.next = newNode;

            tail = newNode;
            size++;
        }
    }

    public void insertpos(int data, int pos) {
        Node innode = new Node(data);
        if (pos < 1) {
            System.out.println("invalid postion");
        } else if (pos > size) {

            tail.next = innode;
            tail = innode;

        } else {
            int p = 0;
            Node cn = head;
            while (p < pos - 1) {
                p++;
                cn = cn.next;
            }
            innode.next = cn.next;
            cn.next = innode;
            size++;

        }
    }

    public void delhead() {
        head = head.next;
    }

    public void deltail() {
        Node holder = head;
        while (holder.next.next != null) {
            holder = holder.next;
        }
        holder.next = null;
    }

    public void delnode(int data) {
        Node holder = head;
        while (holder.next.data != data) {
            holder = holder.next;
        }
        holder.next = holder.next.next;
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
        System.out.println("s" + size);
    }

    /**
     * Takes inputs and pass it to LinkedList class 
     */
    // Driver code

    public static void main(String[] args) throws Exception {

        LinkedList linkedListObject = new LinkedList();

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int option = Integer.parseInt(inputReader.readLine());

            switch (option) {
                case 1:
                    int num = Integer.parseInt(inputReader.readLine());
                    linkedListObject.addNode(num);
                    break;
                case 2:
                    int numi = Integer.parseInt(inputReader.readLine());
                    int pos = Integer.parseInt(inputReader.readLine());
                    linkedListObject.insertpos(numi, pos);
                    break;
                case 3:
                    linkedListObject.display();
                    break;
                case 4:
                    linkedListObject.delhead();
                    linkedListObject.display();
                    break;
                case 5:
                    linkedListObject.deltail();
                    linkedListObject.display();
                    break;
                case 6:
                    int dnode = Integer.parseInt(inputReader.readLine());
                    linkedListObject.delnode(dnode);
                    linkedListObject.display();
                    break;
                case 7:
                    System.out.print("size" + size);
            }
        }

    }
}