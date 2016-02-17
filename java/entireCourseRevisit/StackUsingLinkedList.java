package entireCourseRevisit;

public class StackUsingLinkedList<T> {
	int size;

	Node<T> top;

	public StackUsingLinkedList() {
		size=0;
		top=new Node<T>();
	}

	boolean isEmpty() {
		if(size==0) 
			return true;
		return false;
	}

	T top() throws StackEmptyException {
		if(size==0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}	
		return top.data;
	}

	void push(T data) {
		Node<T> newNode=new Node<T>();
		newNode.data=data;
		if(top==null) {
			newNode.next=null;
			top=newNode;
			return;
		}
		newNode.next=top;
		top=newNode;
		size++;
	}
	
	T pop() throws StackEmptyException{
		if(size==0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		T data=top.data;
		top=top.next;
		size--;
		return data;
	}



}
