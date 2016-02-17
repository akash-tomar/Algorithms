package Competitions;

import java.util.Arrays;
import java.util.Scanner;

import Recursion.MergeSort;
import Recursion.QuickSort;

public class SetDifference {
	
	public static int[][] subSet(int[] arr) {
		if(arr.length==1) {
			int[][] out=new int[2][1];
			out[0][0]=-1;
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
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int testCase=0;testCase<t;testCase++) {
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			//MergeSort m = new MergeSort();
			//Arrays.sort(arr);
			//m.mergeSort(arr, 0, arr.length-1);
			int[][] output=subSet(arr);
			long count=0;
			for(int i=0;i<output.length;i++) {
				int min=Integer.MAX_VALUE;
				int max=Integer.MIN_VALUE;
				for(int j=0;j<output[i].length;j++) {
					if(output[i][j]!=0 && output[i][j]!=-1) {
						if(output[i][j]<min) {
							min=output[i][j];
						}
						if(max<output[i][j]) {
							max=output[i][j];
						}
					}
				}
				if(max!=Integer.MIN_VALUE && min!=Integer.MAX_VALUE)
					count+=max-min;
			}
			System.out.println(count%(Math.pow(10, 9)+7));
		}
	}
}
