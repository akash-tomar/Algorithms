package study;

public class QueueUse {
	public static void main(String[] args) {
		/*QueueUsingStack<Integer> que=new QueueUsingStack<Integer>();
		que.push(1);
		que.push(2);
		System.out.println(que.pop());
		que.push(0);
		que.push(3);
		System.out.println(que.pop());
		que.push(4);
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());*/
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addAtBeg(2);
		l.addAtEnd(3);
		l.addAtEnd(5);
		l.addAtBeg(1);
		l.addAfterIndex(4, 3);
		System.out.println(l.deletion(1));
		System.out.println(l.deletion(2));
		System.out.println(l.deletion(2));
		System.out.println(l.deletion(2));
		System.out.println(l.deletion(1));
		
		
	}
}
