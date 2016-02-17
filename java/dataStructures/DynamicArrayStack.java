package dataStructures;

public class DynamicArrayStack {
	private int arraySize;
	boolean first=true;
	private int[] firstStack;
	private int[] secondStack;
	private int top;
	private int size;
	public DynamicArrayStack() {
		// TODO Auto-generated constructor stub
		arraySize=5;
		firstStack=new int[arraySize];
		top=-1;
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
		
		if(first)		
			return firstStack[top];
		else
			return secondStack[top];
	}
	public void push(int newElement) {
		
		if(first) {
			if(size==firstStack.length) {
				secondStack=new int[2*firstStack.length];
				for(int i=0;i<firstStack.length;i++) {
					secondStack[i]=firstStack[i];
					
				}
				first=false;
				top++;
				secondStack[top]=newElement;
				size++;
			}
			else {
				top++;
				firstStack[top]=newElement;
				size++;
			}
		}
		else {
			if(size==secondStack.length) {
				firstStack=new int[2*secondStack.length];
				for(int i=0;i<secondStack.length;i++) {
					firstStack[i]=secondStack[i];
					
				}
				first=true;
				top++;
				firstStack[top]=newElement;
				size++;
			}
			else {
				top++;
				secondStack[top]=newElement;
				size++;
			}
			
		}
		
		
	}
	public int pop() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		
		int elementTobeDeleted;
		if(first) {
			elementTobeDeleted=firstStack[top];			
		}
		else {
			elementTobeDeleted=secondStack[top];			
		}
		top--;
		size--;
		return elementTobeDeleted;		
	}
	
	
}
