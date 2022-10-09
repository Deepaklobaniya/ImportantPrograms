package com.Deepak;

import java.util.*;
import java.util.LinkedList;
public class practice {
	
	int v;
	ArrayList<ArrayList<Integer>> graph; 
	
	practice(int nodes) {
		v = nodes;
		graph = new ArrayList<>();
		for(int i = 0; i < v; i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int u, int v) {
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	
	public void bfs(int start) {
		boolean[] visited = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		
		System.out.println("BFS traversal");
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node+" ");
			for(int x : graph.get(node)) {
				if(visited[x] == false) {
					visited[x] = true;
					q.add(x);
	 			}
			}
		}
		System.out.println();
	}
	
	public void show() {
		for(int i = 0; i < graph.size(); i++) {
			System.out.print("Node"+i);
			for(int arr : graph.get(i)) {
				System.out.print("->"+arr);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		practice obj = new practice(5);
		obj.addEdge(0, 1);
		obj.addEdge(3, 2);
		obj.addEdge(2, 4);
		obj.addEdge(1, 4);
		obj.addEdge(3, 1);
		obj.addEdge(2, 0);
		obj.bfs(0);
		obj.show();
	}
}
