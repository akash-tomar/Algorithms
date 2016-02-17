package dataStructures;

public class QueueUsingArray {
	int[] queue;
	int front,rear;
	int size;
	public QueueUsingArray(int size){
		queue=new int[size];
		front=rear=-1;
		size=0;
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
		return queue[rear];
	} 
	public void push(int newElement) {
		front++;
		if(isEmpty()) {
			queue[front]=newElement;
			rear=front;
		}
		else
			queue[front]=newElement;
		size++;		
	}
	public int pop() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int elementTobeDeleted=queue[rear];
		rear++;
		size--;
		return elementTobeDeleted;
	}
	

}
