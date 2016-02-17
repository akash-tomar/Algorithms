package study;

public class QueueUsingLL<T> {
	NodeForStack<T> front;
	NodeForStack<T> rear;
	int size;

	public QueueUsingLL() {
		front=null;
		rear=null;
		size=0;
	}

	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}

	public void push(T data) {
		NodeForStack<T> newNode=new NodeForStack<T>();
		newNode.data=data;
		newNode.next=null;
		if(this.isEmpty()) {
			front=rear=newNode;
		} else {
			rear.next=newNode;
			rear=newNode;
		}
		size++;
	}

	public T pop() {
		T del=front.data;
		front=front.next;
		size--;
		return del;
	}
}
