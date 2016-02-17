package spoj;

import java.awt.Window.Type;
import java.util.HashMap;
import java.util.Scanner;

public class CommonChild {
	
	public static char[][] subSet(char[] arr) {
		if(arr.length==1) {
			char[][] out=new char[2][1];
			out[0][0]=' ';
			out[1][0]=arr[0];
			return out;
		}
		char c=arr[0];
		char[] subArray=new char[arr.length-1];
		for(int i=0;i<subArray.length;i++)
			subArray[i]=arr[i+1];
		char[][] subOutput=subSet(subArray);
		char[][] output=new char[subOutput.length*2][subOutput.length];
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
		String a=s.next();
		String b=s.next();
		char arr1[]=new char[a.length()];
		char arr2[]=new char[b.length()];
		for(int i=0;i<a.length();i++) {
			arr1[i]=a.charAt(i);
		}
		for(int i=0;i<b.length();i++) {
			arr2[i]=b.charAt(i);
		}
		char[][] ans1=subSet(arr1);
		char[][] ans2=subSet(arr2);
		
		
		
	}

}
