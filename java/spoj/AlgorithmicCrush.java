package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class AlgorithmicCrush {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[] a=new int[m];
		int[] b=new int[m];
		int[] add=new int[m];
		for(int i=0;i<m;i++) {
			a[i]=s.nextInt();
			b[i]=s.nextInt();
			add[i]=s.nextInt();
		}
		BigInteger[] arr=new BigInteger[n];
		for(int i=0;i<n;i++) {
			arr[i]=new BigInteger("0");
		}
		for(int i=0;i<m;i++) {
			for(int j=a[i]-1;j<b[i];j++) {
				arr[j]=arr[j].add(new BigInteger(add[i]+""));
			}
		}
		BigInteger max=new BigInteger("0");
		for(int i=0;i<n;i++) {
			max=max.max(arr[i]);
		}
		System.out.println(max);
	}
}
