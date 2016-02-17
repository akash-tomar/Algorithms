package entireCourseRevisit;

import java.util.LinkedList;
import java.util.Queue;

import dataStructures.QueueUsingLinkedList;

public class stackUsingTwoQueue<T> {
	Queue<T> q1;
	Queue<T> q2;
	
	int size;
	
	public stackUsingTwoQueue() {
		q1=new LinkedList<T>();
		q2=new LinkedList<T>();
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}
	
	public void push(T data) {
		
	}
	
}
