package recursion_ass;

import java.util.Scanner;

//import Recursion.powerOfX_N;

public class SumOfGP {

	/**
	 * @param args
	 */
	
	public static long pow(int a,int b)
	{
		long prod=1;
		for(int i=1;i<=b;i++)
			prod*=a;
		return prod;
	}
	
	public static double gP(int k)
	{
		if(k==0)
			return 1.0;
		return (1.0/pow(2,k)+gP(k-1));//,count+1));
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k;
		k=s.nextInt();
		System.out.println(gP(k));
		
		

	}

}
