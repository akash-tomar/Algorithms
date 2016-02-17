package ArraysAndStringsAss;

import java.util.Scanner;

public class SeparateZeroAndOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size=s.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array : ");
		int begin=0;
		int end=arr.length-1;
		for(int i=0;i<size;i++) {
			int num;
			num=s.nextInt();
			if(num==0) {
				arr[begin]=num;
				begin++;
			}
			else {
				arr[end]=num;
				end--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}