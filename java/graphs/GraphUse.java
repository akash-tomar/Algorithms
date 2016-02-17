package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphUse {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		
		g.addVertex("d");
		g.addVertex("g");
		g.addVertex("n");
		g.addEdge("d", "g");
		g.addEdge("d", "n");
//		g.addEdge("n", "g");
//		g.addEdge("d", "g");
//		g.addEdge("d", "g");
//		g.removeEdge("d", "g");
		g.addVertex("z");
		g.print();
//		if(g.isConnected())
//			System.out.println("Yes");
//		else 
//			System.out.println("No");
		ArrayList<Vertex> vertices=g.graphComponents();
		for(Vertex vert:vertices) {
			System.out.println(vert.name);
		}
//		System.out.println(g.numberOfEdges());
		HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		if(g.areTwoVerticesConnected("d", "z",map))
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}
