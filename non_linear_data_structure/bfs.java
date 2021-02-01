/**
 * Bfs java program
 * java version 15.0.1 
 */

package non_linear_data_structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

/**
 * Bfs class
 * 
 * @param bgrapgh array name
 * @return array
 */

class Bfs {
    ArrayList<Integer> bfs(HashMap<Integer, ArrayList<Integer>> bgrapgh) {
        int length = bgrapgh.size();
        boolean visited[] = new boolean[length];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Deque<Integer> queue = new ArrayDeque<>();
        int start = 1;
        arr.add(start);
        queue.add(start);
        visited[start] = true;
        while (queue.size() != 0) {
            start = queue.removeFirst();
            for (Integer k : bgrapgh.get(start)) {
                if (visited[k] == false) {
                    queue.add(k);
                    visited[k] = true;
                    arr.add(k);
                }
            }
        }
        return arr;
    }

    /**
     * Takes inputs and pass it to Bfs class
     */
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int nodes = Integer.parseInt(inputReader.readLine());
        int edges = Integer.parseInt(inputReader.readLine());
        HashMap<Integer, ArrayList<Integer>> bfsGraph = new HashMap<>();
        for (int i = 0; i <= nodes; i++) {
            bfsGraph.put(i, new ArrayList<Integer>());
        }
        for (int i = 0; i < edges; i++) {
            int a = Integer.parseInt(inputReader.readLine());
            int b = Integer.parseInt(inputReader.readLine());
            bfsGraph.get(a).add(b);
            bfsGraph.get(b).add(a);
        }
        Bfs bfsObject = new Bfs();
        ArrayList<Integer> result = bfsObject.bfs(bfsGraph);
        for (Integer o : result) {
            System.out.print(o + " ");
        }
        inputReader.close();

    }
}
