package dataStructures;

public class ReverseStackUsingOnlyOneStack {

	public static StackUsingLinkedList stackReverse(StackUsingLinkedList stack,StackUsingLinkedList stack2) {
		if(stack.size()==1) {
		
			return stack;
		}


		int top =0;
		try {
			top=stack.pop();
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stack=stackReverse(stack, stack2);
		while(!stack.isEmpty()) {
			try {
				stack2.push(stack.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		stack2.push(top);
		while(!stack2.isEmpty()) {
			try {
				stack.push(stack2.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return stack;		
	}


	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		int[] arr={1,2,3,4,5,6,7,8,0};
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		StackUsingLinkedList stack2=new StackUsingLinkedList();
		stack=stackReverse(stack, stack2);
		while(!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
