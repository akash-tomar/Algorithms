package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import BinaryTree.QueueEmptyException;
import BinaryTree.QueueusingLL;

public class Graph implements GraphInterface{

	private HashMap<String, Vertex> vertices;

	public Graph() {
		this.vertices = new HashMap<String, Vertex>();
	}

	//@Override
	public void addVertex(String name) {
		if (vertices.containsKey(name)) {
			return;
		}
		Vertex v = new Vertex(name);
		vertices.put(name, v);
	}

	public void print() {
		System.out.println("Printing Graph");
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
	

		for (Vertex v:allVertices) {
			v.print();
		}
	}

	//@Override
	public void addEdge(String first, String second) {
		if (!vertices.containsKey(first) || !vertices.containsKey(second)) {
			return;
		}
		Vertex firstVertex = vertices.get(first);
		Vertex secondVertex = vertices.get(second);
		if (firstVertex.isAdjacent(secondVertex)) {
			return;
		}
		Edge e = new Edge();
		e.first = firstVertex;
		e.second = secondVertex;
		firstVertex.addEdge(e);
		secondVertex.addEdge(e);
	}
	//@Override
	public void removeVertex(String name) {
		if (!vertices.containsKey(name)) {
			return;
		}

		Vertex toBeRemoved = vertices.get(name);
		vertices.remove(name);
		ArrayList<Vertex> adjacentVertices = toBeRemoved.getAdjacent();
		for (Vertex adjacentVertex:adjacentVertices) {
			adjacentVertex.removeEdgeWith(toBeRemoved);
		}

	}

	//@Override
	public void removeEdge(String first, String second) {
		if (!vertices.containsKey(first) || !vertices.containsKey(second)) {
			return;
		}
		Vertex firstVertex = vertices.get(first);
		Vertex secondVertex = vertices.get(second);
		firstVertex.removeEdgeWith(secondVertex);
		secondVertex.removeEdgeWith(firstVertex);
	}

	//@Override
	public ArrayList<String> getAdjacent(String name) {
		if (!vertices.containsKey(name)) {
			return null;
		}
		Vertex vertex = vertices.get(name);
		ArrayList<Vertex> adjacent = vertex.getAdjacent();	
		ArrayList<String> output = new ArrayList<String>();
		for (Vertex v: adjacent) {
			String name1 = v.name;
			output.add(name1);
		}
		return output;
	}

	//@Override
	public int getDegree(String name) {
		if (!vertices.containsKey(name)) {
			return -1;
		}

		Vertex vertex = vertices.get(name);
		return vertex.getDegree();
	}

	//@Override
	public int numberVertices() {
		// TODO Auto-generated method stub
		return vertices.size();
	}

	//@Override
	public int numberOfEdges() {
		// TODO Auto-generated method stub
		int count = 0;
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		for (int i =0; i < allVertices.length; i++) {
			Vertex v = allVertices[i];
			count += v.getDegree();
		}
		return count/2;
	}

	//@Override
	public boolean areTwoVerticesConnected(String first, String second,HashMap<String, Boolean> map) {
		QueueusingLL<String> queue = new QueueusingLL<String>();
		
		queue.enqueue(first);
		while(!queue.isEmpty()) {
			String removedVertice=null;
			try {
				removedVertice = queue.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(map.get(removedVertice)==null) {
				map.put(removedVertice, true);
			}
			else {
				continue;
			}
			if(removedVertice==second) {
				return true;
			}
			ArrayList<String> adjacentList=getAdjacent(removedVertice);
			for(String str:adjacentList) {
				queue.enqueue(str);
			}
			if(queue.isEmpty()) {
				return false;
			}
		}
		return false;
	}

	//@Override
	public boolean isConnected() {
		QueueusingLL<Vertex> queue= new QueueusingLL<Vertex>();
		Set<String> tempKey=vertices.keySet();
		for(String str : tempKey) {
			queue.enqueue(vertices.get(str));
			break;
		}

		HashMap<Vertex, Boolean> map=new HashMap<Vertex, Boolean>();
		int vertexCount=vertices.size();
		if(queue.isEmpty()) {
			return true;
		}
		int count=0;
		try {
			map.put(queue.front(), true);
		} catch (QueueEmptyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(!queue.isEmpty()) {
			Vertex tempVertex=null;
			try {
				tempVertex=queue.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(tempVertex!=null)
				count++;
			ArrayList<Vertex> adjacent=tempVertex.getAdjacent();
			for(Vertex vertices:adjacent) {
				if(map.get(vertices)==null) {
					queue.enqueue(vertices);
					map.put(vertices, true);
				}
			}
			if(queue.isEmpty()) {
				break;
			}
		}
		if(vertexCount==count) {
			return true;
		} else  {
			return false;
		}
	}

	public ArrayList<Vertex> graphComponents() {
		QueueusingLL<Vertex> queue = new QueueusingLL<Vertex>();
		Set<String> tempKey = vertices.keySet();
		ArrayList<Vertex> output=new ArrayList<Vertex>();
		HashMap<Vertex, Boolean> map=new HashMap<Vertex, Boolean>();
		int numberVertices=vertices.size();
		int count=0;
		for(String str: tempKey) {
			queue.enqueue(vertices.get(str));
			try {
				output.add(queue.front());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		while(count<numberVertices) {
			while(!queue.isEmpty()) {
				Vertex tempVertice=null;
				try {
					tempVertice=queue.dequeue();
				} catch (QueueEmptyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(map.get(tempVertice)==null) {
					map.put(tempVertice, true);
					count++;
				} else {
					continue;
				}
				ArrayList<Vertex> adjacentVertex = tempVertice.getAdjacent();
				for(Vertex vert: adjacentVertex) {
//					if(map.get(vert)==null) {
						queue.enqueue(vert);
						//map.put(vert, true);
//					}
				}
				if(queue.isEmpty()) {
					break;
				}
			}
			for(String str: tempKey) {
				if(map.get((vertices.get(str)))==null) {
					queue.enqueue(vertices.get(str));
					try {
						output.add(queue.front());
					} catch (QueueEmptyException e) {
						return null;
					}
					break;
				}
			}
		}
		return output;

	}

	public boolean areTwoVerticesConnected(String first, String second) {
		// TODO Auto-generated method stub
		return false;
	}

	
	





}
