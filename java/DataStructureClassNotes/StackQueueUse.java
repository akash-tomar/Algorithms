package DataStructureClassNotes;

public class StackQueueUse {

	public static boolean isExpressionBalanced(String s) {
		StackUsingLL stack = new StackUsingLL();
		for (int i =0; i < s.length(); i++) {
			try {
				if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
					stack.push(s.charAt(i));
				} else if (s.charAt(i) == '}') {
					if (stack.top() == '{') {
						stack.pop();
					} else {
						return false;
					}
				}else if (s.charAt(i) == ']') {
					if (stack.top() == '[') {
						stack.pop();
					} else {
						return false;
					}
				} else if (s.charAt(i) == ')') {
					if (stack.top() == '(') {
						stack.pop();
					} else {
						return false;
					}
				}
			}
			catch(StackEmptyException e) {
				return false;
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
		
	}
	
	public void reverseStack(StackUsingLL s) {
		StackUsingLL s1 = new StackUsingLL();
		StackUsingLL s2 = new StackUsingLL();
		while (!s.isEmpty()) {
			try {
				s1.push(s.pop());
			} catch (StackEmptyException e) {
				// Not possible
			}
		}
		
		while (!s1.isEmpty()) {
			try {
				s2.push(s1.pop());
			} catch (StackEmptyException e) {
				// Not possible
			}
		}
		
		while (!s2.isEmpty()) {
			try {
				s.push(s2.pop());
			} catch (StackEmptyException e) {
				// Not possible
			}
		}
	}

	public static void main(String[] args) throws QueueEmptyException, QueueFullException {
		// TODO Auto-generated method stub
//		int[] a = {1,2,3,4,5};
//		StackUsingLL s = new StackUsingLL();
//
//		for (int i =0; i < a.length; i++) {
//			s.push(a[i]);
//		}
//
//		while(!s.isEmpty()) {
//			try {
//				System.out.println(s.pop());
//			} catch (StackEmptyException e) {
//				// Cant come here
//				System.out.println("Cant come here");
//			}
//		}
		int[] a = {1,2,3,4,5};
		QueueUsingArray q = new QueueUsingArray();
		for (int i =0; i < a.length; i++) {
			try {
				q.enqueue(a[i]);
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(q.dequeue());
		q.enqueue(10);

		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}

	}

}
