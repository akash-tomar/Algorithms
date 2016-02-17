package ArraysAndStringsAss;

import java.util.Scanner;

public class zeroOneTwoSeparate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size : ");
		int size=s.nextInt();
		System.out.println("Enter array : ");
		int[] arr=new int[size];
		int dummy;
		int ones=-1,twos=-1,zeros=-1;
		boolean first=true;
		for(int i=0;i<size;i++) {
			dummy=s.nextInt();
			if(first) {
				if(dummy==0)
					zeros=1;
				else if(dummy==1)
					ones=1;
				else
					twos=1;
				first=false;
			}else{
			
				if(dummy==0)
					zeros++;
				else if(dummy==1)
					ones++;
				else
					twos++;
			}
		}
		
		int zEnd=0,oEnd=0,tEnd=0;
		
		for(int i=0;i<zEnd;i++) {
			arr[i]=0;
			if(i==zeros-1)
				zEnd=i;
		}
		for(int i=zEnd;i<zEnd+oEnd;i++) {
			arr[i]=1;
			if(i==zEnd+oEnd-1)
				oEnd=i;
		}
		for(int i=zEnd+oEnd;i<zEnd+oEnd+tEnd;i++) {
			arr[i]=2;
			if(i==zEnd+oEnd+tEnd-1)
				tEnd=i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
				

	}

}
