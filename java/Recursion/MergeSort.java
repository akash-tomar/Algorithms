package Recursion;

import java.util.Scanner;

public class MergeSort {

	/**
	 * @param args
	 */
	
	public static void mergeSort(int[] arr,int begin,int end)
	{
		if(begin>=end)
			return;
		int mid=(begin+end)/2;
		mergeSort(arr, begin, mid);
		mergeSort(arr, mid+1, end);
		merge(arr,begin,mid,end);
	}
	
	public static void merge(int[] arr,int begin,int mid,int end)
	{
		int lsize=mid-begin+1;
		int rsize=end-mid;
		
		int[] larr=new int[lsize];
		int[] rarr=new int[rsize];
		int i,j;
		for(i=0;i<lsize;i++)
		{	
			larr[i]=arr[begin+i];
		}
		for(j=0;j<rsize;j++)
		{
			rarr[j]=arr[mid+j+1];
		}
		
		i=j=0;
		for(int k=begin;k<=end;k++)
		{
			if(larr[i]<rarr[j])
			{
				arr[k]=larr[i];
				//if(i+1<larr.length)
					i++;
			}
			else if(rarr[j]<larr[i])
			{
				arr[k]=rarr[j];
				//if(j+1<rarr.length)
					j++;
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size=s.nextInt();
		System.out.println("Enter the array : ");
		int[] arr = new int[size];
		for( int i=0;i<size;i++)
			arr[i]=s.nextInt();
		mergeSort(arr,0,size-1);
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);

	}

}
