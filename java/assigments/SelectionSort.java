package assigments;

import java.util.Scanner;

public class SelectionSort {

	/**
	 * @param args
	 */
	
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
				
				
			}
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=min;
			
		}
	}
	
	public static void main(String[] args) {
		
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of variables : ");
		size=s.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		selectionSort(arr);
		System.out.println("Sorted array is : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
