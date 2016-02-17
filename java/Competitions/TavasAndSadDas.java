package Competitions;

import java.util.Scanner;

public class TavasAndSadDas {
	public static int count=2;
	public static String[] indexOfLuckyNumber(String[] str,String n) {
//		if(str=="") {
//			String[] output=new String[2];
//			output[0]="4";
//			output[1]="7";
//			return output;
//		}
		String[] outputSoFar=str;
		String[] output=new String[2*outputSoFar.length];
		for(int i=0;i<outputSoFar.length;i++) {
			output[i]="4"+outputSoFar[i];
			count++;
			if(output[i].equals(n))
                return output;
		}
		for(int i=0;i<outputSoFar.length;i++) {
			output[outputSoFar.length+i]="7"+outputSoFar[i];
			count++;
			if(output[outputSoFar.length+i].equals(n))
                return output;
		}
		
		
		
		return indexOfLuckyNumber(output, n);
		
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if(n==4)
			System.out.println("1");
		else if(n==7)
			System.out.println("2");
		else {
			String str=""+n;
			String[] output=new String[2];
			output[0]="4";
			output[1]="7";
			indexOfLuckyNumber(output,str);
			int counts=2;
//			for(int i=0;i<arr.length;i++){
//				if(arr[i]!=null)
//					counts++;
//				else
//					break;
//			}
			System.out.println(count);
		}
	}
}
