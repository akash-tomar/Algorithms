package entireCourseRevisit;

import java.util.ArrayList;

public class Vertex {
	
	private String name;
	private ArrayList<Edge> edges;
	
	public Vertex(String name) {
		this.name=name;
		edges=new ArrayList<Edge>();
	}
	
	public void addEdge(Edge e) {
		edges.add(e);
	}
	
}
