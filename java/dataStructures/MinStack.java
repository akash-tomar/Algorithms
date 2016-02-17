package dataStructures;

public class MinStack {
	StackUsingLinkedList stack=new StackUsingLinkedList();
	StackUsingLinkedList stack1=new StackUsingLinkedList();
	int minElement;
	public MinStack() {
		// TODO Auto-generated constructor stub
		minElement=Integer.MAX_VALUE;
	}
	public int size() {
		return stack.size();
	}
 
	public boolean isEmpty() {
		if(stack.size()==0) 
			return true;
		else 
			return false;
	}
	int top() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return stack.top();
	}
	public void push(int newElement) {
		if(newElement<minElement) {
			minElement=newElement;
		}
		stack.push(newElement);
		if(stack1.size()==0) {
			stack1.push(newElement);
		}
		else {
			while(stack1.)
		}
	}
	public int pop() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int elementTobeDeleted=stack.pop();
		return elementTobeDeleted;
	}
	public int getMinimum() {
		return minElement;
	}


}
