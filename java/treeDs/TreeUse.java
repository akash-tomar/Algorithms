package treeDs;

import java.util.Scanner;

import dataStructures.StackEmptyException;

public class TreeUse {
	
	public static TreeNode<Integer> takeTreeInput2() {
		QueueusingLL<TreeNode<Integer>> queue = new QueueusingLL<TreeNode<Integer>>();
		System.out.println("Enter root");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = queue.dequeue();
			} catch (StackEmptyException e) {
				// Cant reach here
				return null;
			}
			System.out.println("Enter number of children of " + currentNode.data);
			int numChildren = s.nextInt();
			for (int i =0; i < numChildren; i++) {
				System.out.println("Enter data for " + i + "th child of " + currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				currentNode.children.add(child);
				queue.enqueue(child);
			}
		}
		return root;
		
	}
	
	public static TreeNode<Integer> takeTreeInput() {
		System.out.println("Enter root");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		System.out.println("Enter number of children of " + rootData);
		int numChildren = s.nextInt();
		
		for (int i =0; i< numChildren; i++) {
			TreeNode<Integer> child = takeTreeInput();
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String rootString = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			rootString = rootString + root.children.get(i).data + ",";
		}
		System.out.println(rootString);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static void printAtK(TreeNode<Integer> root, int k) {
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		for (int i =0; i < root.children.size(); i++) {
			System.out.println("Calling " + root.children.get(i).data + " with " + (k-1));
			printAtK(root.children.get(i), k-1);
		}
	}
	
	public static int largestNode(TreeNode<Integer> root) {
		int max = root.data;
		
		for (int i =0; i < root.children.size(); i++) {
			int currentMax = largestNode(root.children.get(i));
			if (currentMax > max) 
				max = currentMax;
		}
		return max;
	}
	
	
	public static int numberOfTimes(TreeNode<Integer> root,int k) {
		int currentNode=root.data;
		int count=0;
		for(int i=0;i<root.children.size();i++) {
			count+=numberOfTimes(root.children.get(i), k);
		}
		if(currentNode==k) {
			count++;
		}
		return count;
	}
	
	public static int numberOfNodes(TreeNode<Integer> root) {
		
		int nodeCount=0;
		for(int i=0;i<root.children.size();i++) {
			nodeCount+=numberOfNodes(root.children.get(i));
		}
		nodeCount++;
		return nodeCount;
	}
	
	
	public static int sumOfNodes(TreeNode<Integer> root) {
		int sumSoFar=0;
		for(int i=0;i<root.children.size();i++) {
			sumSoFar+=sumOfNodes(root.children.get(i));
		}
		sumSoFar+=root.data;
		return sumSoFar;
	}
	
	public static int heightOfTree(TreeNode<Integer> root) {
		int heightSoFar=0;
		
		int height;
		for(int i=0;i<root.children.size();i++) {
			height=heightOfTree(root.children.get(i));
			if(height>heightSoFar) {
				heightSoFar=height;
			}
			
		}
		heightSoFar++;
		return heightSoFar;
		
	}
	
	
	public static int maxNoOfChildren(TreeNode<Integer> root) {
		int max=root.children.size();
		int maxSoFar=0;
		for(int i=0;i<root.children.size();i++) {
			maxSoFar=maxNoOfChildren(root.children.get(i));
			if(maxSoFar>max) {
				max=maxSoFar;
			}			
		}
		return max;		
	}
	
//	public static QueueusingLL<Integer> printLevelWise(TreeNode<Integer> root ) {
//		QueueusingLL<Integer> queue = new QueueusingLL<Integer>();
//		queue.enqueue(root.data);
//		QueueusingLL<Integer> queue1;// = new QueueusingLL<Integer>();
//
//		for(int i=0;i<root.children.size();i++) {
//			queue1=printLevelWise(root.children.get(i));
//			while(!queue1.isEmpty()){
//				try {
//					queue.enqueue(queue1.dequeue());
//				} catch (StackEmptyException e) {
//					System.out.println("Full");
//				}
//			}
//			
//		}
//		
//		
//		
//	}
	
	
	public static boolean isTreeIdentical(TreeNode<Integer> root1,TreeNode<Integer> root2) {
		if(root1.data==root2.data) {
			if(root1.children.size()==root2.children.size()) {
				boolean temp;
				for(int i=0;i<root1.children.size();i++) {
					temp= isTreeIdentical(root1.children.get(i), root2.children.get(i));
					if(temp==false){
						return false;
					}
				}
			}
			else
				return false;
		}
		else 
			return false;
		return true;
	}
	
	public static int justLargerThanN(TreeNode<Integer> root,int n) {
		int secondLargest=0;
		int largestSoFar=Integer.MAX_VALUE;
		if(root.data>n) {
			largestSoFar=root.data;
		}
		for(int i=0;i<root.children.size();i++) {
			secondLargest=justLargerThanN(root.children.get(i),n);
			if(secondLargest>n && secondLargest<largestSoFar) {
				largestSoFar=secondLargest;
			}
		}
		return largestSoFar;
		
	}
	
	public static int secondLargestValue(TreeNode<Integer> root) {
		int largest;
		int secondLargest;
		largest=root.data;
		int largestSoFar;
		secondLargest=largest;
		for(int i=0;i<root.children.size();i++) {
			largestSoFar=largestNode(root.children.get(i));
			if(largest>largestSoFar) {
				largest=largestSoFar;
				secondLargest=largest;
			}
		}
		return secondLargest;
	}
	
	public static int noOfLeafNodes(TreeNode<Integer> root) {
		int count=0;
		if(root.children.size()==0) {
			count++;
		}
		for(int i=0;i<root.children.size();i++) {
			count+=noOfLeafNodes(root.children.get(i));
		}
		return count;
	}
	
	public static void replaceNodeWithDepth(TreeNode<Integer> root,int depth) { 
		root.data=depth;
		for(int i=0;i<root.children.size();i++) {
			replaceNodeWithDepth(root.children.get(i), depth+1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		TreeNode<Integer> root1 = takeTreeInput2();
//		TreeNode<Integer> root2=takeTreeInput2();
		print(root1);
//		print(root2);
		//printAtK(root, 2);
		//System.out.println(largestNode(root));
		
//		System.out.println("Enter the element to be checked : ");
//		int k=s.nextInt();
//		System.out.println(numberOfTimes(root,k));
//		System.out.println("Number of nodes : "+numberOfNodes(root));
//		System.out.println("Sum of nodes  : "+sumOfNodes(root));
//		System.out.println("Height is : "+heightOfTree(root));		
//		System.out.println("Max Children : "+maxNoOfChildren(root));
		
//		if(isTreeIdentical(root1, root2))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
		
		
//		System.out.println("Enter n :");
//		int n=s.nextInt();
//		System.out.println("Just larger than "+n+" is : "+justLargerThanN(root1, n));
		
		System.out.println("Second largest value is : "+secondLargestValue(root1));
//		
//		
//		System.out.println(noOfLeafNodes(root1));
//		
		
//		System.out.println("Replaced values are : ");
//		replaceNodeWithDepth(root1, 0);
//		print(root1);
//		
		
		
		
		
	}

}
