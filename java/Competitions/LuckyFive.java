package Competitions;

import java.util.ArrayList;
import java.util.Scanner;

public class LuckyFive {
	
	public static class Triplets {
		int first;
		int second;
		int third;
	}
	
	
	public static ArrayList<Triplets> triplet(int[] arr) {
		ArrayList<Triplets> list=new ArrayList<Triplets>();
		for(int k=0;k<arr.length;k++) {
			for(int l=k+1;l<arr.length;l++) {
				for(int m=l+1;m<arr.length;m++) {
					if(arr[k]<arr[l] && arr[l]>arr[m]  ) {
						Triplets triple =new Triplets();
						triple.first=k;
						triple.second=l;
						triple.third=m;
						list.add(triple);
					}
				}
			}
		}
	
		return list;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int q;
		n=s.nextInt();
		q=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		ArrayList<Triplets> list=triplet(arr);
		int[] left=new int[q];
		int[] right= new int[q];
		for(int i=0;i<q;i++) {
			left[i]=s.nextInt();
			right[i]=s.nextInt();
			left[i]--;
			right[i]--;
			int count=0;
			for(int j=0;j<list.size();j++) {
				Triplets temp=list.get(j);
				if(arr[left[i]]>arr[temp.first] && arr[temp.third]<arr[right[i]] && left[i]<temp.first && temp.third<right[i]) {
					count++;
				}
				
			}
			System.out.println(count);
			
			
		}
		
	}
}
