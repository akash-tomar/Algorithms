package Competitions;

import java.util.Scanner;

public class PerfectHiring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int p=s.nextInt();
		int x=s.nextInt();
		//int[] arr=new int[n];
		int max=-1;
		int maxID=-1;
		for(int i=0;i<n;i++) {
			int arr=s.nextInt();
			int score=p*arr;
			if(max<score) {
				max=score;
				maxID=i+1;
			}
			p-=x;
		}
		System.out.println(maxID);

	}

}
