package study;

public class BinarySearchTree {

	public static void inOrder(BinaryTreeNode root) {
		if(root==null) {
			return;
		}
		if(root.left!=null) {
			inOrder(root.left);
		}
		
		System.out.print(root.data +" ");
		
		if(root.right!=null) {
			inOrder(root.right);
		}
		
	}
	
	public static BinaryTreeNode search(BinaryTreeNode root1,int key) {
		if(root1==null) {
			return null;
		}
		if(root1.data==key) {
			return root1;
		} else {
			if(root1.data < key) {
				return search(root1.right,key);
			} else {
				return search(root1.left, key);
			}
		}
	}

	public static int maxNode(BinaryTreeNode root1) {
		if(root1.right==null) {
			return root1.data;
		}
		return maxNode(root1.right);
	}

	public static int minNode(BinaryTreeNode root1) {
		if(root1.left==null) {
			return root1.data;
		}
		return minNode(root1.left);
	}

	public static void insert(BinaryTreeNode root1,int key) {
		if(root1.data<key) {
			if(root1.right==null) {
				BinaryTreeNode temp=new BinaryTreeNode();
				temp.data=key;
				temp.left=null;
				temp.right=null;
				root1.right=temp;
			} else {
				insert(root1.right, key);
			}
		} else {
			if(root1.left==null) {
				BinaryTreeNode temp=new BinaryTreeNode();
				temp.data=key;
				temp.left=null;
				temp.right=null;
				root1.left=temp;
			} else {
				insert(root1.left, key);
			}
		}
	}

	public static int delete(BinaryTreeNode root,BinaryTreeNode parent, int key) {
		if(root==null) {
			return -1;
		}
		if(root.data==key) {
			if(root.left==null && root.right==null) {
				int temp=root.data;
				if(parent.left==root) {
					parent.left=null;
				} else {
					parent.right=null;
				}
				return temp;
			} else if(root.left==null) {
				int temp=root.data;
				if(parent.left==root) {
					parent.left=root.right;
				} else {
					parent.right=root.right;
				}
				//root=root.right;
				return temp;
			} else if(root.right==null) {
				int temp=root.data;
				if(parent.left==root) {
					parent.left=root.left;
				} else {
					parent.right=root.left;
				}
				//root=root.left;
				return temp;
			} else {
				BinaryTreeNode temp=root.right;
				parent=root;
				while(temp.left!=null) {
					parent=temp;
					temp=temp.left;
				}
				int temp1=root.data;
				root.data=temp.data;
				if(parent.left==temp) {
					parent.left=temp.right;
				} else {
					parent.right=temp.right;
				}
				//temp=temp.right;
				return temp1;
			}

		} else if(root.data < key) {
			parent=root;
			return delete(root.right,parent,key);
		} else {
			parent=root;
			return delete(root.left,parent,key);
		}

	}

	
	public static void main(String[] args) {
		BinaryTreeNode root=new BinaryTreeNode();
		insert(root, 15);
		insert(root, 5);
		insert(root, 16);
		insert(root, 25);
		insert(root, 20);
		insert(root, 27);
		insert(root, 3);
		insert(root, 12);
		insert(root, 11);
		insert(root, 14);
		insert(root, 8);
		insert(root, 10);
		
		inOrder(root);
		
		delete(root,root, 10);
		
		System.out.println();
		inOrder(root);
		
	}
	
	
}
