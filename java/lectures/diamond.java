package lectures;

import java.util.Scanner;

public class diamond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		int min=Integer.MIN_VALUE;
		System.out.println(min);
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		boolean first=true;
		for(int rows = 1;rows <= n;rows ++)
		{
			for(int spaces=0;spaces<n-rows;spaces++)
			{
				System.out.print(" ");
			}
			
			if(first)
			{
				System.out.print("*");
				first=false;
			}
			else
			{
				for(int k=1;k<=rows;k++)
				{
					System.out.print("*"+ " ");
				}
				
			}
			
			
			System.out.println();
			
		}
		
		for(int rows=n-1;rows>=1;rows--)
		{
			for(int k=1;k<=n-rows;k++)
				System.out.print(" ");
			for(int k=1;k<=rows;k++)
				System.out.print("*"+ " ");
			System.out.println();
		}
			
			
			
			
			
			
			
			
		}

	}


