package recursion_ass;

import java.util.Scanner;

public class Stairs {

	/**
	 * @param args
	 */
	
	public static int n;
	public static int[] stairMethods = new int[10000];
	public static int noOfMethods(int numberOfStairs) {
		if(stairMethods[numberOfStairs]!=-1) {
			return stairMethods[numberOfStairs];
		}
		
		if(numberOfStairs==1) {
			stairMethods[numberOfStairs]=1;
			return stairMethods[numberOfStairs];
		}
		else if(numberOfStairs==2) {
			stairMethods[numberOfStairs]=2;
			return stairMethods[numberOfStairs];
		}
		else if(numberOfStairs==3) {
			stairMethods[numberOfStairs]=4;
			return stairMethods[numberOfStairs];
		}
		
		return noOfMethods(numberOfStairs-1)+noOfMethods(numberOfStairs-2)+noOfMethods(numberOfStairs-3);
		
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number of stairs : ");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			stairMethods[i]=-1;
		}
		int ans=noOfMethods(n);
		System.out.println(ans);

	}

}
