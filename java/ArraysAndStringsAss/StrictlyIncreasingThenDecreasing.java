package ArraysAndStringsAss;

import java.util.Scanner;

public class StrictlyIncreasingThenDecreasing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array : ");
		size=s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array : ");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		int nextElement=arr[1];
		boolean increasing=true;
		int mid=0;
		for(int i=0;i<size;i++) {
			if(arr[i]<nextElement) {
				//decreasing=false;
				mid=i;
				break;
			}
			if(i+2<arr.length) {
				nextElement=arr[i+2];
			}
			else {
				System.out.println("No");
				return;
			}
		}
		//nextElement=arr[mid+1];
		if(mid==0) {
			System.out.println("No");
			return;
		}
		else if(mid==arr.length-1) {
			System.out.println("No");
			return;
		}
		
		for(int j=mid;j<size;j++) {
			if(arr[j]>nextElement) {
				System.out.println("No");
				increasing=false;
				break;
			}
			if(j+2<arr.length) {
				nextElement=arr[j+2];
			}
			
		}
		if(increasing){
			System.out.println("Yes");
		}

	}

}
