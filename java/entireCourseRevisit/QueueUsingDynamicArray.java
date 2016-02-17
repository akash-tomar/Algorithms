package entireCourseRevisit;

public class QueueUsingDynamicArray {
	private DynamicArray arr;
	private int size;
	private int front;
	public QueueUsingDynamicArray() {
		arr=new DynamicArray();
		size=0;
		front=-1;
	}
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	public int front() {
		try {
			return arr.get(front);
		} catch (EmptyException e) {
			System.out.println("empty");
		}
		return -1;
	}
	public void enqueue(int data) {
		arr.put(data);
		size++;
		if(front==-1) {
			front=0;
			return;
		}
	}
	
	public int dequeue() {
		front++;
		size--;
		try {
			return arr.get(front-1);
		} catch (EmptyException e) {
			System.out.println("empty");
		}
		return -1;
	}
	
}
