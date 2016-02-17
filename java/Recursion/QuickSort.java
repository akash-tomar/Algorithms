package Recursion;

import java.util.Scanner;

public class QuickSort {

	/**
	 * @param args
	 */
	
	public static int partition(int[] arr,int beginIndex,int endIndex) {
		int pivot=arr[beginIndex];
		int count=0;
		for(int i=beginIndex+1;i<=endIndex;i++) {
			if(arr[i]<pivot) {
				count++;
			}
		}
		int temp=arr[beginIndex];
		arr[beginIndex]=arr[beginIndex+count];
		arr[beginIndex+count]=temp;
		for(int i=beginIndex;i<count;i++) {
			int posR=i;
			if( arr[i]>arr[count] ) {
				for(int j=count+1;j<=endIndex;j++) {
					if(arr[j]<arr[count]) {
						posR=j;
						break;
					}
				
				}
				int temp1=arr[i];
				arr[i]=arr[posR];
				arr[posR]=temp1;
				
			}
			
		}
		return count;
	}
	
	public static void quickSort(int[] arr,int beginIndex,int endIndex) {
		if(beginIndex>=endIndex) {
			return;
		}
		int pivotPosition=partition(arr,beginIndex,endIndex);
		quickSort(arr, beginIndex, pivotPosition-1);
		quickSort(arr, pivotPosition+1, endIndex);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size=s.nextInt();
		System.out.println("Enter the array  : ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
