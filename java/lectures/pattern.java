package lectures;

import java.util.Scanner;

public class pattern {

	
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		int term=1;
		boolean first=true;
		for(int rows=1;rows<=n;rows++)
		{
			for(int spaces=0;spaces<n-rows;spaces++)
			{
				System.out.print(" ");
			}
			if(first)
			{
				for(int z=rows;z<=term;z++)
				{
					System.out.print(z);
				}	
				first=false;
				System.out.println();
			}
			else
			{
				term+=2;
				for(int z=rows;z<=term;z++)
			    {
				   System.out.print(z);
			    }
			    for(int z=term-1;z>=rows;z--)
				    System.out.print(z);
			
			    System.out.println();
			    
		    }
		}

	}

}
