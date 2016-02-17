package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class LongFactorials {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		BigInteger b = new BigInteger(1+"");
		for(int i=n;i>=1;i--) {
			BigInteger b1=new BigInteger(i+""); 
			b=b.multiply(b1);
		}
		System.out.println(b);
	}
}
