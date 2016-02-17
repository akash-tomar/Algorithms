package assigments;

import java.util.Scanner;

public class DecToBin {

	/**
	 * @param args
	 */
	
	public static int[] bin = new int[100000];
	public static int pos=0;
	public static void decToBin(int n)
	{
		if(n==1 || n==0)
			bin[pos]=n;
		else
		{
			bin[pos]=n%2;
			pos++;
			n=n/2;
			decToBin(n);
		}
	}
	
	
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		decToBin(n);
		for(int i=pos;i>=0;i--)
			System.out.print(bin[i]);
		

	}

}
