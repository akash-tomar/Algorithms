package Competitions;

import java.util.Scanner;

public class LightBulbs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int key=1;
			while(true){
				long keys=key*key;
				if(keys<=n){
					System.out.print(keys+" ");
				}
				else 
					break;
				key++;
			}
			System.out.println();
			
			
			
		}
		

	}

}
