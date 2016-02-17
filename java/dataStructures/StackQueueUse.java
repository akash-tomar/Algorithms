package dataStructures;

public class StackQueueUse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5};
		//		StackUsingLinkedList stack = new StackUsingLinkedList();
		//		for(int i=0;i<arr.length;i++) {
		//			stack.push(arr[i]);
		//		}
		//		while(!stack.isEmpty()) {
		//			try {
		//				System.out.println(stack.pop());
		//			} catch (StackEmptyException e) {
		//				System.out.println("Empty Stack");
		//			}
		//		}
		//		
		//		stack.push(10);
		//		try {
		//			System.out.println(stack.top());
		//		} catch (StackEmptyException e) {
		//			System.out.println("Empty stack");
		//		}


		//    queue implementation
		//		QueueUsingLinkedList queue= new QueueUsingLinkedList();
		//		for(int i=0;i<arr.length;i++) {
		//			queue.push(arr[i]);
		//		}
		//		try {
		//			System.out.println(queue.rear());
		//		} catch (StackEmptyException e1) {
		//			System.out.println("Empty");
		//		}
		//		while(!queue.isEmpty()) {
		//			try {
		//				System.out.println(queue.pop());
		//			} catch (StackEmptyException e) {
		//				System.out.println("Empty");
		//			}
		//		}	



		//		// queue using array
		//		QueueUsingArray queue=new QueueUsingArray(arr.length);
		//		for(int i=0;i<arr.length;i++) {
		//			queue.push(arr[i]);
		//		}
		//		try {
		//			System.out.println(queue.rear());
		//		} catch (StackEmptyException e1) {
		//			System.out.println("Empty");
		//		}
		//		while(!queue.isEmpty()) {
		//			try {
		//				System.out.println(queue.pop());
		//			} catch (StackEmptyException e) {
		//				System.out.println("Empty");
		//			}
		//		}




		//		//    Dynamic array queue implementation
		//		DynamicArrayStack queue=new DynamicArrayStack();
		//		for(int i=0;i<arr.length;i++) {
		//			queue.push(arr[i]);
		//		}
		//		while(!queue.isEmpty()) {
		//			try {
		//				System.out.println(queue.pop());	
		//			} catch (StackEmptyException e) {
		//				System.out.println("Empty");
		//			}
		//		}
		//		for(int i=0;i<arr.length;i++) {
		//			queue.push(arr[i]);
		//		}
		//		queue.push(6);
		//		while(!queue.isEmpty()) {
		//			try {
		//				System.out.println(queue.pop());
		//			} catch (StackEmptyException e) {
		//				System.out.println("Empty");
		//			}
		//		}	





		//		//  stack using 2 queues
		//		StackUsingTwoQueues stack=new StackUsingTwoQueues();
		//		for(int i=0;i<arr.length;i++) {
		//			stack.push(arr[i]);
		//		}
		//		while(!stack.isEmpty()) {
		//			try {
		//				System.out.println(stack.pop());
		//			} catch (StackEmptyException e) {
		//				// TODO Auto-generated catch block
		//				e.printStackTrace();
		//			}
		////		}
		
		
		
		
		//    queue using 2 stacks.
		QueueUsingTwoStacks queue =new QueueUsingTwoStacks();
		for(int i=0;i<arr.length;i++) {
			queue.push(arr[i]);
		}
		
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
