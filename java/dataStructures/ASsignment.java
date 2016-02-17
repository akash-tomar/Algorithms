package dataStructures;

import java.util.Scanner;

public class ASsignment {

	/**
	 * @param args
	 */
	
	
	public static Node<Integer> deleteFromPos(Node<Integer> head,int pos) {
		if(pos==1) {
			head=head.nextNode;
			return head;
		}
		else if(pos==LinkedList.lengthOfList(head)) {
			Node<Integer> temp=head;
			while(temp.nextNode.nextNode!=null) {
				temp=temp.nextNode;
			}
			temp.nextNode=null;
			return head;
		}
		else {
			Node<Integer> temp=head;
			int poss=2;
			while(poss!=pos){
				temp=temp.nextNode;
				poss++;
			}			
			temp.nextNode=temp.nextNode.nextNode;
			return head;
		}
	}
	
	
	public static void removeDuplicates(Node<Integer> head) {
		
		int[] arr=new int[1000];
		Node<Integer> temp=head;
		int max=0;
		int pos=0;
		while(temp!=null) {
			pos++;
			if(arr[temp.data]!=1) {
				arr[temp.data]=1;
				if(temp.data>max) {
					max=temp.data;
				}
			}
			else if(arr[temp.data]==1) {
				head=deleteFromPos(head,pos); 
			}
			temp=temp.nextNode;
		}
		
		
	}
	
//	public static boolean isPallindromeList(Node<Integer> head) {
//		Node<Integer> temp=head;
//		while(temp.nextNode!=null) {
//			temp=temp.nextNode;
//		}
//		
//		
//	}
	
	
	public static Node<Integer> reverseList(Node<Integer> head,int index) {
		int count=0;
		Node<Integer> temp1=null;
		Node<Integer> temp2=head;
		Node<Integer> temp3=head.nextNode;
		while(count<index) {
			temp2.nextNode=temp1;
			temp1=temp2;
			temp2=temp3;
			temp3=temp3.nextNode;
			if(count==index) {
				head=temp2;
			}
			count++;
		}
		return head;
	}
	
	
	
	
//	public static void kreverse(Node<Integer> head,int k) {
//		for(int i=1;i<=LinkedList.lengthOfList(head);i+=k) {
//			
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Node<Integer> head=LinkedList.insertList();
		reverseList(head, LinkedList.lengthOfList(head));
//		removeDuplicates(head);
//		LinkedList.printList(head);
//		isPallindromeList(head);
		

	}

}
