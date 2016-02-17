//package Competitions;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class SoldierAndNumberGame {

	/**
	 * @param args
	 */
	public static HashMap<Long, BigInteger> fact = new HashMap<Long, BigInteger>();
	public static BigInteger factorial(long n) {
		if(n==1) {
			return new BigInteger("1");
		}
		if(fact.containsKey(n)) {
			return fact.get(n);
		}
		BigInteger temp=factorial(n-1);
		BigInteger tempN=new BigInteger(""+n);
		fact.put(n,temp.multiply(tempN));
		return temp.multiply(tempN);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//System.out.println(factorial(10));
		int testCase=s.nextInt();
		for(int i=0;i<testCase;i++) {
			
			long a=s.nextLong();
			long b=s.nextLong();
			BigInteger n=factorial(a).divide(factorial(b));
			long count=0;
			long divisor=2;
			
			BigInteger tmp= new BigInteger("1");
			BigInteger tmp1=new BigInteger(""+divisor);
			BigInteger tmp2=new BigInteger("0");
			while(!n.equals(tmp)) {
				if(n.mod(tmp1).equals(tmp2)) {
					n=n.divide(tmp1);
					divisor=2;
					tmp1=new BigInteger(""+divisor);
					count++;
				} else {
					divisor++;
					tmp1=new BigInteger(""+divisor);
				}
			}
			System.out.println(count);
		}

	}

}
