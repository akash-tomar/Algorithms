package Competitions;

import java.util.Scanner;

public class Round331 {

	public static int getArea() {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int coord[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			coord[i][0]=s.nextInt();
			coord[i][1]=s.nextInt();
		}
		if(n==1) {
			return -1;
		}
		else if(n==2) {
			if(coord[0][0]==coord[0][1]) {
				if(coord[1][0]==coord[1][1]) {
					int len = Math.abs(coord[0][0]-coord[1][0]);
					int bre = Math.abs(coord[0][1]-coord[1][1]);
					return len*bre;
				}
			} else {
				return -1;
			}
		}
		else if(n==3) {
			if(coord[0][0]==coord[1][0]) {
				if(coord[2][1]==coord[1][1]) {
					int len = Math.abs(coord[1][0]-coord[2][0]);
					int bre = Math.abs(coord[0][1]-coord[1][1]);
					return len*bre;
				} else if(coord[2][1]==coord[0][1]) {
					int len = Math.abs(coord[1][0]-coord[2][0]);
					int bre = Math.abs(coord[0][1]-coord[1][1]);
					return len*bre;
				}
			} else if(coord[0][0]==coord[2][0]) {
				if(coord[0][1]==coord[1][1]) {
					int len = Math.abs(coord[1][0]-coord[0][0]);
					int bre = Math.abs(coord[0][1]-coord[2][1]);
					return len*bre;
				} else if(coord[2][1]==coord[1][1]) {
					int len = Math.abs(coord[1
					                         ][0]-coord[2][0]);
					int bre = Math.abs(coord[0][1]-coord[1][1]);
					return len*bre;
				}
			} else if(coord[1][0]==coord[2][0]) {
				if(coord[2][1]==coord[0][1]) {
					int len = Math.abs(coord[1][0]-coord[2][0]);
					int bre = Math.abs(coord[0][1]-coord[1][1]);
					return len*bre;
				} else if(coord[1][1]==coord[0][1]) {
					int len = Math.abs(coord[1][0]-coord[2][0]);
					int bre = Math.abs(coord[0][1]-coord[1][1]);
					return len*bre;
				}
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
