package graph;
import java.util.*;

public class graph {
	
	ArrayList<ArrayList<Integer>> graph;
	int V;
	
	// this is constructor of graph class, it create list of  V (here v = 5 so 5 list). 
	graph(int nodes) {
		graph = new ArrayList<ArrayList<Integer>>();
		V = nodes;
		for(int i = 0; i < V; i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
	
	//this is to take take edges of a node.
	void addEdge(int v, int u) {
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	
	//this for basic fun for print graph element.
	void printGraph() {
		for(int i = 0; i < V; i++) {
			System.out.print("Node"+i);
			for(int x : graph.get(i)) {
				System.out.print(" -> " + x);
			}
			System.out.println();
		}
	}
	
	//this is all business logic of DFS
	void dfsUtil(int node, boolean[] visited) {
		visited[node] = true;
		System.out.print(node + " ");
		for(int x: graph.get(node)) 
			if(visited[x] == false) 
				dfsUtil(x, visited);
	}
	
	//here we declared our DFS but it will work accordingly dfsUtil.
	void DFS(int start) {
		System.out.println();
		System.out.println("This is Depth First Search(DFS)");
		boolean[] visited = new boolean[V]; // this is booleans type of visited for marking particular element.
		dfsUtil(start, visited);
	}
	
	
	// the main reason of implemented BFS using queue because of queue works FIFO.
	void BFS(int start) {
		System.out.println();
		System.out.println();
		System.out.println("This Bredth First Search(BFS)");
		Queue<Integer> q = new LinkedList<>(); // we implemented queue by LinkedList.
		boolean[] visited = new boolean[V];
		visited[start] = true;
		q.add(start);
		while(q.isEmpty() == false) { // our while will work till we have element in our queue. 
			int node = q.poll(); // q.poll() access first element of queue and delete it.
			System.out.println(node+" ");
			for(int x : graph.get(node)) {   //this loop will make every element of that node visited add it in queue.
				if(visited[x] == false) {
					visited[x] = true;
					q.add(x);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("hello this is graph implementation");
		graph g = new graph(5); // this is nodes of graph.
		g.addEdge(0, 1);
		g.addEdge(3, 2);
		g.addEdge(2, 4);
		g.addEdge(1, 4);
		g.addEdge(3, 1);
		g.addEdge(2, 0);
		g.printGraph();
		g.DFS(0); 
		g.BFS(0);
	}
}
