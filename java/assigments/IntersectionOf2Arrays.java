package assigments;

import java.util.Scanner;

public class IntersectionOf2Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int size1,size2;
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of first array : ");
		size1=s.nextInt();
		int[] arr1=new int[size1];
		System.out.println("Enter the first array : ");
		for(i=0;i<size1;i++)
			arr1[i]=s.nextInt();
		System.out.println("Enter the size of second array : ");
		size2=s.nextInt();
		int[] arr2=new int[size2];
		System.out.println("Enter the second array : ");
		for(j=0;j<size2;j++)
			arr2[j]=s.nextInt();		
		for(i=0;i<size1;i++)
		{
			for(j=0;j<size2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr2[j]);
					break;
				}
			}
		}
		
		
		
	}

}
