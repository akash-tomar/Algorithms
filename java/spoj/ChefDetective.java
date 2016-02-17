package spoj;

import java.util.HashMap;
import java.util.Scanner;

public class ChefDetective {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println();
		int n=s.nextInt();
		int[] arr=new int[n];
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			map.put(i+1, i+1);
		}
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.remove(arr[i]);
			}
		}
		for(int i=1;i<=n;i++) {
			if(map.containsKey(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
