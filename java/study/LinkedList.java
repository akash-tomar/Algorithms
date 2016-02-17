package study;

public class LinkedList<T> {
	private NewNode<T> head;
	private int size;

	public LinkedList() {
		head=null;
		size=0;
	}

	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}

	public void addAtBeg(T data) {
		NewNode<T> newNode = new NewNode<T>();
		newNode.data=data;
		newNode.next=null;
		size++;
		if(this.isEmpty()) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		return;
	}
	
	public void addAtEnd(T data) {
		NewNode<T> newNode = new NewNode<T>();
		newNode.data=data;
		newNode.next=null;
		size++;
		if(this.isEmpty()) {
			head=newNode;
			return;
		}
		NewNode<T> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		return;
	}
	
	public void addAfterIndex(T data,int index) {
		NewNode<T> newNode = new NewNode<T>();
		newNode.data=data;
		newNode.next=null;
		size++;
		if(this.isEmpty()) {
			head=newNode;
			return;
		}
		NewNode<T> temp=head;
		int count=1;
		while(temp.next!=null && count<index) {
			temp=temp.next;
			count++;
		}
		NewNode<T> tempNode=temp.next;
		temp.next=newNode;
		newNode.next=tempNode;
		return;
	}
	
	public T deletion(int index) {
		if(this.isEmpty()) {
			return null;
		}
		size--;
		NewNode<T> temp=head;
		int count=1;
		if(index==1) {
			T del=(T) temp.data;
			if(temp.next!=null) 
				temp.next=temp.next.next;
			else 
				temp=null;
		}
		while(temp.next!=null && count<index-1) {
			temp=temp.next;
			count++;
		}
		if(temp.next==null) {
			return null;
		}
		T del=(T) temp.next.data;
		temp.next=temp.next.next;
		return del;
	}
}











