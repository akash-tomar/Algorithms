package study;

import study.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	private HashMap<String, Vertex> vertices;
	private HashMap<String, Edge> edges;
	public Graph() {
		vertices = new HashMap<String, Vertex>();
		edges = new HashMap<String, Edge>();
	}

	public void addVertex(String name) {
		if(vertices.containsKey(name)) {
			return;
		}
		Vertex v = new Vertex(name);
		
		vertices.put(name, v);
	}

	public void printGraph() {
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		for(Vertex v : allVertices) {
			v.printAllAdjacentVertices();
		}
	}

	public void addEdge(String first,String second,int weight) {
		if(!vertices.containsKey(first)) {
			return;
		}
		if(!vertices.containsKey(second)) {
			return;
		}
		Vertex f = vertices.get(first);
		Vertex s = vertices.get(second);
		if(f.isAdjacent(s)) {
			return;
		}
		Edge e = new Edge();
		e.first=f;
		e.second=s;
		e.weight=weight;
		f.addEdge(e);
		s.addEdge(e);
		edges.put(first+second, e);
	}

	public void removeVertex(String name) {
		if(!vertices.containsKey(name)) {
			return;
		}
		Vertex v = vertices.get(name);
		vertices.remove(name);
		ArrayList<Vertex> list = v.getAdjacentVertices();
		for(Vertex vert : list) {
			vert.removeEdgeFrom(v);
		}
	}

	public void removeEdge(String first,String second) {
		if(!vertices.containsKey(first) || !vertices.containsKey(second)) {
			return;
		}

		Vertex f = vertices.get(first);
		Vertex s = vertices.get(second);

		f.removeEdgeFrom(s);
		s.removeEdgeFrom(f);
		if(edges.containsKey(first+second)) {
			edges.remove(first+second);
		} else {
			edges.remove(second+first);
		}
	}

	public ArrayList<String> getAdjacentVertices(String name) {
		if(!vertices.containsKey(name)) {
			return null;
		}
		ArrayList<String> output = new ArrayList<String>();
		Vertex v = vertices.get(name);
		ArrayList<Vertex> vert = v.getAdjacentVertices();
		for(Vertex ve : vert) {
			output.add(ve.name);
		}
		return output;
	}

	public int getDegree(String name) {
		if(!vertices.containsKey(name)) {
			return -1;
		}
		Vertex v = vertices.get(name);
		return v.degreeOfVertex();
	}

	public int numberOFVertices() {
		return vertices.size();
	}

	public int numberOfEdges() {
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		int count = 0;
		for(Vertex v : allVertices) {
			count+=v.degreeOfVertex();
		}
		return count/2;
	}

	public boolean areTwoVerticesConnected(String first,String second) {
		if(!vertices.containsKey(first) || !vertices.containsKey(second)) {
			return false;
		}

		Vertex f = vertices.get(first);
		Vertex s = vertices.get(second);

		HashMap<String, Boolean> map = new HashMap<String, Boolean>();

		map.put(f.name, true);

		ArrayList<Vertex> listOfConnectedVertices = f.getAdjacentVertices();
		for(Vertex v :listOfConnectedVertices) {
			if(v == s) {
				return true;
			}
			if(!map.containsKey(v.name)) {
				ArrayList<Vertex> sub = v.getAdjacentVertices();
				for(Vertex ve :sub) {
					if(!map.containsKey(ve.name)) {
						listOfConnectedVertices.add(ve);
						map.put(ve.name, true);
					}
				}
			}
			listOfConnectedVertices.remove(v);
		}
		return false;
	}

	public boolean isConnectedGraph() {
		int verticeCount = 0;
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		Vertex startingVertex = allVertices[0];
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.add(startingVertex);
		HashMap<Vertex, Boolean> map = new HashMap<Vertex, Boolean>();
		map.put(startingVertex, true);
		while(!queue.isEmpty()) {
			Vertex v = queue.remove();
			verticeCount++;
			ArrayList<Vertex> list = v.getAdjacentVertices();
			for(Vertex ve:list) {
				if(!map.containsKey(ve)) {
					queue.add(ve);
					map.put(ve, true);
				}
			}
		}
		if(verticeCount != allVertices.length) {
			return false;
		}
		return true;
	}

	public ArrayList<Vertex> graphComponents() {
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		Queue<Vertex> queue = new LinkedList<Vertex>();
		HashMap<Vertex, Boolean> map = new HashMap<Vertex, Boolean>();
		ArrayList<Vertex> ans = new ArrayList<Vertex>();
		for(int i=0;i<allVertices.length;i++) {
			if(!map.containsKey(allVertices[i])) {
				ans.add(allVertices[i]);
				map.put(allVertices[i], true);
				queue.add(allVertices[i]);
			}
			while(!queue.isEmpty()) {
				Vertex v = queue.remove();
				ArrayList<Vertex> list = v.getAdjacentVertices();
				for(Vertex ve:list) {
					if(!map.containsKey(ve)) {
						queue.add(ve);
						map.put(ve, true);
					}
				}
			}
		}
		return ans;
	}
	
	
	public void BFS() {
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		HashMap<Vertex, Boolean> isVisited = new HashMap<Vertex, Boolean>();
		HashMap<Vertex, Integer> distanceFromSource = new HashMap<Vertex, Integer>();
		for(Vertex v : allVertices) {
			isVisited.put(v, false);
		}
		Queue<Vertex> queue = new LinkedList<Vertex>();
		ArrayList<Vertex> listOfSources = graphComponents();
		for(int i = 0;i < listOfSources.size();i++) {
			queue.add(listOfSources.get(i));
			isVisited.put(listOfSources.get(i), true);
			distanceFromSource.put(listOfSources.get(i), 0);
			while(!queue.isEmpty()) {
				Vertex v = queue.remove();
				ArrayList<String> list = getAdjacentVertices(v.name);
				for(String str: list) {
					if( !isVisited.get((vertices.get(str))) ) {
						isVisited.put(vertices.get(str), true);
						distanceFromSource.put(vertices.get(str), distanceFromSource.get(v)+1);
						queue.add(vertices.get(str));
					}
				}
			}
		}
		
		
		for(Vertex v : allVertices) {
			System.out.println(v.name+" "+isVisited.get(v)+" "+distanceFromSource.get(v));
		}
		
	}
	
	public void DFS() {
		HashMap<Vertex, Integer> startTime = new HashMap<Vertex, Integer>();
		HashMap<Vertex, Integer> endTime = new HashMap<Vertex, Integer>();
		HashMap<Vertex, Boolean> isVisited = new HashMap<Vertex, Boolean>();
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		for(Vertex v: allVertices) {
			isVisited.put(v, false);
		}
		Queue<Vertex> queue = new LinkedList<Vertex>();
		ArrayList<Vertex> listOfSouces = graphComponents();
		for(int i=0;i<listOfSouces.size();i++) {
			queue.add(listOfSouces.get(i));
			isVisited.put(listOfSouces.get(i), true);
			startTime.put(listOfSouces.get(i), 0);
			while(!queue.isEmpty()) {
				Vertex v = queue.remove();
				
			}
		}
	}
	public int getWeight(String first,String second) {
		if(first.equals(second)) {
			return 0;
		}
		if (edges.containsKey(first+second)) {
			return (edges.get(first+second)).weight;
		} else if(edges.containsKey(second+first)) {
			return (edges.get(second+first)).weight;
		} else {
			return Integer.MIN_VALUE;
		}
		
	}
	public void dijkstras(String source) {
		HashMap<Vertex, Integer> distanceFromSource = new HashMap<Vertex, Integer>();
		HashMap<Vertex, Vertex> getParentNode = new HashMap<Vertex, Vertex>();
		Vertex[] allVertices = vertices.values().toArray(new Vertex[0]);
		for(Vertex v :allVertices) {
			distanceFromSource.put(v, Integer.MAX_VALUE);
			getParentNode.put(v, null);
		}
		distanceFromSource.put(vertices.get(source), 0);
		
		ArrayList<Vertex> list = new ArrayList<Vertex>();
		for(Vertex v : allVertices) {
			list.add(v);
		}
		
		while(list.size()!=0) {
			Vertex minVert=list.get(0);
			for(Vertex v:list) {
				if( distanceFromSource.get(v) < distanceFromSource.get(minVert) ) {
					minVert = v;
				}
			}
			list.remove(minVert);
			ArrayList<String> listOfAdjVert = getAdjacentVertices(minVert.name);
			for(String str: listOfAdjVert) {
				int di=distanceFromSource.get(minVert)+getWeight(minVert.name, str);
				if(distanceFromSource.get(vertices.get(str)) > di) {
					distanceFromSource.put(vertices.get(str),di );
					getParentNode.put(vertices.get(str), minVert);
				}
			}
		}
		for(Vertex v :allVertices) {
			System.out.println(v.name+" : Dist- "+distanceFromSource.get(v));
		}
	}
}
