package heap;

public class PQuse {
	public static void main(String[] args) {
		int[] arr={3,1,2,5,4,6,9,8,67,54,23,56,43,21,133};
		MinPriorityQueue<Integer> heap=new MinPriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++) {
			heap.insert(arr[i], arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(heap.removeMin());
		}
		
		
		
		
		
		
	}
}
