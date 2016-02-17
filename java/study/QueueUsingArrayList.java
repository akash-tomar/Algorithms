package study;

import java.util.ArrayList;

public class QueueUsingArrayList {
	ArrayList<Integer> front;
	int size;

	public QueueUsingArrayList() {
		front=new ArrayList<Integer>();
		size=0;
	}

	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}

	public void push(int data) {
		front.add(data);
		size++;
	}

	public int pop() {
		int del=front.remove(0);
		return del;
	}
}
