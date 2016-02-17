package dataStructures;

public class StackUsingLinkedList<T> {
	
	int size;
	private Node<T> head;
	public StackUsingLinkedList() {
		size=0;
		head=null;
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
	T top() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	public void push(T newElement) {
		Node<T> newNode=new Node<T>();
		newNode.data=newElement;
		newNode.nextNode=head;
		head=newNode;
		size++;
		
	}
	public T pop() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		T elementTobeDeleted=head.data;
		head=head.nextNode;
		size--;
		return elementTobeDeleted;
	}
	
}
