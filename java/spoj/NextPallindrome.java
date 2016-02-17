package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class NextPallindrome {
	public static boolean isPallindrome(BigInteger b) {
		String str;
		
		str=b.toString();
		int i=0;
		int j=str.length()-1;
		while(true) {
			if(i>j) {
				break;
			}
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int test=0;test<t;test++) {
			String str=new String();
			str=s.next();
			BigInteger i = new BigInteger(str);
			while(true) {
				BigInteger b1=new BigInteger("1");
				i=i.add(b1);
				if(isPallindrome(i)) {
					break;
				}
				
			}
			System.out.println(i);
		}

	}

}
