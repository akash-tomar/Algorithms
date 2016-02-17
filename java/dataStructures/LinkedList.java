package dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class LinkedList {

	/**
	 * @param args
	 */
	
	public static Node<Integer> insertList() {
		Node<Integer> head=null;	
		Node<Integer> prevNode=null;
		int val;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the node value : ");
		val=s.nextInt();
		while(val!=-1) {
			Node<Integer> newNode=new Node<Integer>();
			newNode.data=val;
			newNode.nextNode=null;
			
			if(head==null) {
				head=newNode;
				
			}
			else
				prevNode.nextNode=newNode;
			prevNode=newNode;
			val=s.nextInt();
			
			
		}
		//s.close();
		return head;
	}
	
	public static void insertAfter(int value,int nodeValue,Node<Integer> head) {
//		System.out.println("Enter value to be added : ");
//		Scanner s = new Scanner(System.in);
//		int value;
//		value=s.nextInt();
		Node<Integer> currentNode=head;
		while(currentNode.data!=nodeValue) {
			currentNode=currentNode.nextNode;
		}
		Node<Integer> newNode=new Node<Integer>();
		newNode.data=value;
		newNode.nextNode=currentNode.nextNode;
		currentNode.nextNode=newNode;
		//s.close();
		
		
	}
	
	public static void printList(Node<Integer> head) {
		Node<Integer> currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.nextNode;
		}
	}
	
	public static Node<Integer> deletionInList(Node<Integer> head,int value) {
		Node<Integer> currentNode=head;
		Node<Integer> prevNode=null;
		while(currentNode.data!=value) {
			prevNode=currentNode;
			currentNode=currentNode.nextNode;
		}
		if(currentNode==head) {
			head=head.nextNode;
		}
		else
			prevNode.nextNode=currentNode.nextNode;
		return head;
		
	}
	
	public static Node<Integer> swapTwoNodes(Node<Integer> head,int valOne,int valTwo) {
		Node<Integer> valueOne=head;
		Node<Integer> valueTwo=head;
		Node<Integer> prevOne=null;
		Node<Integer> prevTwo=null;
		while(valueOne.data!=valOne){
			prevOne=valueOne;
			valueOne=valueOne.nextNode;
		}
		while(valueTwo.data!=valTwo) {
			prevTwo=valueTwo;
			valueTwo=valueTwo.nextNode;
		}
		Node<Integer> nextOfTwo=valueTwo.nextNode;
		if(valueOne==head) {
			prevTwo.nextNode=valueOne;
			valueTwo.nextNode=valueOne.nextNode;
			valueOne.nextNode=nextOfTwo;
			head=valueTwo;
			
		}
		else if( valueTwo==valueOne.nextNode ) {
			prevOne.nextNode=valueTwo;
			valueTwo.nextNode=valueOne;
			valueOne.nextNode=nextOfTwo;
		}
		else {		
			prevOne.nextNode=valueTwo;
			valueTwo.nextNode=valueOne.nextNode;
			prevTwo.nextNode=valueOne;
			valueOne.nextNode=nextOfTwo;
		}
		
		
		return head;
	}
	
	
	public static int middleOfList(Node<Integer> head) {
		Node<Integer> currentNode=head;
		int length=0;
		while(currentNode!=null) {
			length++;
			currentNode=currentNode.nextNode;
		}
//		if(length%2!=0)
//			return length/2+1;
//		else
			return length/2;
		
		
	}
	
	
	public static int lengthOfList(Node<Integer> head) {
		Node<Integer> temp=head;
		int length=0;
		while(temp!=null) {
			temp=temp.nextNode;
			length++;
		}
		return length;
	}
	
	public static Node<Integer> bubbleSort(Node<Integer> head,int endIndex) {
		if(endIndex==0) {
			return head;
		}
		for(int i=0;i<endIndex;i++) {
			Node<Integer> arr=head;
			Node<Integer> arr1=head;
			Node<Integer> prevArr=null;
			int temp=0;
			while(temp!=i) {
				prevArr=arr;
				arr=arr.nextNode;				
				temp++;
			}
			arr1=arr.nextNode;
			if(arr.data>arr1.data) {
				if(arr==head) {
					arr.nextNode=arr1.nextNode;
					arr1.nextNode=arr;
					head=arr1;
				}
				else {
					prevArr.nextNode=arr1;
					arr.nextNode=arr1.nextNode;
					arr1.nextNode=arr;					
				}	
				
			}			
		}
		return bubbleSort(head, endIndex-1);
				
	}
	
	
	public static void fifthElementFromEndWithoutCalculatingLengthOfLinkedList(Node<Integer> head) {
		Node<Integer> slow;
		Node<Integer> fast;
		slow=head;
		fast=head.nextNode.nextNode.nextNode.nextNode.nextNode;
		while(fast!=null) {
			fast=fast.nextNode;
			slow=slow.nextNode;
		}
		System.out.println("Fifth last element is : "+slow.data);
	}
	
	
	public static Node<Integer> mergeSortDivider( Node<Integer> head ) {
		int mid=middleOfList(head);
		Node<Integer> head1=null;
		Node<Integer> head2=null;
		Node<Integer> temp=head;
		if(mid==0) {
			return head;
		}
		int t=0;
		while(t<mid) {
			head1=inseringNodes(head1, temp.data);
			temp=temp.nextNode;	
			t++;
		}
		while(temp!=null) {
			head2=inseringNodes(head2, temp.data);
			temp=temp.nextNode;
		}
		head1=mergeSortDivider(head1);
		head2=mergeSortDivider(head2);
		head=merge(head1, head2);
		return head;
	}
	
	
	public static Node<Integer>inseringNodes (Node<Integer> head,int data) {
		if(head==null) {
			head=new Node<Integer>();
			head.data=data;
			head.nextNode=null;
		}
		else {
			Node<Integer> temp=head;
			while(temp.nextNode!=null) {
				temp=temp.nextNode;
			}
			Node<Integer> newNode=new Node<Integer>();

			newNode.data=data;
			newNode.nextNode=null;
			temp.nextNode=newNode;			
			
		}
		return head;
	}
	
	public static Node<Integer> merge( Node<Integer> head1, Node<Integer> head2 ) {
		Node<Integer> head3=null;
		Node<Integer> temp1=head1;
		Node<Integer> temp2=head2;
		int length=lengthOfList(head1)+lengthOfList(head2);
		int t=0;
		while(t<length) {
			if(temp1!=null && temp2!=null) {
				if(temp1.data<temp2.data) {
					head3=inseringNodes(head3, temp1.data);
					temp1=temp1.nextNode;
				}
				else if(temp2.data<temp1.data) {
					head3=inseringNodes(head3, temp2.data);
					temp2=temp2.nextNode;
				}
			}
			else if(temp1==null) {
				head3=inseringNodes(head3, temp2.data);
				temp2=temp2.nextNode;
			}
			else if(temp2==null) {
				head3=inseringNodes(head3, temp1.data);
				temp1=temp1.nextNode;
			}
			t++;
		}
		 
		return head3;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		Node<Integer> head1=insertList();
		//Node<Integer> head2=insertList();
//		printList(head);
//		int search,nodeValue;
//		System.out.println("Enter the nodeValue : ");
//		nodeValue=s.nextInt();
//		System.out.println("Enter the nodeValue after which it is to be inserted : ");
//		search=s.nextInt();
//		insertAfter(nodeValue,search, head);
//		printList(head);
//		s.close();
//		System.out.println("Enter value to be deleted : ");
//		int value=s.nextInt();
//		head=deletionInList(head, value);
//		printList(head);
		
//		System.out.println("Enter the first node value to be swapped : ");
//		int valOne=s.nextInt();
//		System.out.println("Enter the second node value to be swapped : ");
//		int valTwo=s.nextInt();
//		head=swapTwoNodes(head, valOne, valTwo);
//		printList(head);
		
		int mid=middleOfList(head1);
		System.out.println("Middle is at : "+mid);
	
//		int endIndex=lengthOfList(head);
//		head=bubbleSort(head, endIndex-1);
//		printList(head);
//		fifthElementFromEndWithoutCalculatingLengthOfLinkedList(head);
		
		//Node<Integer> head3=merge(head1,head2);
//		head1=mergeSortDivider(head1);
//		printList(head1);
		

	}

}
