package Recursion;

import java.util.Scanner;

public class IfArrayContains7 {

	/**
	 * @param args
	 */
	
	public static boolean isContaining7(int[] arr)
	{
		if(arr[0]!=7 && arr.length==1)
			return false;
		else if(arr[0]==7 && arr.length==1)
			return true;
		
		int[] smallerArray = new int[arr.length-1];
		for(int i=1;i<arr.length;i++)
			smallerArray[i-1]=arr[i];
		
		if(  isContaining7(smallerArray) == true )
			return true;
		else 
		{
			if(arr[0]==7)
				return true;
			else
				return false;
		}
		
		
		
			
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size=s.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter the array : ");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		 if( isContaining7(arr) )
			 System.out.println("yes");
		 else 
			 System.out.println("No");

	}

}
