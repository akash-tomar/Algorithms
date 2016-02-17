package BinaryTree;

import java.util.Scanner;

import dataStructures.StackEmptyException;
import dataStructures.StackUsingLinkedList;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> getBinaryTreeInput() {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		root.data = s.nextInt();
		QueueusingLL<BinaryTreeNode<Integer>> queue = 
				new QueueusingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> current;
			try {
				current = queue.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

			System.out.println("Enter left child of " + current.data);
			int left = s.nextInt();
			if (left != -1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<Integer>();
				leftNode.data = left;
				current.left = leftNode;
				queue.enqueue(leftNode);
			}

			System.out.println("Enter right child of " + current.data);
			int right = s.nextInt();
			if (right != -1) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<Integer>();
				rightNode.data = right;
				current.right = rightNode;
				queue.enqueue(rightNode);
			}
		}
		return root;
	}

	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		String printString = root.data + ":";
		if (root.left != null) {
			printString += " left:" + root.left.data;
		}
		if (root.right != null) {
			printString += " right:" + root.right.data;
		}
		System.out.println(printString);

		printBinaryTree(root.left);
		printBinaryTree(root.right);

	}

	public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root) {
		QueueusingLL<BinaryTreeNode<Integer>> queue=new QueueusingLL<BinaryTreeNode<Integer>>() ;
		queue.enqueue(root);

		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode=queue.dequeue();
				//				System.out.print(currentNode.data);
				//				if(queue.isEmpty()) {
				//					return;
				//				}
			} catch (QueueEmptyException e) {
				return;
			}
			String soFar=currentNode.data+":";
			if(currentNode.left!=null) {
				soFar+="Left: "+currentNode.left.data+"";
				queue.enqueue(currentNode.left);
			}
			if(currentNode.right!=null) {
				soFar+="Right: "+currentNode.right.data+"";
				queue.enqueue(currentNode.right);
			}
			System.out.println(soFar);
		}



	}


	public static int numberOFNodes(BinaryTreeNode<Integer> root) {
		int nodesSoFar=0;
		if(root==null) {
			return nodesSoFar;
		}
		else {
			nodesSoFar++;
		}
		nodesSoFar+=numberOFNodes(root.left);
		nodesSoFar+=numberOFNodes(root.right);
		return nodesSoFar;

	}


	public static int getHeight(BinaryTreeNode<Integer> root) {
		int heightSoFar=0;
		if(root!=null) {
			heightSoFar++;
		}
		else {
			return heightSoFar;
		}
		int leftHeight=getHeight(root.left);
		int rightHeight=getHeight(root.right);
		if(leftHeight>rightHeight) {
			heightSoFar+=leftHeight;
		}
		else
			heightSoFar+=rightHeight;
		return heightSoFar;
	}

	public static int getLargest(BinaryTreeNode<Integer> root) {
		int largestSoFar=Integer.MIN_VALUE;
		if(root==null) {
			return largestSoFar;
		}

		if(root.data>largestSoFar) {
			largestSoFar=root.data;
		}
		int leftLarge=getLargest(root.left);
		int rightLarge=getLargest(root.right);
		if(leftLarge>rightLarge && leftLarge>largestSoFar) {
			return leftLarge;
		}
		else if(rightLarge>leftLarge && rightLarge>largestSoFar) {
			return rightLarge;
		}
		return largestSoFar;

	}

	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		int sumSoFar=0;
		if(root!=null) {
			sumSoFar+=root.data;
		}
		else
			return sumSoFar;
		sumSoFar+=sumOfNodes(root.left);
		sumSoFar+=sumOfNodes(root.right);
		return sumSoFar;

	}


	public static int numberOFLeafNodes(BinaryTreeNode<Integer> root ) {
		int leafNodesSoFar=0;
		if(root==null) {
			return leafNodesSoFar;
		}
		else {
			if(root.left==null && root.right==null) {
				leafNodesSoFar++;
			}
		}
		leafNodesSoFar+=numberOFLeafNodes(root.left);
		leafNodesSoFar+=numberOFLeafNodes(root.right);
		return leafNodesSoFar;

	}

	public static BinaryTreeNode<Integer> searchNode(BinaryTreeNode<Integer> root,int search) {
		if(root!=null && root.data==search) {
			return root;
		}
		else if(root==null) {
			BinaryTreeNode<Integer> temp=null;
			return temp;
		}
		BinaryTreeNode<Integer> tempL=searchNode(root.left, search);
		BinaryTreeNode<Integer> tempR=searchNode(root.right, search);
		if(tempL!=null) {
			return tempL;
		}
		else 
			return tempR;		
	}


	//	public static void preOrderWithoutRecursion(BinaryTreeNode<Integer> root) {
	//		
	//		if(root==null) 
	//			return;
	//		StackUsingLinkedList<BinaryTreeNode<Integer>> stack=new StackUsingLinkedList<BinaryTreeNode<Integer>>();
	//		stack.push(root);
	//		while(!stack.isEmpty()) {
	//			BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>();
	//			try {
	//				temp=stack.pop();				
	//			} catch (StackEmptyException e) {
	//				return;
	//			}
	//			System.out.println(temp.data);
	//			if(temp.right!=null)
	//				stack.push(temp.right);
	//			if(temp.left!=null)
	//				stack.push(temp.left);
	//			
	//		}
	//		
	//	}


	public static void mirrorATree(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>();
		temp=root.left;
		root.left=root.right;
		root.right=temp;
		mirrorATree(root.left);
		mirrorATree(root.right);
	}


	public static boolean leftOf(int[] inOrder,int val,int predecessor) {
		int valPos=-1;
		int predecessorPos=-1;
		for(int i=0;i<inOrder.length;i++) {
			if(inOrder[i]==val)
				valPos=i;
			if(inOrder[i]==predecessor)
				predecessorPos=i;
		}
		if(predecessorPos>valPos)
			return true;
		else
			return false;
	}

	public static BinaryTreeNode<Integer> treeFormation(int[] preOrder,int[] inOrder ) {
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>();
		root.data=preOrder[0];
		BinaryTreeNode<Integer> traversal=root;
		for(int i=1;i<preOrder.length;i++) {
			if(leftOf(inOrder, preOrder[i], preOrder[i-1])) {
				BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>();
				temp.data=preOrder[i];
				temp.left=null;
				temp.right=null;
				traversal.left=temp;
				traversal=traversal.left;
			}
			else {
				BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>();
				int pos=-1;
				temp.data=preOrder[i];
				temp.left=null;
				temp.right=null;
				for(int j=0;j<inOrder.length;j++) {
					if(inOrder[j]==preOrder[i]) {
						pos=j;
						break;
					}
				}
				BinaryTreeNode<Integer> temp1;
				while(true) {
					temp1=searchNode(root, inOrder[pos-1]);

					if(temp1!=null) {
						//System.out.println("temp1: "+temp1.data);
						break;
					}
					else
						pos--;
				}
				temp1.right=temp;
				traversal=temp1.right;

			}
		}
		return root;

	}

	//	public static boolean isBST(BinaryTreeNode<Integer> root) {
	//		
	//		if(root==null) 
	//			return true;
	//		if(root.left!=null) {
	//			if(root.data>root.left.data) {
	//				return isBST(root.left);
	//			}
	//			else if(root.data<root.left.data)
	//				return false;
	//		}
	//		if(root.right!=null) {
	//			if(root.right.data>root.data) {
	//				return isBST(root.right);
	//			}
	//			else if(root.right.data<root.data)
	//				return false;
	//		}
	//		return true;
	//		
	//		
	//	}


	public static int getSmallest(BinaryTreeNode<Integer> root) {
		if(root==null)
			return Integer.MAX_VALUE;

		int smallSoFar=root.data;
		if(root.left!=null) {
			if(root.left.data<smallSoFar)
				smallSoFar=root.left.data;
		}
		if(root.right!=null) {
			if(root.right.data<smallSoFar)
				smallSoFar=root.right.data;
		}
		int smallL=getSmallest(root.left);
		if(smallL<smallSoFar)
			smallSoFar=smallL;
		int smallR=getSmallest(root.right);
		if(smallR<smallSoFar)
			smallSoFar=smallR;
		return smallSoFar;
	}


	public static int[] inOrderTraverse(BinaryTreeNode<Integer> root) {

		if(root==null)
			return null;

		int[] ARR;
		int[] leftARR=null;
		int[] rightARR=null;
		if(root.left!=null) {
			leftARR=inOrderTraverse(root.left);
		}
		if(root.right!=null) {
			rightARR=inOrderTraverse(root.right);
		}
		ARR=new int[leftARR.length+rightARR.length+1];

		int pos=-1;
		if(root.left!=null) {
			for(int i=0;i<leftARR.length;i++) {
				ARR[i]=leftARR[i];
				pos=i;
			}
		}
		ARR[pos]=root.data;
		pos++;
		for(int i=0;i<rightARR.length;i++) {
			ARR[pos]=rightARR[i];
			pos++;
		}
		return ARR;


	}


	//	public static LinkedList bstIntoLinkedList(BinaryTreeNode<Integer> root) {
	//		LinkedList leftL=new LinkedList();
	//		if(root.left!=null) {
	//			leftL=bstIntoLinkedList(root.left);
	//		}
	//		LinkedList temp=leftL;
	//		while(!leftL.)
	//		
	//		
	//		
	//	}


	public static BinaryTreeNode<Integer> BSTFromSortedArray(int[] arr,int beginIndex,int endIndex) {
		if(beginIndex>=endIndex) {
			BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>();
			temp.data=arr[beginIndex];
			return temp;
		}
		int midIndex=(beginIndex+endIndex)/2;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>();
		root.data=arr[midIndex];
		root.left=BSTFromSortedArray(arr, beginIndex, midIndex-1);
		root.right=BSTFromSortedArray(arr, midIndex+1, endIndex);
		return root;
	}


	//	public static DualVal nodeWithMaxDataChildSum(BinaryTreeNode<Integer> root) {
	//		if(root.left==null && root.right==null) {
	//			DualVal temp=new DualVal();
	//			temp.sum=root.data;
	//			temp.node=root;
	//			return temp;
	//		}
	//		
	//		DualVal left=nodeWithMaxDataChildSum(root.left);
	//		
	//		
	//	}


	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root==null)
			return true;
		int leftMax=getLargest(root.left);
		int rightMin=getSmallest(root.right);
		if(root.data>leftMax) {
			return isBST(root.left);
		}
		else if(root.data<leftMax)
			return false;
		if(root.data<rightMin)
			return isBST(root.right);
		else if(root.data>rightMin)
			return false;
		if(root.left!=null)
			return isBST(root.left);
		if(root.right!=null)
			return isBST(root.right);
		return true;
	}


	public static void printLevelWiseWithSpaces(BinaryTreeNode<Integer> root) {
		QueueusingLL<BinaryTreeNode<Integer>> queue = new QueueusingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		queue.enqueue(null);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> current=null;

			try {
				current = queue.dequeue();

			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				return;
			}
			if(current==null) {
				if (queue.isEmpty())
					break;
				System.out.println();
				queue.enqueue(null);
			} else {
				System.out.print(current.data+" ");
				if(current.left!=null)
					queue.enqueue(current.left);
				if(current.right!=null)
					queue.enqueue(current.right);	
			}
		}

	}

	public static void printZigZag(BinaryTreeNode<Integer> root) {
		QueueusingLL<BinaryTreeNode<Integer>> queue=new QueueusingLL<BinaryTreeNode<Integer>>();
		StackUsingLinkedList<BinaryTreeNode<Integer>> stack1 = new StackUsingLinkedList<BinaryTreeNode<Integer>>();
		StackUsingLinkedList<BinaryTreeNode<Integer>> stack2 = new StackUsingLinkedList<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		//queue.enqueue(null);
		boolean right=true;
		while(!queue.isEmpty()|| !stack1.isEmpty() || !stack2.isEmpty() ) {
			BinaryTreeNode<Integer> temp=null;
			if(right) {

				try {
					temp=queue.dequeue();
				} catch (QueueEmptyException e) {
					return;
				}
				if(temp!=null)
					System.out.print(temp.data+" ");
				if(queue.isEmpty())
					right=false;

				if(temp.left!=null)
					stack1.push(temp.left);
				if(temp.right!=null)
					stack1.push(temp.right);
			}
			else {
				System.out.println();
				while(!stack1.isEmpty()) {
					try {
						temp=stack1.pop();
					} catch (StackEmptyException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return;
					}
					System.out.print(temp.data+" ");
					stack2.push(temp);
				}
				while(!stack2.isEmpty()) {
					try {
						temp=stack2.pop();
					} catch (StackEmptyException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return;
					}
					if(temp.left!=null)
						queue.enqueue(temp.left);
					if(temp.right!=null) 
						queue.enqueue(temp.right);
				}
				right=true;
				System.out.println();
			}
		}
	}

	public static DoubleInt maxSumWithoutChildParentNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			DoubleInt temp=new DoubleInt();
			temp.first=0;
			temp.second=0;
			return temp;
		}
		DoubleInt leftSum=maxSumWithoutChildParentNode(root.left);
		DoubleInt rightSum=maxSumWithoutChildParentNode(root.right);
		DoubleInt sumSoFar=new DoubleInt();
		sumSoFar.second=(leftSum.first+rightSum.first);
		sumSoFar.first=(leftSum.second+rightSum.second+root.data);
		return sumSoFar;
	}


	public static DoubleValue isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			DoubleValue temp1=new DoubleValue();
			temp1.height=0;
			temp1.balanced=true;
			return temp1;
		}
		DoubleValue temp= new DoubleValue();
		temp.height=1;
		DoubleValue left=isBalanced(root.left);
		if(!left.balanced) {
			temp.balanced=false;
			return temp;
		}
		DoubleValue right=isBalanced(root.right);
		if(!right.balanced) {
			temp.balanced=false;
			return temp;
		}
		if(Math.abs(left.height-right.height)<2) {
			if(left.height>right.height) 
				temp.height+=left.height;
			else
				temp.height+=right.height;
			temp.balanced=true;
		}
		else {
			temp.balanced=false;
			return temp;
		}
		return temp;


	}


	public static int sumOfNodes2(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int leftSum=sumOfNodes(root.left);
		int rightSum=sumOfNodes(root.right);
		int sumSoFar=leftSum+rightSum+root.data;
		return sumSoFar;

	}

	public static Node<Integer>[] getArrayOfLLforEachLevel(BinaryTreeNode<Integer> root) {
		QueueusingLL<BinaryTreeNode<Integer>> queue=new QueueusingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		queue.enqueue(null);
		int currentList=0;
		Node<Integer>[] lists=new Node[getHeight(root)];
		Node<Integer>[] temp=new Node[getHeight(root)];
		for(int i=0;i<getHeight(root);i++) {
			temp[i]=lists[i];
		}
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode=queue.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

			if(currentNode==null) {
				if(queue.isEmpty())
					break;
				queue.enqueue(null);
				currentList++;
				continue;
			}
			if(temp[currentList]!=null) {
				while(temp[currentList].next!=null) {
					temp[currentList]=temp[currentList].next;
				}
			}
			Node<Integer> temp1=new Node<Integer>();
			temp1.data=currentNode.data;
			temp1.next=null;
			if(temp[currentList]==null) {
				lists[currentList]=temp1;
				temp[currentList]=lists[currentList];
			} else {
				temp[currentList].next=temp1;
			}
			if(currentNode.left!=null) {
				queue.enqueue(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.enqueue(currentNode.right);
			}

		}
		return lists;
	}

	public static BinaryTreeNode<Integer> removeLeafNodesFromTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			root=null;
		}
		root.left=removeLeafNodesFromTree(root.left);
		root.right=removeLeafNodesFromTree(root.right);
		return root;
	}

	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		System.out.print(root.data + " ");
		postOrder(root.right);

	}

	public static BinaryTreeNode<Integer> treeFromPostInOrder(int[] post,int begPost,int endPost,int[] in,int begIn,int endIn) {
		if(begPost>endPost)
			return null;
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>();
		root.data=post[endPost];
		int pos=-1;
		for(int i=begIn;i<=endIn;i++) {
			if(in[i]==post[endPost]) {
				pos=i;
				break;
			}
		}
		root.left=treeFromPostInOrder(post, begPost, pos-begIn-1, in, begIn, pos-1);
		root.right=treeFromPostInOrder(post, pos-begIn, endPost-1, in, pos+1, endIn);
		return root;
	}


	public static TripleTree largestBST(BinaryTreeNode<Integer> root) {
		if(root==null) 
			return null;
		TripleTree dual=new TripleTree();

		TripleTree left=null;
		TripleTree right=null;
		if(root.left!=null) {
			left=largestBST(root.left);
		}
		if(root.right!=null) {
			right=largestBST(root.right);
		}

		if(left==null && right==null) {
			dual.isBST=true;
			dual.numberOfNodes=1;
			dual.root=root;
			return dual;
		}
		if(left==null) {
			if(right.root.data!=root.right.data) {
				return right;
			}
			if(root.data<root.right.data) {
				dual.isBST=true;
				dual.numberOfNodes=1+right.numberOfNodes;
				dual.root=root;
				return dual;
			} else {
				return right;
			}
		}
		if(right==null) {
			if(left.root.data!=root.left.data) {
				return left;
			}
			if(root.data>root.left.data) {
				dual.isBST=true;
				dual.numberOfNodes=1+left.numberOfNodes;
				dual.root=root;
				return dual;
			} else {
				return left;
			}
		}
		if(left.isBST && right.isBST) {
			if(left.root.data==root.left.data && right.root.data==root.right.data) {
				if(root.data>root.left.data && root.data<root.right.data) {
					dual.isBST=true;
					dual.numberOfNodes=1+left.numberOfNodes+right.numberOfNodes;
					dual.root=root;
					return dual;
				} else {
					if(left.numberOfNodes>right.numberOfNodes) 
						return left;
					return right;
				}
			} else {
				if(left.numberOfNodes>right.numberOfNodes) 
					return left;
				return right;
			}
		}
		else if(!left.isBST && right.isBST) {
			return right;
		}
		else if(left.isBST && !right.isBST) {
			return left;
		}
		return dual;
	}

	
	public static DoubleInt getSecondLargest(BinaryTreeNode<Integer> root) {
//		i/*f(root==null) {
//			DoubleInt a=new DoubleInt();
//			a.first=-1;
//			a.second=-1;
//			return a;
//		}*/
		if(root.left==null && root.right==null) {
			DoubleInt a=new DoubleInt();
			a.second=a.first=root.data;
		}
		DoubleInt left=null,right=null;
		if(root.left!=null)
			left=getSecondLargest(root.left);
		if(root.right!=null)	
			right=getSecondLargest(root.right);
		DoubleInt x = new DoubleInt();
		
		if(left==null) {
			x.first=Math.max(root.data, right.first);
			x.second=();
		}
	
		
		x.first=Math.max(root.data, Math.max(left.first, right.first));
		if(x.first==root.data) {
			x.second=Math.min(left.first, right.first);
		} else if(x.first==left.first) {
			x.second=Math.min(root.data, right.first);
		} else {
			x.second=Math.min(root.data, left.first);
		}
		return x;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = getBinaryTreeInput();
		//printBinaryTree(root);
				printBinaryTreeLevelWise(root);
		////		System.out.println("No of nodes : "+numberOFNodes(root));
		////		System.out.println("Height : "+getHeight(root));
		////		System.out.println("Largest is : "+getLargest(root));
		////		System.out.println("Sum of nodes : "+sumOfNodes(root));
		//		System.out.println("Found node : "+searchNode(root, 3).right.data);
		////		mirrorATree(root);
		////		printBinaryTree(root);
		//		preOrderWithoutRecursion(root);
		//		int[] preOrder={1,2,4,5,3,6,7};
		//		int[] inOrder={4,2,5,1,6,3,7};

		//		int[] preOrder={1,2,4,7,5,3,6};
		//		int[] inOrder={7,4,2,5,1,3,6};

		//		int[] preOrder={1,2,3,5,7,1,6};
		//		int[] inOrder={3,2,1,5,1,7,6};
		//		
		//		
		//		BinaryTreeNode<Integer> root1=treeFormation(preOrder, inOrder);
		//		printBinaryTree(root1);
		//		System.out.println(getSmallest(root));
		//		if(isBST(root))
		//			System.out.println("YES");
		//		else 
		//			System.out.println("NO");
		//		if(isBST(root))
		//			System.out.println("YES");
		//		else
		//			System.out.println("NO");

		//		int[] arr={1,2,3,4,5,6};
		//		BinaryTreeNode<Integer> root=BSTFromSortedArray(arr, 0, arr.length-1);
		//		printBinaryTree(root);
		//		
		//		if(isBalanced(root).balanced)
		//			System.out.println("Yes");
		//		else 
		//			System.out.println("No");
		//		printLevelWiseWithSpaces(root1);
		//		System.out.println("Max sum: "+ (Math.max( maxSumWithoutChildParentNode(root).first ,maxSumWithoutChildParentNode(root).second)));
				printZigZag(root);
		//		System.out.println(sumOfNodes2(root1));
		//		Node<Integer>[] lists=getArrayOfLLforEachLevel(root1);
		//		inOrder(root1);
		//		System.out.println();
		//		postOrder(root1);

		//		int[] in={7,4,2,5,1,3,6};
		//		int[] post={7,4,5,2,6,3,1};
		//		BinaryTreeNode<Integer> root=treeFromPostInOrder(post,0, post.length-1, in,0, in.length-1);
		//		printBinaryTreeLevelWise(root);

//		TripleTree temp=largestBST(root);
//		System.out.println(temp.root.data);
		//	System.out.println(getSecondLargest(root).second );
				//System.out.println();
				


	}

}
