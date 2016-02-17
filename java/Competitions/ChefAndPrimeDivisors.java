package Competitions;

import hashing.Map;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ChefAndPrimeDivisors {
	public static HashMap<Long, Boolean> map=new HashMap<Long, Boolean>();
	public static boolean isprime(long n) {
		if(n==2 || n==3) {
			return true;
		}
		if(map.containsKey(n)) {
			return map.get(n);
		}
		for(long i=2;i<n/2;i++) {
//			String temp=i+"";
//			BigInteger temp1=new BigInteger(temp);
			if(n%i==0) {
				map.put(n, false);
				return false;
			}
		}
		map.put(n, true);
		return true;
	}

	public static ArrayList<Integer> factors(BigInteger n) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		//arr.add(1);
		String temp3=1+"";
		BigInteger temp4=new BigInteger(temp3);
		if(n.equals(temp4)) {
			return arr;
		}
		temp3=2+"";
		temp4=new BigInteger(temp3);
		if(n.equals(temp4)) {
			arr.add(2);
			return arr;
		}
		int i=2;
		while(true) {
			String temp=i+"";
			BigInteger temp1=new BigInteger(temp);
			String stst="0";
			BigInteger dec=new BigInteger(stst);
			if(n.mod(temp1).equals(dec)) {
				n=n.divide(temp1);
				if(isprime(i)) {
					arr.add(i);
				}
				i=2;
				continue;
			}
			i++;
			temp3=1+"";
			temp4=new BigInteger(temp3);
			if(n.equals(temp4)) 
				break;
		}
		return arr;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		//int t=1;
		for(int i=0;i<t;i++) {
			String c=s.nextLine();
			String a=s.next();
			String b=s.next();
			boolean z=false;
			BigInteger A = new BigInteger(a);
			BigInteger B = new BigInteger(b);
			ArrayList<Integer> divisors = factors(B);
			for(int j=0;j<divisors.size();j++) {
				String temp=divisors.get(j)+"";
				BigInteger temp1=new BigInteger(temp);
				String stst="0";
				BigInteger dec=new BigInteger(stst);
				if(!A.mod(temp1).equals(dec)) {
					System.out.println("No");
					z=true;
					break;
				}
			}
			if(z)
				break;
			System.out.println("Yes");
		}
		return;
	}
}
