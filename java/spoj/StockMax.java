package spoj;

import java.util.Scanner;

public class StockMax {
	static int p[] = new int[50000];
	public static int maxProfit(int[] arr,int index,int stocks,int profits) {
		if(index>=arr.length-1) {
			int p_sell=profits+stocks*arr[index];
			int p_nothing=profits;
			p[index]= Math.max(p_sell, p_nothing);
			return p[index];
		}
		
		if(p[index]!=Integer.MIN_VALUE) {
			return p[index];
		}
		
		int p_buy = maxProfit(arr, index+1,stocks+1,profits-arr[index]);
		
		int p_sell=maxProfit(arr, index+1, 0, profits+stocks*arr[index]);
		
		int p_nothing=maxProfit(arr, index+1, stocks, profits);
		
		p[index]= Math.max(p_buy, Math.max(p_sell, p_nothing));
		return p[index];
	}
	
	
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int t=s.nextInt();
		for(int test=0;test<t;test++) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				p[i]=Integer.MIN_VALUE;
			}
			System.out.println(maxProfit(arr, 0, 0,0));
		}
	}
}
