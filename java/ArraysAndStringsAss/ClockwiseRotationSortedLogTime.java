package ArraysAndStringsAss;

public class ClockwiseRotationSortedLogTime {

	/**
	 * @param args
	 */
	
	public static void clockwiseRotation(int[] arr,int begin,int last) {
		int mid=(begin+last)/2;
		if(mid==begin) {
			System.out.println(mid+1);
			return;
		}
		if(arr[begin]>arr[mid]) {
			clockwiseRotation(arr, begin, mid);
		}
		else if(arr[begin]<arr[mid]) {
			clockwiseRotation(arr, mid, last);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		System.out.println("Starting");
		int [] arr={3,4,5,1,2};
		clockwiseRotation(arr,0,arr.length-1);
		

	}

}
