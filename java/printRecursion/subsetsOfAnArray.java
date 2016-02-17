package printRecursion;

import java.util.Scanner;

public class subsetsOfAnArray {

	/**
	 * @param args
	 */
	
	public static void printRecursion(int[] input,int[] arraySoFar,int beginIndex) {
//		if(beginIndex>=input.length)
//			return;
//		if(arraySoFar.length==0){
//			System.out.println();
//			
//		}
		if(beginIndex>=input.length) {
			for(int i=0;i<arraySoFar.length;i++) {
				System.out.print(arraySoFar[i]+" ");	
			}
			System.out.println();
			return;
		}
		printRecursion(input, arraySoFar, beginIndex+1);
		int[] newArraySofar=new int[arraySoFar.length+1];
		for(int i=0;i<arraySoFar.length;i++) {
			newArraySofar[i+1]=arraySoFar[i];
		}
		newArraySofar[0]=input[beginIndex];
		printRecursion(input, newArraySofar, beginIndex+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size=s.nextInt();
		System.out.println("Enter the array : ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int[] arr1=new int[0];
		long startTime=System.currentTimeMillis();
		printRecursion(arr,arr1,0);
		long endTime=System.currentTimeMillis();
		System.out.println("Time : "+(endTime-startTime));

	}

}
