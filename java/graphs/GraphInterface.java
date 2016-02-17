package graphs;

import java.util.ArrayList;

public interface GraphInterface {
	public void addVertex(String data);
	public void addEdge(String first, String second);
	public void removeVertex(String data);
	public void removeEdge(String first, String second);
	
	public ArrayList<String> getAdjacent(String from);
	public int getDegree(String node);
	public int numberVertices();
	public int numberOfEdges();
	public boolean areTwoVerticesConnected(String first, String second);
	public boolean isConnected();
	
}
