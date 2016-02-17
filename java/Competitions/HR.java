package Competitions;

import graphs.Edge;
import graphs.Graph;
import graphs.GraphInterface;
import graphs.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import BinaryTree.QueueEmptyException;
import BinaryTree.QueueusingLL;

public class HR {

	/**
	 * @param args
	 */
	public static int countMet=0;
	public static class Vertex {
		final String name;
		private ArrayList<Edge> edges;

		public Vertex(String name1) {
			name = name1;
			edges = new ArrayList<Edge>();
		}

		public boolean isAdjacent(Vertex secondVertex) {
			for (Edge e:edges) {
				if (e.first == secondVertex || e.second == secondVertex) {
					return true;
				}
			}
			return false;
		}

		public void addEdge(Edge e) {
			edges.add(e);
		}

		public ArrayList<Vertex> getAdjacent() {
			ArrayList<Vertex> output = new ArrayList<Vertex>();
			for (Edge e: edges) {
				if (this == e.first) {
					output.add(e.second);
				} else {
					output.add(e.first);
				}
			}
			return output;
		}

		public void removeEdgeWith(Vertex toBeRemoved) {

			for (int i=0; i< edges.size(); i++) {
				Edge e = edges.get(i);
				if (e.first == toBeRemoved || e.second == toBeRemoved) {
					edges.remove(i);
					return;
				}
			}

		}

		public int getDegree() {
			return edges.size();
		}

		public void print() {
			System.out.print(name + ":");
			ArrayList<Vertex> adjacent = getAdjacent();
			for (Vertex v: adjacent) {
				System.out.print(v.name + ",");
			}
			System.out.println();
		}
	}
	public static class Edge {
		Vertex first;
		Vertex second;
	}
	public static class Graph {

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
		public int areTwoVerticesConnected(String first, String second,HashMap<String, Boolean> map) {
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
				if(removedVertice.equals(second)) {
					countMet++;
					//continue;
				} else {
					areTwoVerticesConnected(first, second, map)
				}
				ArrayList<String> adjacentList=getAdjacent(removedVertice);
				for(String str:adjacentList) {
					//if(!map.containsKey(str))
						queue.enqueue(str);
				}
				if(adjacentList.size()==0) {
					countMet++;
				}
				if(queue.isEmpty()) {
					return countMet;
				}
			}
			return countMet;
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
						//						if(map.get(vert)==null) {
						queue.enqueue(vert);
						//map.put(vert, true);
						//						}
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








	}











	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();

		Scanner s =new Scanner(System.in);

		int t=s.nextInt();

		for(int test=0;test<t;test++) {
			countMet=0;
			int n=s.nextInt();
			String start=s.next();
			String end=s.next();
			for(int j=1;j<=n;j++) {
				g.addVertex(j+"");
			}
			for(int i=1;i<n;i++) {
				int edgea=s.nextInt();
				int edgeb=s.nextInt();
				g.addEdge((edgea+""),(edgeb+""));
			}
			HashMap<String, Boolean> map=new HashMap<String, Boolean>();
			System.out.println(g.areTwoVerticesConnected(start, end, map));

		}

	}

}
