package spoj;

import java.util.Scanner;

public class PrimeGenerator {
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		} else if(n==2) {
			return true;
		} else {
			for(int i=3;i<=Math.sqrt(n);i+=2) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean primes[]=new boolean[100000];
	static boolean isMarked[]=new boolean[100000];
	public static void makePrimes() {
		primes[1]=false;
		isMarked[1]=true;
		for(int i=2;i<100000;i++) {
			if(!isMarked[i]) {
				primes[i]=isPrime(i);
				isMarked[i]=true;
				int count=1;
				while(true) {
					if(i*count>=100000) {
						break;
					}
					isMarked[i*count]=true;
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int test=s.nextInt();
		makePrimes();
		for(int t=0;t<test;t++) {
			int a=s.nextInt();
			int b=s.nextInt();
			for(int i=a;i<=b;i++) {
				if(i<100000) {
					if(primes[i]) {
						System.out.println(i);
					}
				} else {
					if(i%6==5 || i%6==1) {
						if(isPrime(i)) {
							System.out.println(i);
						}
					}
				}
			}
			System.out.println();
		}
	}

}
