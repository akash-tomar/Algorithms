package study;

import java.util.ArrayList;

public class StackUsingArrayList {
	private ArrayList<Integer> head;
	private int size;
	public StackUsingArrayList() {
		head=new ArrayList<Integer>();
		size=0;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	
	public void push(int data) {
		head.add(data);
		size++;
	}
	
	public int pop() {
		int temp=head.remove(head.size()-1);
		return temp;
	}
}
