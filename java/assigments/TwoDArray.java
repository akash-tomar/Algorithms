package assigments;

import java.util.Scanner;

public class TwoDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] arr= new int[3][3];
		System.out.println("Enter the no of rows : ");
		int rows=s.nextInt();
		System.out.println("Enter the no of columns : ");
		int columns=s.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
				arr[i][j]=s.nextInt();
		}
		
		for(int j=0;j<columns;j++)
		{
			for(int i=0;i<rows;i++)
			{
				if(j%2==0)
				{
					System.out.println(arr[i][j]);
				}
				else
					System.out.println(arr[rows-1-i][j]);
			}
		}
		
		
		

	}

}
