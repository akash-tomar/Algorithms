package Competitions;

import java.util.HashMap;
import java.util.Scanner;

public class IceCreamParlor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int testCase=0;testCase<t;testCase++) {
			int m=s.nextInt();
			int n=s.nextInt();
			int[] arr=new int[n];
			HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				map.put(arr[i], i+1);
			}
			for(int i=0;i<n;i++) {
				if(map.containsKey((m-arr[i]))) {
					System.out.println(i+1 +" "+map.get(m-arr[i]));
					break;
				}
			}
		}
	}
}
