package lectures;

import java.util.Scanner;

public class SumInLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the no of i/p : ");
			int n=s.nextInt();
			int sum=0;
			for(int i=0;i<n;i++)
			{
				sum+=s.nextInt();
			}
			System.out.print(sum);

	}

}
