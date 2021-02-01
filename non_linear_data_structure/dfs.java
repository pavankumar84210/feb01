/**
 * Dfs java program
 * java version 15.0.1 
 */

package non_linear_data_structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class Dfs {
    /**
     * Dfs method
     * 
     * @param bgraph
     * @param visited array
     * @param arr
     * @param u
     */

    static void dfs(HashMap<Integer, ArrayList<Integer>> bgraph, boolean[] visited, int u, ArrayList<Integer> arr) {
        if (visited[u])
            return;
        arr.add(u);
        visited[u] = true;
        for (Integer k : bgraph.get(u)) {
            if (!visited[k]) {
                dfs(bgraph, visited, k, arr);
            }
        }

    }

    /**
     * Takes inputs and pass it to Dfs class
     */
    // Driver code

    public static void main(String[] args) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int nodes = Integer.parseInt(inputReader.readLine());
        int edges = Integer.parseInt(inputReader.readLine());
        HashMap<Integer, ArrayList<Integer>> dfsGraph = new HashMap<>();
        for (int i = 0; i <= nodes; i++) {
            dfsGraph.put(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < edges; i++) {
            String[] s = inputReader.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            dfsGraph.get(a).add(b);
            dfsGraph.get(b).add(a);
        }
        boolean visited[] = new boolean[nodes + 1];
        ArrayList<Integer> arr = new ArrayList<Integer>();

        dfs(dfsGraph, visited, 1, arr);
        for (Integer qq : arr)
            System.out.println(qq);
        inputReader.close();

    }
}
