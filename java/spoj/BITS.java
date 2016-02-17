package spoj;

import java.util.Scanner;

public class BITS {

	
	public static int[][] coin=new int[251][51];
	public static int coinChange(int amountToBeMade,int index, int[] coins,int steps) {
		if( amountToBeMade < 0 ) {
			return 0;
		}
		if( amountToBeMade == 0 ) {
			return 1;
		}
		if( index<0 ) {
			return 0;
		}
		if(coin[amountToBeMade][index]!=-1) {
			return coin[amountToBeMade][index];
		}
		coin[amountToBeMade][index]=coinChange(amountToBeMade, index-1, coins,steps+1)+coinChange(amountToBeMade-coins[index], index, coins,steps+1);		
		return coin[amountToBeMade][index];
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int test=0;test<t;test++) {
			long n=s.nextLong();
			long MODULO=(long)Math.pow(10, 9)+7;
			long ans=1;
			for(int i=1;i<=n;i++) {
				ans*=( Math.pow(i, n-(i-1)) )%MODULO;
				ans%=MODULO;
			}
			System.out.println(ans);
		}
	}

}
