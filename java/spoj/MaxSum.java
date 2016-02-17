package spoj;

import java.util.Scanner;

public class MaxSum {
	public static int[][] subSet(int[] arr) {
		if(arr.length==1) {
			int[][] out=new int[2][1];
			out[0][0]=0;
			out[1][0]=arr[0];
			return out;
		}
		int c=arr[0];
		int[] subArray=new int[arr.length-1];
		for(int i=0;i<subArray.length;i++)
			subArray[i]=arr[i+1];
		int[][] subOutput=subSet(subArray);
		int[][] output=new int[subOutput.length*2][subOutput.length];
		int nextSet=0;
		int nextInt=0;
		for(int currentSet=0;currentSet<subOutput.length;currentSet++) {
		    nextInt=0;
			for(int currentInt=0;currentInt<subOutput[currentSet].length;currentInt++) {
				output[nextSet][nextInt]=subOutput[currentSet][currentInt];
				nextInt++;
			}
			nextSet++;
		}
		for(int currentSet=0;currentSet<subOutput.length;currentSet++) {
			nextInt=0;
			output[nextSet][nextInt]=c;
			nextInt++;			
			for(int currentInt=0;currentInt<subOutput[currentSet].length;currentInt++) {
				output[nextSet][nextInt]=subOutput[currentSet][currentInt];
				nextInt++;
			}
			nextSet++;
		}
		return output;
 
 
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		// your code goes here
		int test=s.nextInt();
		for(int t=0;t<test;t++) {
			int n=s.nextInt();
			int m=s.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int[][] sub=subSet(arr);
			int max=0;
			for(int i=0;i<sub.length;i++) {
				int sum=0;
				for(int j=0;j<sub[i].length;j++) {
					sum+=sub[i][j];
					System.out.print(sub[i][j]+" ");
				}
				sum%=m;
				max=Math.max(max,sum);
				System.out.println();
			}
			System.out.println(max);
		}
	}
}
