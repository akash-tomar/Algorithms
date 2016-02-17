package dataStructures;

public class QueueUsingLinkedList {
	private Node<Integer> front,rear;
	private int size;
	public QueueUsingLinkedList() {
		// TODO Auto-generated constructor stub
		size=0;
		front=null;
		rear=null;
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		} else 
			return false;
	}
	int rear() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return rear.data;
	} 
	public void push(int newElement) {
		Node<Integer> newNode=new Node<Integer>();
		newNode.data=newElement;
		if(isEmpty()) {
			front=rear=newNode;
		} else {
			front.nextNode=newNode;
			front=newNode;
		}
		size++;
		
		
	}
	public int pop() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int elementTobeDeleted=rear.data;
		rear=rear.nextNode;
		size--;
		return elementTobeDeleted;
	}
}
