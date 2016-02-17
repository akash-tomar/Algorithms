package study;

public class StackUsingLL<T> {
	private NodeForStack<T> top;
	int size;

	public StackUsingLL() {
		top=null;
		size=0;
	}

	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}

	public void push(T data) {
		NodeForStack<T> ptr=new NodeForStack<T>();
		ptr.data=data;
		ptr.next=top;
		top=ptr;
		size++;
	}
	
	public T pop() {
		if(this.isEmpty()) {
			return null;
		}
		T data=top.data;
		top=top.next;
		size--;
		return data;
	}
}
