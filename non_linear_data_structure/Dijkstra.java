/**
 * Dijkstra java program
 * java version 15.0.1 
 */

package non_linear_data_structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dijkstra {
	/**
	 * Dijkstra method
	 * 
	 * @param graph array name
	 */

	static void dijkstra(int[][] graph) {
		int length = graph.length;
		boolean visited[] = new boolean[length];
		int distance[] = new int[length];
		distance[0] = 0;
		for (int i = 1; i < length; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < length - 1; i++) {
			int minVretex = findMinVertex(distance, visited);
			visited[minVretex] = true;
			for (int j = 0; j < length; j++) {
				if (graph[minVretex][j] != 0 && !visited[j]) {
					int newDistance = distance[minVretex] + graph[minVretex][j];
					if (newDistance < distance[j]) {
						distance[j] = newDistance;
					}
				}
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.println(i + " " + distance[i]);
		}
	}

	/**
	 * findMinVertex method
	 * 
	 * @param distance array
	 * @param visited  array
	 * @return minimum vertex
	 */
	static int findMinVertex(int[] distance, boolean visited[]) {
		int minVretex = -1;
		for (int i = 0; i < distance.length; i++) {
			if (!visited[i] && (minVretex == -1 || distance[i] < distance[minVretex])) {
				minVretex = i;
			}
		}
		return minVretex;
	}

	/**
	 * Takes inputs and pass it to Dijkstra class
	 */
	// Driver code
	public static void main(String[] args) throws Exception {
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		int vertex = Integer.parseInt(inputReader.readLine());
		int edges = Integer.parseInt(inputReader.readLine());
		int[][] graph = new int[vertex][vertex];
		for (int i = 0; i < edges; i++) {
			String[] s = inputReader.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int weight = Integer.parseInt(s[2]);
			graph[a][b] = weight;
			graph[b][a] = weight;
		}
		dijkstra(graph);
		inputReader.close();
	}
}
