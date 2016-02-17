package Competitions;

import java.util.HashMap;
import java.util.Scanner;

public class SetOFStrings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k=s.nextInt();
		String q=s.next();
		int count=0;
		HashMap<Character, Boolean> map=new HashMap<Character, Boolean>();
		for(int i=0;i<q.length();i++) {
			if(map.containsKey(q.charAt(i))) {
				continue;
			}
			else {
				map.put(q.charAt(i), true);
				count++;
			}
		}
		if(count>=k) {
			int temp=0;
			int pos=-1;
			HashMap<Character, Boolean> map1 = new HashMap<Character, Boolean>();
			System.out.print("YES");
			for(int i=0;i<q.length();i++) {
				if(!map1.containsKey(q.charAt(i))) {
					System.out.println();
					System.out.print(q.charAt(i));
					map1.put(q.charAt(i), true);
					temp++;
					pos=i;
				} else {
					System.out.print(q.charAt(i));
				}
				if(temp>=k) {
					break;
				}
			}
			for(int i=pos+1;i<q.length();i++) {
				System.out.print(q.charAt(i));
			}
		} else {
			System.out.println("NO");
		}
	}
}
