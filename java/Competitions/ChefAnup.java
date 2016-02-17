package Competitions;

import java.util.Scanner;

public class ChefAnup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t;
		t=s.nextInt();
		for(int i=0;i<t;i++) {
			
			int n,k,l;
			n=s.nextInt();
			k=s.nextInt();
			l=s.nextInt();
			int[] arr=new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=1;
			}
			int pos=n-1;
			for(int j=1;j<=l;j++) {
				
				if(arr[pos]+1<=k) {
					arr[pos]++;
				}
				else {
					arr[pos]=1;
					pos--;
				}
				
				
			}
			
			
			
			
		}

	}

}
