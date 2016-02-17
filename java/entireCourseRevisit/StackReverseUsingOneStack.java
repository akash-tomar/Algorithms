package entireCourseRevisit;

import java.util.Stack;

public class StackReverseUsingOneStack {
	
	public static Stack<Integer> recursionStack(Stack<Integer> stack,Stack<Integer> stack1) {
		if(stack1.size()==0) {
			return null;
		}
		
		
		
	}
	
	public static void stackReverse(Stack<Integer> stack1) {
		Stack<Integer> stack2=new Stack<Integer>();
		for(int i=0;i<stack1.size();i++) {
			stack2.push(stack1.pop());
		}
	}
}
