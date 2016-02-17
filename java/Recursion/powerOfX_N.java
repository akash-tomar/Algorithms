package Recursion;

import java.util.Scanner;

public class powerOfX_N {

	/**
	 * @param args
	 */
	
	public static long  power(int x,int n)
	{
		if(n==1)
			return x;
		return x*power(x,n-1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		x=s.nextInt();
		System.out.println("Enter the value of n : ");
		n=s.nextInt();
		System.out.println("Value is : "+power(x,n));
	}

}
