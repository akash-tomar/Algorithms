package spoj;

import java.util.Scanner;

public class InfiniteSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long i = 1;
		long sum=1;
		while(true) {
			i++;
			sum+=i;
			if(sum>=n) {
				break;
			}
		}
		long diff=sum-n;
		for(int j=0;j<diff;j++) {
			i--;
		}
		System.out.println(i);
		
		
		
	}

}
