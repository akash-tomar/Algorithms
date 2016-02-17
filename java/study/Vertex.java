package study;

import java.util.ArrayList;

public class Vertex {
	String name;
	ArrayList<Edge> edges;
	
	public Vertex(String name) {
		this.name = name;
		edges = new ArrayList<Edge>();
	}
	
	public boolean isAdjacent(Vertex vert) {
		for(Edge e : this.edges) {
			if(e.first == vert || e.second == vert) {
				return true;
			}
		}
		return false;
	}
	
	public void addEdge(Edge e) {
		this.edges.add(e);
	}
	
	public ArrayList<Vertex> getAdjacentVertices() {
		ArrayList<Vertex> vertices = new ArrayList<Vertex>();
		for(Edge e : this.edges) {
			if(this == e.first) {
				vertices.add(e.second);
			} 
			if(this == e.second) {
				vertices.add(e.first);
			}
		}
		return vertices;
	}
	
	public void removeEdgeFrom(Vertex vertex) {
		for(Edge e: this.edges) {
			if(e.first == vertex || e.second == vertex) {
				edges.remove(e);
				return;
			}
		}
	}
	
	public int degreeOfVertex() {
		return edges.size();
	}
	
	public void printAllAdjacentVertices() {
		System.out.print(this.name+" : ");
		for(Edge e : edges) {
			if(e.first == this) {
				System.out.print(e.second.name+", ");
			} 
			if(e.second == this) {
				System.out.print(e.first.name+", ");
			}
		}
		System.out.println();
	}
	
}
