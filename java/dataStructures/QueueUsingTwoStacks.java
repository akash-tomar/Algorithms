package dataStructures;

public class QueueUsingTwoStacks {
	private StackUsingLinkedList stack1=new StackUsingLinkedList();
	private StackUsingLinkedList stack2 =new StackUsingLinkedList();
	public int size() {
		return stack1.size();
	}
	
	public boolean isEmpty() {
		if(stack1.size()==0) {
			return true;
		} else 
			return false;
	}
	int rear() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return stack1.top();
	} 
	public void push(int newElement) {
		stack1.push(newElement);				
	}
	
	public int pop() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int elementTobeDeleted;
		while(stack1.size()!=1) {
			stack2.push(stack1.pop());
			
		}
		elementTobeDeleted=stack1.pop();
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return elementTobeDeleted;
	}

}
