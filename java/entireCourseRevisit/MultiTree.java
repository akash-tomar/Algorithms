package entireCourseRevisit;

public class MultiTree<T> {
	TreeNode<T> root;
	int size;
	public MultiTree() {
		root=new TreeNode<T>();
		size=0;
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}
	
	public static void getTreeInput() {
		System.out.println("Enter node value:");
		
	}
	
}
