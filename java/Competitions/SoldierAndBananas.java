package Competitions;

import java.util.Scanner;

public class SoldierAndBananas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int costOfFirstBanana,totalMoney,bananasNeeded;
		costOfFirstBanana=s.nextInt();
		totalMoney=s.nextInt();
		bananasNeeded=s.nextInt();
		long price=0;
		for(int i=1;i<=bananasNeeded;i++) {
			price+=i*costOfFirstBanana;
		}
		if(price-totalMoney<=0) {
			System.out.println("0");
		} else {
			System.out.println(price-totalMoney);
		}
		
	}

}
