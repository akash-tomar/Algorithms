package recursion_ass;

import java.util.Scanner;

public class SumOfDigits {

	/**
	 * @param args
	 */
	public static int retSum(int n,int deg,int sum){
		if(n%Math.pow(10, deg)==n%Math.pow(10, deg-1))
			return sum;
		
		sum+=(  (n%Math.pow(10, deg) - n%Math.pow(10, deg-1))/Math.pow(10, deg-1)  );
		return retSum(n, deg+1, sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number : ");
		n=s.nextInt();
		System.out.println( retSum(n,1,0) );
	}

}
