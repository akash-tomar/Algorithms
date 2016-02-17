package assigments;

import java.util.Scanner;

public class tripletsSumToA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
			for(int j=i+1;j<size;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					if( arr[i]+arr[j]+arr[k]==sum)
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
			}
		}
	}

}
