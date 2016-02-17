package printRecursion;

import java.util.Scanner;

public class SubsetSumToK {

	/**
	 * @param args
	 */
	public static void subsetSumToK(int[] input,int[] arraySoFar,int beginIndex,int k) {
		if(beginIndex>=input.length) {
			int sum=0;
			for(int i=0;i<arraySoFar.length;i++) {
				sum+=arraySoFar[i];
			}
			if(sum==k) {
				for(int i=0;i<arraySoFar.length;i++) {
					System.out.print(arraySoFar[i]+" ");
				}
				System.out.println();
			}
			return;
				
		}
		subsetSumToK(input, arraySoFar, beginIndex+1, k);
		int[] subset=new int[arraySoFar.length+1];
		for(int i=0;i<arraySoFar.length;i++) {
			subset[i+1]=arraySoFar[i];
		}
		subset[0]=input[beginIndex];
		subsetSumToK(input, subset, beginIndex+1, k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=s.nextInt();
		System.out.println("Enter the array : ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter k : ");
		int k=s.nextInt();
		int[] arr1=new int[0];
		subsetSumToK(arr,arr1,0,k);
	}

}
