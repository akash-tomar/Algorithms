package entireCourseRevisit;

import java.util.Scanner;

public class LinkedListRevise {

	public static Node<Integer> getList() {
		Node<Integer> head=null;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the first value: ");
		int value=s.nextInt();
		Node<Integer> lastNode=head;
		while(value!=-1) {
			Node<Integer> newNode=new Node<Integer>();
			newNode.data=value;
			newNode.next=null;
			if(head==null) {
				head=newNode;
			} else {
				lastNode.next=newNode;
			}
			lastNode=newNode;
			System.out.println("Enter next value");
			value=s.nextInt();
		}
		return head;
	}

	public static void printList(Node<Integer> head) {
		Node<Integer> currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}

	public static void insertAfter(int valueToBeInserted,int valueOfNode,Node<Integer> head) {
		Node<Integer> currentNode=head;
		while(currentNode.data!=valueOfNode) {
			currentNode=currentNode.next;
		}
		Node<Integer> newNode=new Node<Integer>();
		newNode.data=valueToBeInserted;
		newNode.next=currentNode.next;
		currentNode.next=newNode;
	}

	public static int deletionInList(int value,Node<Integer> head) {
		if(head.data==value) {
			head=head.next;
			return value;
		}

		Node<Integer> prev=null;
		Node<Integer> current=head;
		while(current.data!=value) {
			prev=current;
			if(current.next==null)
				return -1;
			current=current.next;

		}
		prev.next=current.next;
		return value;


	}


	public static void swapNodes(int value1,int value2,Node<Integer> head) {
		Node<Integer> node1=head;
		Node<Integer> node2=head;
		Node<Integer> prev1=null;
		Node<Integer> prev2=null;
		while(node1.data!=value1) {
			prev1=node1;
			node1=node1.next;
		}
		while(node2.data!=value2) {
			prev2=node2;
			node2=node2.next;
		}
		if(node1==head) {
			if(node1.next==node2) {
				node1.next=node2.next;
				node2.next=node1;
				head=node2;
			}
		}

		if(node2==head) {
			if(node2.next==node1) {
				node2.next=node1.next;
				node1.next=node2;
				head=node1;
			}
		}

		if(node1.next==node2) {
			prev1.next=node2;
			node1.next=node2.next;
			node2.next=node1;
		}

		if(node2.next==node1) {
			prev2.next=node1;
			node2.next=node1.next;
			node1.next=node2;
		}

		Node<Integer> temp=node1.next;
		node1.next=node2.next;
		node2.next=temp;
		prev1.next=node2;
		prev2.next=node1;

	}


	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		Node<Integer> prev=null;
		Node<Integer> current=head;
		while(current!=null) {
			if(prev!=null)
				if(prev.data==current.data) {
					current=current.next;
					prev.next=current;
					continue;
				}
			prev=current;
			current=current.next;
		}
		return head;
	}


	public static void main(String[] args) {
		Node<Integer> head=getList();
		printList(head);
		/*insertAfter(5, 4, head);
		printList(head);
		deletionInList(5, head);
		printList(head);*/
		System.out.println("duplicate: ");
		head=removeDuplicates(head);
		printList(head);
	}

}
