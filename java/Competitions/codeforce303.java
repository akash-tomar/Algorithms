package Competitions;

import java.util.Scanner;

public class codeforce303 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		boolean[] carArr=new boolean[n];
		for(int i=0;i<n;i++) 
			carArr[i]=true;
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) 
			for(int j=0;j<n;j++) 
				arr[i][j]=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>j) {

					//					if(arr[i][j]==0) {
					//						if(carArr[i]!=false)
					//							carArr[i]=true;
					//						if(carArr[j]!=false)
					//							carArr[j]=true;

				}
				//					else
				if(arr[i][j]==1) {
					carArr[i]=false;
				}
				else if(arr[i][j]==2)
					carArr[j]=false;
				else if(arr[i][j]==3) {
					carArr[i]=false;
					carArr[j]=false;
				}
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(carArr[i])
				count++;
		}
		System.out.println(count);
		for(int i=0;i<n;i++) {
			if(carArr[i])
				System.out.print(i+1+" ");
		}
	}
}


