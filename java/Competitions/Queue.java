package Competitions;

import java.util.Arrays;
import java.util.Scanner;

//import Recursion.QuickSort;

public class Queue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
		Arrays.sort(arr);
		int sumSoFar=arr[0];
		int count=1;
		for(int i=1;i<n;i++) {
			if(sumSoFar<=arr[i]) {
				count++;
			}
			sumSoFar+=arr[i];
		}
		System.out.println(count);
	}

}
