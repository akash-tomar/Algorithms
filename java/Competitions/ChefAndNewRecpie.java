package Competitions;

import java.util.Scanner;

public class ChefAndNewRecpie {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int testCase=0;testCase<t;testCase++) {
			int n=s.nextInt();
			int[] arr=new int[n];
			int min=Integer.MAX_VALUE;
			int pos=-1;
			int count=0;
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				if(arr[i]<min) {
					min=arr[i];
					pos=i;
				}
			}
			if(min<2)
				System.out.println("-1");
			else {
				for(int i=0;i<n;i++) {
					if(i!=pos) {
						count+=arr[i];
					}
				}
				count+=2;
				System.out.println(count);
			}
				
			
			
		}
	}
}
