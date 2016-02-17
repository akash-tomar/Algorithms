package assigments;

import java.util.Scanner;

public class SumX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size;
		size=s.nextInt();
		System.out.println("Enter the size of the array : ");
		int[] arr=new int[size];
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Eneter the element : ");
		int sum;
		sum=s.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				if(arr[i]+arr[j]==sum)
					System.out.println(arr[i]+" "+arr[j]);
			}
		}
		
		
		
		
		
		
		
	}

}
