package dataStructures;

public class StackUsingTwoQueues {
	private QueueUsingLinkedList queue1=new QueueUsingLinkedList();
	private QueueUsingLinkedList queue2=new QueueUsingLinkedList();
	private int size;

	//private int top;
	public StackUsingTwoQueues() {
		size=0;

	}
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if(size==0) 
			return true;
		else 
			return false;
	}
	int top() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return queue1.rear();
	}
	public void push(int newElement) {
		queue1.push(newElement);
		size++;
	}
	public int pop() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int elementToBeDeleted;
		int sz=queue1.size();
		int temp=1;
		while(temp<sz) {
			if(queue1.size()!=1) {
				queue2.push(queue1.pop());
			}
			temp++;
		}
		elementToBeDeleted=queue1.pop();
		QueueUsingLinkedList temp1=queue1;
		queue1=queue2;
		queue2=temp1;
		size--;
		return elementToBeDeleted;
	}
}
