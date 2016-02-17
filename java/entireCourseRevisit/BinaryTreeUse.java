package entireCourseRevisit;

import java.util.Currency;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> getTree() {
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>();
		System.out.println("Enter root data :");
		Scanner s = new Scanner(System.in);
		root.data=s.nextInt();
		Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode=queue.remove();
			System.out.println("Enter left child of "+currentNode.data+":");
			int templ=s.nextInt();
			if(templ!=-1) {
				currentNode.left=new BinaryTreeNode<Integer>();
				currentNode.left.data=templ;
				queue.add(currentNode.left);
			}
			System.out.println("Enter right child of "+currentNode.data+":");
			int tempr=s.nextInt();
			if(tempr!=-1) {
				currentNode.right=new BinaryTreeNode<Integer>();
				currentNode.right.data=tempr;
				queue.add(currentNode.right);
			}
			if(queue.isEmpty()) {
				return root;
			}

		}
		return root;
	}


	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.print(root.data+": ");
		if(root.left!=null)
			System.out.print(root.left.data+" ");
		if(root.right!=null)
			System.out.print(root.right.data);
		System.out.println();
		printBinaryTree(root.left);
		printBinaryTree(root.right);
	}

	public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode=queue.remove();
			System.out.print(currentNode.data+": ");
			if(currentNode.left!=null) {
				System.out.print(currentNode.left.data+" ");
				queue.add(currentNode.left);
			} else {
				System.out.print(-1+" ");
			}
			if(currentNode.right!=null) {
				System.out.print(currentNode.right.data);
				queue.add(currentNode.right);
			} else {
				System.out.print(-1);
			}
			System.out.println();
			if(queue.isEmpty()) {
				return;
			}
		}
	}

	public static int numberOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null) { 
			return 0;
		}
		int leftNodes=numberOfNodes(root.left);
		int rightNodes=numberOfNodes(root.right);
		return 1+leftNodes+rightNodes;
	}

	public static int getHeightOfTree(BinaryTreeNode<Integer> root) {
		if(root==null || (root.left==null && root.right==null)) {
			return 0;
		}
		int leftHeight=0,rightHeight=0;
		if(root.left!=null) {
			leftHeight=getHeightOfTree(root.left);
		}
		if(root.right!=null) {
			rightHeight=getHeightOfTree(root.right);
		}
		return 1+Math.max(leftHeight, rightHeight);

	}

	public static int largestNode(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null) {
			return root.data;
		}
		return Math.max(root.data, Math.max(largestNode(root.left), largestNode(root.right)));

	}

	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null) {
			return root.data;
		}

		return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
	}

	public static int numberOfLeafNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null) {
			return 1;
		}
		return numberOfLeafNodes(root.left)+numberOfLeafNodes(root.right);
	}

	public static BinaryTreeNode<Integer> searchNode(BinaryTreeNode<Integer> root,int search) {
		if(root==null)
			return null;
		if(root.data==search)
			return root;
		BinaryTreeNode<Integer> left = searchNode(root.left, search);
		BinaryTreeNode<Integer> right = searchNode(root.right, search);
		if(left!=null)
			return left;
		return right;
	}

	public static BinaryTreeNode<Integer> mirrorATree(BinaryTreeNode<Integer> root ) {
		if(root==null)
			return null;
		if(root.left==null && root.right==null)
			return root;
		BinaryTreeNode<Integer> root1=new BinaryTreeNode<Integer>();
		root1.data=root.data;
		root1.left=mirrorATree(root.right);
		root1.right=mirrorATree(root.left);
		return root1;
	}

	//	public static Boolean isBst(BinaryTreeNode<Integer> root) {
	//		if(root==null) {
	//			return true;
	//		}
	//		if(root.left==null && root.right==null) {
	//			return true;
	//		}
	//		Boolean left=isBst(root.left);
	//		Boolean right=isBst(root.right);
	//		if(!left || !right) {
	//			return false;
	//		}
	//		if(root.data<root.right.data) {
	//			if(root.data>root.left.data) {
	//				return true;
	//			}
	//		}
	//		return false;
	//	}

	public static Triplets isBST(BinaryTreeNode<Integer> root) {
		if(root.left==null && root.right==null) {
			Triplets x=new Triplets();
			x.isBST=true;
			x.largest=root.data;
			x.smallest=root.data;
			return x;
		}
		Triplets left=null,right=null;
		if(root.left!=null) {
			left=isBST(root.left);
			if(!left.isBST) {
				Triplets x = new Triplets();
				x.isBST=false;
				return x;
			}
		}
		if(root.right!=null) {
			right=isBST(root.right);
			if(!right.isBST) {
				Triplets x = new Triplets();
				x.isBST=false;
				return x;
			}
		}


		if(root.left!=null && root.right!=null) {
			if(root.data<root.right.data) {
				if(root.data>root.left.data) {
					if(left.largest>root.data) {
						Triplets x = new Triplets();
						x.isBST=false;
						return x;
					}
					if(right.smallest<root.data) {
						Triplets x = new Triplets();
						x.isBST=false;
						return x;
					} else {
						Triplets x = new Triplets();
						x.isBST=true;
						x.largest=right.largest;
						x.smallest=left.smallest;
						return x;
					}
				}
			}
		} else if(root.left==null) {
			if(root.data<root.right.data) {
				Triplets x = new Triplets();
				x.isBST=true;
				x.largest=right.largest;
				x.smallest=root.data;
				return x;
			}
		} else {
			if(root.data>root.left.data) {
				Triplets x = new Triplets();
				x.isBST=true;
				x.largest=root.data;
				x.smallest=left.smallest;
				return x;
			}
		}

		Triplets x = new Triplets();
		x.isBST=false;
		return x;
	}


	public static void printLevelWiseWithSpaces(BinaryTreeNode<Integer> root) {

		Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();

		if(root==null) {
			return;
		}

		queue.add(root);

		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode=queue.remove();
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
			System.out.print(currentNode.data+" ");
			if(queue.isEmpty()) {
				return;
			}
		}
	}


	public static void printZigZag(BinaryTreeNode<Integer> root) {
		Boolean left=true;
		Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
		Stack<BinaryTreeNode<Integer>> stack=new Stack<BinaryTreeNode<Integer>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode=queue.remove();
			System.out.print(currentNode.data+" ");
			if(left) {
				if(stack.isEmpty()) {
					stack.push(currentNode.right);
					stack.push(currentNode.left);
					queue.add(currentNode.right);
					queue.add(currentNode.left);
				} else {
					BinaryTreeNode<Integer> currNode=null;
					if(!stack.isEmpty()) {
						currNode=stack.pop();
					}
					if(currNode!=null) {
						if(currNode.right!=null)
							queue.add(currNode.right);
						if(currNode.left!=null)
							queue.add(currNode.left);
					}
				}
				/*while(!stack.isEmpty()) {
					BinaryTreeNode<Integer> currNode=stack.pop();
					queue.add(currNode.left);
					queue.add(currNode.right);
				}*/
				left=false;
			} else {
				BinaryTreeNode<Integer> currNode=null;
				if(!stack.isEmpty()) {
					currNode=stack.pop();
				}
				if(currNode!=null) {
					if(currNode.left!=null)
						queue.add(currNode.left);
					if(currNode.right!=null) 
						queue.add(currNode.right);
				}

				left=true;
			}
		}
	}

	public static DualValTree isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			DualValTree tree=new DualValTree();
			tree.isBalanced=true;
			tree.height=0;
			return tree;
		}
		DualValTree left=isBalanced(root.left);
		DualValTree right=isBalanced(root.right);
		if(!left.isBalanced) {
			DualValTree tree=new DualValTree();
			tree.isBalanced=false;
			return tree;
		}
		if(!right.isBalanced) {
			DualValTree tree=new DualValTree();
			tree.isBalanced=false;
			return tree;
		}

		if(Math.abs(left.height-right.height)>=2) {
			DualValTree tree=new DualValTree();
			tree.isBalanced=false;
			return tree;
		}

		DualValTree tree=new DualValTree();
		tree.height=1+Math.max(left.height, right.height);
		tree.isBalanced=true;
		return tree;

	}


	public static int sumOfNodes2(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int left=sumOfNodes(root.left);
		int right=sumOfNodes(root.right);
		return root.data+left+right;
	}


	public static Node<Integer>[] getArrayOFLinkedListOfEachLevel(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
		Node<Integer>[] lists=new Node[getHeightOfTree(root)+1];
		queue.add(root);
		BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>();
		temp.data=-1;
		queue.add(temp);
		int currentList=0;
		Node<Integer> tempNode=new Node<Integer>();
		tempNode.data=root.data;
		tempNode.next=null;
		lists[0]=tempNode;
		Node<Integer> lastNode=new Node<Integer>();
		lastNode=lists[currentList];
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode=queue.remove();
			if(currentNode.data==-1) {
				queue.add(currentNode);
				currentList++;
				continue;
			}

			queue.add(currentNode.left);
			queue.add(currentNode.right);

		}
	}

	public static largestBSTTuple getLargestBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
			largestBSTTuple t=new largestBSTTuple();
			t.bstNode=null;
			t.isBST=true;
			t.height=0;
			return t;
		}


		largestBSTTuple t =new largestBSTTuple();

		largestBSTTuple left=getLargestBST(root.left);
		largestBSTTuple right=getLargestBST(root.right);


		if(root.left==null && root.right!=null) {
			if(!right.isBST) {
				t.isBST=false;
				t.bstNode=right.bstNode;
				t.height=right.height;
				return t;
			}
			if(root.data<root.right.data) {
				t.isBST=true;
				t.bstNode=root;
				t.height=1 + right.height;
				return t;
			}
			t.isBST=false;
			t.height=right.height;
			t.bstNode=right.bstNode;
			return t;
		}
		
		if(root.right==null && root.left!=null) {
			if(!left.isBST) {
				t.isBST=false;
				t.bstNode=left.bstNode;
				t.height=left.height;
				return t;
			}
			if(root.data>root.left.data) {
				t.isBST=true;
				t.bstNode=root;
				t.height=1 + left.height;
				return t;
			}
			t.isBST=false;
			t.height=left.height;
			t.bstNode=left.bstNode;
			return t;
		}

		if(root.left==null && root.right==null) {
			t.isBST=true;
			t.height=1;
			t.bstNode=root;
			return t;
		}

		if(!left.isBST || !right.isBST) {
			t.isBST=false;
			if(left.height>right.height) {
				t.bstNode=left.bstNode;
				t.height=left.height;
				return t;
			} else {
				t.bstNode=right.bstNode;
				t.height=right.height;
				return t;
			}
		}

		if(root.data>root.left.data && root.data<root.right.data) {
			t.isBST=true;
			t.bstNode=root;
			t.height=1+Math.max(left.height, right.height);
			return t;
		}

		if(left.height>right.height) {
			t.isBST=false;
			t.height=left.height;
			t.bstNode=left.bstNode;
			return t;
		}

		t.isBST=false;
		t.height=right.height;
		t.bstNode=right.bstNode;
		return t;

	}





	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = getTree();
		//printBinaryTree(root);
		/*//		/*printBinaryTreeLevelWise(root);
//		System.out.println("Number of nodes : "+numberOfNodes(root));
//		System.out.println("Height of tree: "+getHeightOfTree(root));
//		System.out.println("Largest node :"+largestNode(root));
//		System.out.println("Sum of nodes : "+sumOfNodes(root));
//		System.out.println("Number of leaf nodes: "+numberOfLeafNodes(root) );
//		//	System.out.println(searchNode(root, 3).data);
//		printBinaryTreeLevelWise(mirrorATree(root));
//		System.out.println("isBst: "+isBST(root).isBST);*/
		printLevelWiseWithSpaces(root);
		/*System.out.println("Now zigzag");
		printZigZag(root);
		 */System.out.println(isBalanced(root).isBalanced);
		 printBinaryTree(getLargestBST(root).bstNode);
	}
}
