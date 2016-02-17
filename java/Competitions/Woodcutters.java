//package Competitions;

import java.util.Scanner;

public class Woodcutters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		long[] coord=new long[n];
		long[] height=new long[n];
		int count=0;
		int prev=-1;
		for(int i=0;i<n;i++) {
			coord[i]=s.nextLong();
			height[i]=s.nextLong();
		}
		if(n==1) {
			System.out.println("1");
			return;
		}
		for(int i=1;i<n-1;i++) {
			if(prev!=1) {
				if( height[i]<(coord[i]-coord[i-1]) ) {
					prev=-1;
					count++;
				} 
				else if( height[i]<(coord[i+1]-coord[i]) ) {
					prev=1;
					count++;
				}
				else {
					prev=0;
				}
			}
			else if(prev==1) {
				if( height[i]<(coord[i+1]-coord[i]) ) {
					prev=1;
					count++;
				} else {
					prev=0;
				}
			}	
		}
		System.out.println(2+count);
	}
}
