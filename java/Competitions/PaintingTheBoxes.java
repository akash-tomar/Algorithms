package Competitions;

import java.util.Scanner;

public class PaintingTheBoxes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t;
		t=s.nextInt();
		for(int i=0;i<t;i++) {
			
			int n,w;
			n=s.nextInt();
			w=s.nextInt();
			int[] paint = new int[n];
			for(int j=0;j<n;j++) {
				paint[j]=s.nextInt();
			}
			int q;
			q=s.nextInt();
			for(int j=0;j<q;j++) {
				
				int pos;
				int color;
				pos=s.nextInt();
				color=s.nextInt();
				paint[pos-1]=color;
				int numberOfWays=0;
				int prev=paint[0];
				int count=1;
				for(int k=1;k<n;k++) {
					if(paint[k]==prev) {
						count++;
					}
					else{
						if(count>=w)
							numberOfWays+=count-1;
						prev=paint[k];
						count=1;
					}
				}
				if(count>=w)
					numberOfWays+=count-1;
				System.out.println(numberOfWays);
				
				
				
			}
			
			
			
		}

	}

}
