package spoj;

import java.util.Scanner;

import dataStructures.MinStack;

public class SnakesLadders {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int t=s.nextInt();
		for(int test=0;test<t;test++) {

			//init board
			Boolean sl[][] = new Boolean[101][101];
			for(int i=1;i<=100;i++) {
				for(int j=1;j<=100;j++) {
					sl[i][j]=false;
				}
			}

			//ladders
			int n=s.nextInt();
			for(int i=0;i<n;i++) {
				int a=s.nextInt();
				int b=s.nextInt();
				sl[a][b]=true;
			}

			//snakes
			int m=s.nextInt();
			for(int i=0;i<m;i++) {
				int a=s.nextInt();
				int b=s.nextInt();
				sl[a][b]=true;
			}

			int start=1;
			int trials=0;
			boolean minusOne=false;
			while(start<100) {
				int max=start;
				
				//check for ladder
				for(int i=1;i<=6;i++) {
					int temp=start+i;
					for(int j=temp+1;j<=100;j++) {
						if(sl[temp][j]) {
							max=Math.max(max, j);
						}
					}
				}
				
				//check for snake if no ladder
				if(max==start) {
					int incr=6;
					for(int j=1;j<=6;j++) {
						if(start+incr<=100) {
							boolean z=true;
							int temp=start+incr;
							for(int i=1;i<=temp-1;i++) {
								if(sl[temp][i]) {
									incr--;
									z=false;
									break;
								} 
							}
							if(z) {
								break;
							}
							if(j==6) {
								minusOne=true;
								break;
							}
						} else {
							incr--;
						}
					}
					start=start+incr;
				}//check for snake ends.
				else {
					start=max;
				}
				
				if(minusOne) {
					break;
				}
				trials++;
			}	
			if(minusOne) {
				System.out.println("-1");
			} else {
				System.out.println(trials);
			}		
		}


	}

}
