package entireCourseRevisit;

public class DynamicArray {
	int[] arr;
	int length;
	public DynamicArray() {
		arr=new int[2];
	}
	public int length() {
		return length;
	}
	public int get(int i) throws EmptyException {
		if(length==0) {
			EmptyException e = new EmptyException();
			throw e;
		}
		return arr[i];
	}
	public void put(int data) {
		if(length()==arr.length) {
			manageArray();
		}
		arr[length]=data;
		length++;
	}
	public int removeLastIndexOf() {
		length--;
		return arr[length];
	}
	private void manageArray() {
		int[] arr1=new int[2*arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		arr=arr1;		
	}
	
}
