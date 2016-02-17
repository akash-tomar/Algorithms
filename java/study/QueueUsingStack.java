package study;

public class QueueUsingStack<T> {
	private StackUsingLL<T> stackForPush;
	private StackUsingLL<T> stackForPop;
	private int size=0;

	public QueueUsingStack() {
		stackForPop=new StackUsingLL<T>();
		stackForPush=new StackUsingLL<T>();
		size=0;
	}

	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}

	public void push(T data) {
		if(!this.isEmpty()) {
			if(!stackForPush.isEmpty()) {
				stackForPush.push(data);
			}
			else {
				while(!stackForPop.isEmpty()) {
					stackForPush.push(stackForPop.pop());
				}
				stackForPush.push(data);
			}
		} else {
			stackForPush.push(data);
		}
		size++;
	}
	
	public T pop() {
		if(!this.isEmpty()) {
			if(!stackForPush.isEmpty()) {
				while(!stackForPush.isEmpty()) {
					stackForPop.push(stackForPush.pop());
				}
			}
			T del=stackForPop.pop();
			size--;
			return del;
		} 
		return null;
	}
}
