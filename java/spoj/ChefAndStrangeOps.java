package spoj;

import java.awt.Polygon;
import java.io.BufferedReader;
import java.util.Scanner;

public class ChefAndStrangeOps {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int test=0;test<t;test++) {
			int n=s.nextInt();
			int x=s.nextInt();
			x=x-1;
			int m=s.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			for(int i=0;i<m;i++) {
				for(int j=1;j<=x;j++) {
					arr[j]=arr[j]+arr[j-1];
				}
			}
			System.out.println(arr[x]);
			
		}
	}
}
