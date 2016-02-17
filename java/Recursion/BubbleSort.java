package Recursion;

import java.util.Scanner;

public class BubbleSort {

	/**
	 * @param args
	 */
	
	public static void bubbleSort(int[] arr,int endIndex)
	{
		if(endIndex==0)
			return;
		for(int i=0;i<endIndex;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		bubbleSort(arr, endIndex-1);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size=s.nextInt();
		System.out.println("Enter the array : ");
		int[] arr = new int[size];
		for( int i=0;i<size;i++)
			arr[i]=s.nextInt();
		bubbleSort(arr,arr.length-1);
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
		
		
	}

}
