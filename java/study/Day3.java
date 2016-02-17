package study;

import java.util.*;
import java.io.*;
//import java.util.Scanner;

public class Day3 {
	//public static void sort(String str) {
		/*
	}
		for(int i=0;i<str.length();i++) {
			char min=str.charAt(i);
			int index=i;
			for(int j=i;j<str.length();j++) {
				if(str.charAt(j)<min) {
					min=str.charAt(j);
					index=j;
				}
			}
			if(index!=i) {
				String newstring;
				newstring=str.substring(0,i);
				newstring=newstring.concat(str.charAt(index)+"");
				if((i+1)<str.length() && (i+1)<=index) {
					newstring=newstring.concat(newstring.substring(i+1,index)+"");
				}
				newstring=newstring.concat(str.charAt(i)+"");
				if(index+1<str.length())
					newstring=newstring.concat(newstring.substring(index+1));
				str=newstring;
			}
		}
	}
*/
		
	
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		int n=s.nextInt();
		int[] t=new int[n];
		int[] d=new int[n];
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			t[i]=s.nextInt();
			d[i]=s.nextInt();
			arr[i]=t[i]+d[i];
			map.put(arr[i], i+1);
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			int min=arr[i];
			int index=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[index]=temp;
			//System.out.println(index+1);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(map.get(arr[i])+" ");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
