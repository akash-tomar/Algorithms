package Competitions;

import java.util.Scanner;

public class OneInZillion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int x=s.nextInt();
			int deg=x/30;
			System.out.println((int)Math.pow(2, 1+deg));
			
		}
	}

}
