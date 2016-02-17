package recursion_ass;

import java.util.Scanner;

public class Multiply_by_addition {

	/**
	 * @param args
	 */
	
	//public static long prod=0;
	public static long multiply(int a,int b,int count)
	
	{
		if(count>b)
			return 0;
		return a+multiply(a, b, count+1);
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first no : ");
		a=s.nextInt();
		System.out.println("Enter the second no : ");
		b=s.nextInt();
		if(a>b)
			System.out.println(multiply(a,b,1));
		else
			System.out.println(multiply(b,a,1));

	}

}
