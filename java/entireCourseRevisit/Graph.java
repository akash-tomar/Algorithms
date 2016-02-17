package entireCourseRevisit;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	private HashMap<String, Vertex> vertices;
	
	public void addVertex(String name) {
		Vertex v = new Vertex(name);
		vertices.put(name, v);
	}
	
	public void addEdge(String first, String second) {
		if(!vertices.containsKey(first) || !vertices.containsKey(second)) {
			return;
		}
		Edge e =new Edge();
		Vertex firstVertex=vertices.get(first);
		Vertex secondVertex=vertices.get(second);
		firstVertex.addEdge(e);
		secondVertex.addEdge(e);
		
	}
	
	public void removeVertex(String data) {
		
	}
	
	public void removeEdge(String first, String second) {
		
	}
	
	public ArrayList<String> getAdjacent(String from) {
		
	}
	
	public int getDegree(String node) {
		
	}
	
	public int numberVertices() {
		
	}
	
	public int numberOfEdges() {
		
	}
	
	public boolean areTwoVerticesConnected(String first, String second) {
		
	}
	
	public boolean isConnected() {
		
	}
	
	
}
