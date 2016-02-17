package dataStructures;

public class ReverseQueueUsingRecursion {

	public static QueueUsingLinkedList reverseQueueRecursion(QueueUsingLinkedList queue) {
		if(queue.size()==1) {
			QueueUsingLinkedList temp=new QueueUsingLinkedList();
			try {
				temp.push(queue.rear());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return temp;
		}
		
		int element=-1;
		try {
			element=queue.pop();
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		queue=reverseQueueRecursion(queue);
		queue.push(element);
		return queue;
		
		
		
	}



	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		int[] arr={1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			queue.push(arr[i]);
		}
		queue=reverseQueueRecursion(queue);
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
