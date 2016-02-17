package entireCourseRevisit;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {
	public static Queue<Integer> reverse(Queue<Integer> q) {
		if(q.size()==0) {
			return new LinkedList<Integer>();
		}
		int temp=q.remove();
		q=reverse(q);
		q.add(temp);
		return q;
	}
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(4);
		q.add(3);
		q.add(2);
		q.add(1);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.remove());
		q.add(0);
		q.add(-1);
		q.add(-2);
		q=reverse(q);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}
}
