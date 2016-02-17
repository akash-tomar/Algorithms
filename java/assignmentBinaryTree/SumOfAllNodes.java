package assignmentBinaryTree;


import BinaryTree.BinaryTreeNode;
import BinaryTree.Node;
import BinaryTree.QueueEmptyException;
import BinaryTree.QueueusingLL;

public class SumOfAllNodes {
	
	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int leftSum=sumOfNodes(root.left);
		int rightSum=sumOfNodes(root.right);
		int sumSoFar=leftSum+rightSum+root.data;
		return sumSoFar;
		
	}
	
	public static Node<BinaryTreeNode<Integer>>[] getArrayOfLLforEachLevel(BinaryTreeNode<Integer> root) {
		QueueusingLL<BinaryTreeNode<Integer>> queue=new QueueusingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		queue.enqueue(null);
		int currentList=0;
		Node<BinaryTreeNode<Integer>>[] lists=new Node[10];
		while(!queue.isEmpty()) {
			try {
				BinaryTreeNode<Integer> currentNode=queue.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			Node<BinaryTreeNode<T>> temp=new Node<BinaryTreeNode<Integer>>();
			
			
			
			
			
			
		}
		
		
	}
	
	
	
		
	public static void main(String[] args) {
		
	}


	
}
