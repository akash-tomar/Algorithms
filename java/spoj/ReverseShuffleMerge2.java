package spoj;

import java.util.HashMap;
import java.util.Scanner;

public class ReverseShuffleMerge2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s =new Scanner(System.in);
			String str=s.next();
			HashMap<Character, Integer> countInString = new HashMap<Character, Integer>();
			for(int i=0;i<str.length();i++) {
				if(countInString.containsKey(str.charAt(i))) {
					int temp=countInString.get(str.charAt(i));
					countInString.replace(str.charAt(i), temp+1);
				} else {
					countInString.put(str.charAt(i), 1);
				}
			}
	
			HashMap<Character, Integer> needed = new HashMap<Character, Integer>();
			for(int i=0;i<str.length();i++) {
				if(!needed.containsKey(str.charAt(i))) {
					needed.put(str.charAt(i), countInString.get(str.charAt(i))/2);
				}
			}
			String ans="";
			char min='z';
			int qty=1;
			//System.out.println(needed.get('g'));
			for(int i=str.length()-1;i>=0;i--) {
				if(str.charAt(i)=='a') {
					if(needed.get('a')>0) {
						ans=ans.concat("a");
						int temp=needed.get(str.charAt(i));
						needed.replace(str.charAt(i), temp-1);
					}
				}  
				else if( countInString.get(str.charAt(i)) == needed.get(str.charAt(i))) {
					if(min!='z' && min!=str.charAt(i) && str.charAt(i)>min) {
						for(int j=0;j<qty;j++) {
							if(needed.get(min)>0) {
								ans=ans.concat(min+"");
								int temp=needed.get(min);
								needed.replace(min, temp-1);
							}
						} 
					}
					if(needed.get(str.charAt(i))>0) {
						ans=ans.concat(str.charAt(i)+"");
						int temp=needed.get(str.charAt(i));
						needed.replace(str.charAt(i), temp-1);
						min='z';
						qty=1;
					}
				} 
	
				else if(str.charAt(i)<min) {
					if(needed.get(str.charAt(i))>0) {
						min=str.charAt(i);
	
					}
				} else if(str.charAt(i)==min) {
					qty+=1;
				}
	
				int val=countInString.get(str.charAt(i));
				countInString.replace(str.charAt(i), val-1);
	
			}
			System.out.println(ans);
		}

}
