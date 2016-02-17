package lectures;

import java.util.Scanner;

public class primenumbers {

	/**
	 * @param args
	 */
	static boolean prime(int n)
	{
		for(int i=3;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
			//else
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the number upto which prime has to be printed : ");
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		System.out.print('2'+ " ");
		for(int i=3;i<=n;i++)
		{
			if( prime(i) )
				System.out.print(i+ " ");
		}

	}

}
