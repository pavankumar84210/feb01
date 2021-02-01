/**
 * BinarySearchTree java program
 * java version 15.0.1 
 */

package non_linear_data_structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * BinarySearchTree class
 */

class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static Node root;

    BinarySearchTree() {
        root = null;
    }

    /**
     * insert method
     * 
     * @param key
     * @return root
     */

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(root.key + " ");
            display(root.right);
        }
    }

    /**
     * Takes inputs and pass it to BinarySearchTree class
     */
    // Driver code
    public static void main(String[] args) throws Exception {
        BinarySearchTree binarySearchTreeObject = new BinarySearchTree();

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(inputReader.readLine());

        for (int i = 0; i < length; i++) {
            binarySearchTreeObject.insert(Integer.parseInt(inputReader.readLine()));
        }

        binarySearchTreeObject.display(root);
        inputReader.close();

    }
}
