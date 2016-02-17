package ArraysAndStringsAss;

import java.util.Scanner;

public class ClockWiseRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size=s.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the array : ");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int min=arr[0];
		int pos=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				pos=i;
			}
		}
		System.out.println("clockwise degree of rotation is : "+pos);
		
	}

}
