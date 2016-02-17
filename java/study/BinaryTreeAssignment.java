package study;

public class BinaryTreeAssignment {
	public static int sumOfAllNodes(BinaryTreeNode root) {
		if(root==null) {
			return 0;
		}
		int lsum=sumOfAllNodes(root.left);
		int rsum=sumOfAllNodes(root.right);
		return lsum+rsum+root.data;
	}
	
	public static PairIsBalanced isBalancedTreeNodes(BinaryTreeNode root) {
		if(root==null) {
			PairIsBalanced p = new PairIsBalanced();
			return p;
		}
		
		PairIsBalanced l = isBalancedTreeNodes(root.left);
		PairIsBalanced r = isBalancedTreeNodes(root.right);
		
		if(Math.abs(l.depth-r.depth)>1) {
			l.isBalanced=false;
			return l;
		}
		
		int h = Math.max(l.depth, r.depth);
		l.depth=1+h;
		l.isBalanced=true;
		return l;
		
	}

}
