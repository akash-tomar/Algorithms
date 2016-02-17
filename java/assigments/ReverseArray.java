package assigments;

import java.util.Scanner;

public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array : ");
		size=s.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int i,j;
		for(i=0,j=size-1;i<j;i++,j--)
		{
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		System.out.println("Reverse array is : ");
		for(i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		
		

	}

}
