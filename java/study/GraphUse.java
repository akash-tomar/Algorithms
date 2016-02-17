package study;

import java.util.ArrayList;

public class GraphUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph();
		g.addVertex("1");
		g.addVertex("2");
		g.addVertex("3");
		g.addEdge("1", "2",4);
		g.addEdge("2", "3", -2);
		g.addEdge("1", "3", 3);
		/*g.addVertex("4");
		g.addVertex("5");
		*//*g.addVertex("6");
		g.addVertex("7");
		g.addVertex("8");
		g.addVertex("9");*/
		/*g.addEdge("1", "2", 10);
		g.addEdge("1", "5", 7);
		g.addEdge("1", "3", 5);
		g.addEdge("2", "3", 2);
		g.addEdge("4", "2", 1);
		g.addEdge("3", "5", 2);
		g.addEdge("3", "4", 9);
		g.addEdge("5", "4", 4);
		g.addEdge("1", "2", 10);
		*///g.addEdge("1", "2", 10);
		g.dijkstras("1");
		
	}

}
