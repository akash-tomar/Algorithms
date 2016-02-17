package assigments;

import java.util.Scanner;

public class BinarySearch {

	/**
	 * @param args
	 */
	
	public static int binarySearch(int[] arr,int key)
	{
		int r=arr.length-1;
		int q;
		int p=0;
		
		do
		{
			q=(p+r)/2;
			if(arr[q]==key)
				return q;
			else if(key<arr[q])
				r=q-1;
			else 
				p=q+1;
				
		}while(p!=r);
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the no of elements : ");
		size=s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the sorted array : ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int key;
		System.out.println("Enter the key to be searched : ");
		key=s.nextInt();
		int add=binarySearch(arr,key);
		System.out.println("Found at : "+add);
	}

}
