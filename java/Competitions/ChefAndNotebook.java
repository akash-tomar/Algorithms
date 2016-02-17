package Competitions;

import java.util.Scanner;

public class ChefAndNotebook {

	/**
	 * @param args
	 */
	
	public static boolean subSet(int[] arr,int[] pages,int totalMoney,int pagesRequired) {
		if(arr.length==1) {
			if(totalMoney>=arr[0]) {
				if(pages[0]>=pagesRequired)
					return true;
			}
			
		}
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t;
		t=s.nextInt();
		for(int i=0;i<t;i++) {
			int x,y,k,n;
			
			
			x=s.nextInt();
			y=s.nextInt();
			k=s.nextInt();
			n=s.nextInt();
			int[] pages=new int[n];
			int[] price=new int[n];
			for(int j=0;j<n;j++)
			{	
				pages[j]=s.nextInt();
				price[j]=s.nextInt();
				
			}
			int[][] combs=subSet(price,pages,k,x-y);
			
			
			
			
		}

	}

}
