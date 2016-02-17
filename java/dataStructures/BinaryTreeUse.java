package dataStructures;

import java.util.Scanner;

import treeDs.TreeNode;

public class BinaryTreeUse {

	/**
	 * @param args
	 */
	
	public static BinaryTree<Integer> getBinaryTreeInput() {
		BinaryTree<Integer> root=null;
		Scanner s = new Scanner(System.in);
		if(root==null) {
			System.out.println("Enter value : ");
			int temp=s.nextInt();
			if(temp!=-1) {
				root.data=s.nextInt();		
				return root;
			}
		}
		System.out.println("Enter left child : ");
		root.left=getBinaryTreeInput();
		System.out.println("Enter right child : ");
		root.right=getBinaryTreeInput();
		return root;
		
	}
	
//	public static void printBinaryTree(TreeNode<Integer> root) {
//		System.out.println(root.data+": ");
//		printBinaryTree(root.left);
//		
//	}
	
	public static void printBinaryTree(TreeNode<Integer> root) {
		String rootString = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			rootString = rootString + root.children.get(i).data + ",";
		}
		System.out.println(rootString);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root=getBinaryTreeInput();
		printBinaryTree(root);

	}

}
